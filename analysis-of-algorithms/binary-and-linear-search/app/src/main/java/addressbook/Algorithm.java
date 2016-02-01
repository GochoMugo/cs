/**
 * An interface that all algorithms must implement
 */

package addressbook;

import java.util.ArrayList;

public interface Algorithm<T> {
    int exec(ArrayList<T> items, Compare<T> compare) throws Exception;
}
