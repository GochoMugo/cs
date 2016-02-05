/**
 * An interface that is used to determine if an element is found in a list.
 * This should be implemented for comparing the item in cursor with the user's
 * search term.
 */

package addressbook;

public interface Compare<T> {
    public int compare(T item);
}
