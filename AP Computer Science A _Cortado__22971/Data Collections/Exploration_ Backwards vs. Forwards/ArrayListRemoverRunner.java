import java.util.ArrayList;

public class ArrayListRemoverRunner {
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<String>();
        ArrayListUtility.initialize(snacks);

        // Change "gummy worm" to "pickle chip" or "rainbow pretzel" to test other snacks
        String targetSnack = "gummy worm";

        System.out.println("Original snacks list:");
        ArrayListUtility.printList(snacks);

        System.out.println("--- Testing Forward Removal ---");
        ArrayListUtility.removeForward(snacks, targetSnack);
        ArrayListUtility.printList(snacks);

        ArrayListUtility.initialize(snacks); // Reset list for second test

        System.out.println("--- Testing Backward Removal ---");
        ArrayListUtility.removeBackward(snacks, targetSnack);
        ArrayListUtility.printList(snacks);
    }
}// reviewed: 2026-06-08
