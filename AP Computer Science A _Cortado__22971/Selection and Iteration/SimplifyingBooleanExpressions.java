public class SimplifyBooleanExpressions 
{
    public static void main(String[] args) 
    {
        // Set up test variables
        boolean isReady = true;
        boolean isApproved = true;
        boolean hasPermission = true; 
        boolean isComplete = false;
        boolean isCritical = true;
        boolean isLogged = false;
        boolean isResponded = true;
        
        // Problem 1
        boolean isAllowedA = !(!isReady || !isApproved);
        System.out.println("Original 1: " + isAllowedA);
        
        boolean isAllowedB = /* Write simplified expression here */;
        System.out.println("Simplified 1: " + isAllowedB);
        System.out.println("Expressions match: " + (isAllowedA == isAllowedB));
        System.out.println();
        
        // Problem 2
        boolean canProceedA = !!(hasPermission && isComplete);
        System.out.println("Original 2: " + canProceedA);
        
        boolean canProceedB = /* Write simplified expression here */;
        System.out.println("Simplified 2: " + canProceedB);
        System.out.println("Expressions match: " + (canProceedA == canProceedB));
        System.out.println();
        
        // Problem 3
        boolean shouldAlertA = !(isCritical && !(isLogged || isResponded));
        System.out.println("Original 3: " + shouldAlertA);
        
        boolean shouldAlertB = /* Write simplified expression here */;
        System.out.println("Simplified 3: " + shouldAlertB);
        System.out.println("Expressions match: " + (shouldAlertA == shouldAlertB));
        
        // Bonus: Try changing the variable values to test different scenarios
    }
}
