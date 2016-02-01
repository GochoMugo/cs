/**
 * The main application with the main entry point. Interfacing with the user
 * is handled with the App class.
 */

package addressbook;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
    public static JSONObject loadSettings() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("settings.json"));
        JSONObject settings = (JSONObject) obj;
        return settings;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // process command-line arguments
        if (args.length != 1) {
            System.out.println("usage: 'search term'");
            System.out.println("  example: 'john'");
            System.exit(1);
        }

        String searchTerm = args[0];

        // load settings first
        JSONObject settings = null;
        try {
            System.out.println(" # load application settings");
            settings = loadSettings();
        } catch (IOException e) {
            System.out.println("Exception handling settings file");
            e.printStackTrace();
            System.exit(1);
        } catch (ParseException e) {
            System.out.println("Exception parsing JSON");
            e.printStackTrace();
            System.exit(1);
        }

        // load data from database
        Data data = new Data(settings);
        ArrayList<Contact> contactlist = null;
        try {
            System.out.println(" # load data from database");
            contactlist = data.load();
        } catch (SQLException e) {
            System.out.println("Exception loading items from database");
            e.printStackTrace();
            System.exit(1);
        }

        // to be fair to all algorithms, we shall sort the list
        Collections.sort(contactlist, new ContactComparator());

        // create tests
        long rounds = (Long) settings.get("algo_rounds");
        TestRunner runner1 = new TestRunner((ArrayList<Contact>) contactlist.clone(), (int) rounds);
        TestRunner runner2 = new TestRunner((ArrayList<Contact>) contactlist.clone(), (int) rounds);
        int foundIndex1 = -1;
        int foundIndex2 = -1;

        // using the search term, search for the user
        System.out.println(" # running binary search");
        foundIndex1 = runner1.run(new BinarySearch(), new SearchContact(searchTerm));
        System.out.println(" # running linear search");
        foundIndex2 = runner2.run(new LinearSearch(), new SearchContact(searchTerm));

        // ensure nothing funny happened
        if (foundIndex1 != foundIndex2) {
            System.out.println("Algos returned different indices");
            System.out.println("  Binary: " + foundIndex1);
            System.out.println("  Linear: " + foundIndex2);
            System.exit(1);
        }

        // time to write results/stats for user
        System.out.println();
        System.out.println(" >>> Binary:  " + runner1.getTime() + " ns (" + runner1.getRounds() + " rounds)");
        System.out.println(" >>> Linear:  " + runner2.getTime() + " ns (" + runner2.getRounds() + " rounds)");

        String describe = "slower";
        if (runner1.getTime() < runner2.getTime()) {
            describe = "faster";
        }
        System.out.println(" >>> Binary search is " + describe + " than Linear search");
        System.out.println();

        if (foundIndex1 != -1) {
            Contact contact = contactlist.get(foundIndex1);
            System.out.println("User found:");
            System.out.println("  First Name:    " + contact.getFirstName());
            System.out.println("  Last Name:     " + contact.getLastName());
            System.out.println("  Phone Number:  " + contact.getPhoneNumber());
            System.out.println("  Email Address: " + contact.getEmailAddress());
            System.out.println("  Home Address:  " + contact.getHomeAddress());
            System.out.println("");
        } else {
            System.out.println("User not found!");
            System.exit(1);
        }

        try {
            data.close();
        } catch (SQLException e) {
            System.out.println("Exception while closing data connection");
            e.printStackTrace();
            System.exit(1);
        }
    }
}


 class SearchContact implements Compare<Contact> {
    private String name;

    public SearchContact(String name) {
        this.name = name;
    }

    public int compare(Contact contact) {
        return this.name.compareToIgnoreCase(contact.getFirstName());
    }
}
