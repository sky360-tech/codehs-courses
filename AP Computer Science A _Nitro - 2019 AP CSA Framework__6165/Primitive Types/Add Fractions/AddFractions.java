public class AddFractions 
{
    public static void main(String[] args)
    {
        int num1 = 1;
        int den1 = 2;
        int num2 = 2;
        int den2 = 5;
        System.out.println("The numerator of the first fraction is" + num1);
        System.out.println("The denominator of the first fraction is" + den1);
        System.out.println("The numerator of the second fraction is" + num2);
        System.out.println("The denominator of the second fraction is" + den2);
        
        int finalNum = num1 * den2 + num2 * den1;
        int finalDen = den1 * den2;
        System.out.println("The sum of" + num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + finalNum + "/" + finalDen); 

    }
}// reviewed: 2026-07-21
