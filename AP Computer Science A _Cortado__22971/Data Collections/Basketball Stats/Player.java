public class Player {
    // Instance variables: use Wrapper classes so they can be null
    private String firstName;
    private String lastName;
    private Integer age;
    private Double pointsPerGame;
    private Double reboundsPerGame;

    // Static variables: shared across all Player objects
    private static double totalPoints = 0;
    private static int validPointCount = 0;
    private static String topScorer = "";
    private static double highestPPG = 0;

    // Constructor: converts String parameters to numeric types if not empty
    public Player(String fName, String lName, String a, String ppg, String rpg) {
        this.firstName = fName;
        this.lastName = lName;

        if (a.length() > 0) {
            this.age = Integer.parseInt(a);
        }
        if (ppg.length() > 0) {
            this.pointsPerGame = Double.parseDouble(ppg);
        }
        if (rpg.length() > 0) {
            this.reboundsPerGame = Double.parseDouble(rpg);
        }

        // Update global stats
        recordStats();
    }

    // Updates static variables based on the current player's data
    private void recordStats() {
        if (this.pointsPerGame != null) {
            totalPoints += this.pointsPerGame;
            validPointCount++;

            if (this.pointsPerGame > highestPPG) {
                highestPPG = this.pointsPerGame;
                topScorer = getFullName();
            }
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getPointsPerGame() {
        return pointsPerGame;
    }

    public Double getReboundsPerGame() {
        return reboundsPerGame;
    }

    @Override
    public String toString() {
        String message = getFullName();
        message += (age != null) ? ", Age: " + age : ", Age: No Data";
        message += (pointsPerGame != null) ? ", PPG: " + pointsPerGame : ", PPG: No Data";
        message += (reboundsPerGame != null) ? ", RPG: " + reboundsPerGame : ", RPG: No Data";
        return message;
    }

    public static void printOverallStats() {
        System.out.println();
        if (validPointCount > 0) {
            double average = totalPoints / validPointCount;
            average = Math.round(average * 10) / 10.0;
            System.out.println("Average PPG (of " + validPointCount + " players): " + average);
        } else {
            System.out.println("Average PPG: No Data");
        }

        if (highestPPG > 0) {
            System.out.println("Top Scorer: " + topScorer + " with " + highestPPG + " PPG");
        } else {
            System.out.println("Top Scorer: No Data");
        }
    }
}