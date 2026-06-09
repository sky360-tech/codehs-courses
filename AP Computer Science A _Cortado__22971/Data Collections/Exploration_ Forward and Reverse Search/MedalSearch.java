public class MedalSearch {
    public static void main(String[] args) {
        int[][] goldMedals = {
            {2024, 40}, {2020, 39}, {2016, 46}, {2012, 46}, 
            {2008, 36}, {2004, 36}, {2000, 37}, {1996, 44}, 
            {1992, 47}, {1988, 36}
        };
        
        int year = 1992;
        
        // Calling the reversed method as requested in the final step
        int numMedals = findNumGoldMedalsReversed(goldMedals, year);
        
        if (numMedals != -1) {
            System.out.println("Number of gold medals for " + year + ": " + numMedals);
        } else {
            System.out.println("Year not found.");
        }
    }

    // Original method (Modified with completed lines)
    public static int findNumGoldMedals(int[][] medalData, int targetYear) {
        int passes = 1;
        for (int row = 0; row < medalData.length; row++) {
            int year = medalData[row][0]; // Line 30: Assign current row's year
            if (year == targetYear) {      // Line 32: Check for match
                System.out.println("Number of passes through the for loop: " + passes);
                return medalData[row][1];  // Line 35: Return medal count
            }
            passes++;
        }
        return -1;
    }

    // New Reversed Method
    public static int findNumGoldMedalsReversed(int[][] medalData, int targetYear) {
        int passes = 1;
        // Starts at the last index (1988) and moves toward the first (2024)
        for (int row = medalData.length - 1; row >= 0; row--) {
            int year = medalData[row][0]; 
            if (year == targetYear) {
                System.out.println("Number of passes through the reversed for loop: " + passes);
                return medalData[row][1];
            }
            passes++;
        }
        return -1;
    }
}// reviewed: 2026-06-09
