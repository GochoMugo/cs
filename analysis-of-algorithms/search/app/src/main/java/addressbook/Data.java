/**
 * Handling operations with the backing data store
 */

package addressbook;

import java.sql.*;
import java.util.ArrayList;

import org.json.simple.JSONObject;

public class Data {
    private JSONObject settings;
    private Connection connection;
    private boolean ready;

    public Data(JSONObject settings) {
        this.settings = settings;
    }

    /**
     * @param settings - data settings
     * @return this - useful for chaining
     */
    public Data setSettings(JSONObject settings) {
        this.settings = settings;
        this.ready = false;
        return this;
    }

    /**
     * Load data from backing store
     */
    public ArrayList<Contact> load() throws SQLException {
        // create a db connection, if we have none
        if (!this.ready) {
            String url = (String) this.settings.get("db_url");
            String username = (String) this.settings.get("db_user");
            String password = (String) this.settings.get("db_pass");
            this.connection = DriverManager.getConnection(url, username, password);
            this.ready = true;
        }

        // create a contact list and load from database
        ArrayList<Contact> contactlist = new ArrayList<Contact>();
        Statement stmt = this.connection.createStatement();
        String table = (String) this.settings.get("db_table");
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM " + table);

        // actually loading from database
        while (resultSet.next()) {
            contactlist.add(new Contact(resultSet.getString("first_name"), resultSet.getString("last_name"),
                        resultSet.getString("phone_number"), resultSet.getString("email_address"),
                        resultSet.getString("home_address")));
        }

        // close the result set
        resultSet.close();

        // return the list
        return contactlist;
    }

    /**
     * Close data instance
     */
    public void close() throws SQLException {
        this.connection.close();
    }
}
