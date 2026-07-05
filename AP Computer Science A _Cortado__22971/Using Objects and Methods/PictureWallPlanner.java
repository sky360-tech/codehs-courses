import java.util.Scanner;

public class PhotoWallPlanner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wallHeightInches = 96;
        System.out.println("What is the height of each picture?");
        int pictureHeight = input.nextInt();
        double totalRows = (double) wallHeightInches / pictureHeight;
        int completeRows = wallHeightInches / pictureHeight;
        int inchesLeftover = wallHeightInches % pictureHeight;
        System.out.println("Total rows (including partial rows): " + totalRows);
        System.out.println("Complete rows: " + completeRows);
        System.out.println("Inches leftover: " + inchesLeftover);
    }
}// reviewed: 2026-07-05
