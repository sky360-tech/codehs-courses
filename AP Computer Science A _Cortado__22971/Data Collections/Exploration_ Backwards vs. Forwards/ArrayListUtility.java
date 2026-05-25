import java.util.ArrayList;

public class ArrayListUtility {

    /**
     * UPDATED: Removes items using a forward loop. 
     * Uses i-- to ensure the loop doesn't skip consecutive target items.
     */
    public static void removeForward(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                list.remove(i);
                i--; // Decrement i to re-check the current index for shifted items
            }
        }
    }

    /**
     * Removes items using a backward loop.
     * This is naturally reliable because shifting occurs at indices we've already checked.
     */
    public static void removeBackward(ArrayList<String> list, String target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(target)) {
                list.remove(i);
            }
        }
    }

    // Standard utility methods to support the runner
    public static void initialize(ArrayList<String> list) {
        list.clear();
        list.add("popcorn");
        list.add("gummy worm");
        list.add("gummy worm"); // Consecutive for testing shifts
        list.add("chips");
        list.add("rainbow pretzel");
        list.add("gummy worm");
    }

    public static void printList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
}