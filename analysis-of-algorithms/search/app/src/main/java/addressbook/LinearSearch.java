/**
 * The Linear Search algorithm
 */

package addressbook;

import java.util.ArrayList;

public class LinearSearch implements Algorithm<Object> {
    /**
     * Execute the linear search
     *
     * @param items - list of items
     * @param compare - function called to compare two items
     * @return index of the found item in the list
     * @throws Exception if item is not found
     */
    public int exec(ArrayList<Object> items, Compare<Object> compare) throws Exception {
        int size = items.size();

        for (int index = 0; index < size; index++){
            Object item = items.get(index);
            int result = compare.compare(item);

            if (result == 0) {
               return index;
            }
        }

        // if we are here, it means we could not find the item
        throw new Exception("item not found");
    }
}
