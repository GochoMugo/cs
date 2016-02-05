/**
 * A Comparator class used in sorting the contact lists
 */

package addressbook;

import java.util.Comparator;

public class ContactComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
        String name1 = c1.getFullName();
        String name2 = c2.getFullName();
        return name1.compareToIgnoreCase(name2);
    }
}
