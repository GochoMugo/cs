/**
 * The Binary Search Algorithm
 */

package addressbook;

import java.util.ArrayList;

public class BinarySearch implements Algorithm<Object> {
    /**
     * Executes the binary search
     *
     * @param items - list of items
     * @param compare - function called to compare two items
     * @return index of the found item in the list
     * @throws Exception if item is not found
     */
    public int exec(ArrayList<Object> items, Compare<Object> compare) throws Exception {
        int size = items.size();
        int firstIndex = 0;
        int lastIndex = size - 1;
        int middleIndex = (firstIndex + lastIndex) / 2;

        while(firstIndex <= lastIndex) {
            Object item = items.get(middleIndex);
            int result = compare.compare(item);

            // if we found it, return it
            if (result == 0) {
                return middleIndex;
            }

            if (result < 0) {
                lastIndex = middleIndex - 1;
            } else if (result > 0) {
                firstIndex = middleIndex + 1;
            }

            // we have not found it yet, so lets progress to the next
            middleIndex = (firstIndex + lastIndex) / 2;
        }

        // if we are here, it means we did not find the item
        //  we shall throw an exception
        throw new Exception("item not found");
    }
}
