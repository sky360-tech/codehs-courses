class findCharTester
{
    public static void main(String[] args)
    {
        // This is determines the startTime of the program
        long startTime = System.nanoTime();
        String word = "This is a long word that includes the target letter at end - x";
        char key = 'x';
        
        // Calls the original findChar algorithm
        findChar(word, key);
        
        // Determines speed of the algorithm
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("This algorithm took " + duration + " nanoseconds.\n");
        
        // ====================================== //
        
        // Reassign startTime
        startTime = System.nanoTime();
        
        // Reassign so execution count is the same
        word = "This is a long word that includes the target letter at end - x";
        String keyString = "x";
        
        // Calls the more efficient findChar algorithm
        findCharEfficient(word, keyString);
        
        // Determines speed of the algorithm
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("This algorithm took " + duration + " nanoseconds.");
    }

    // Original algorithm that looks for key in str
    public static void findChar(String str, char key)
    {
    	for (int i = 0; i < str.length(); i ++)
    	{
    		char character = str.charAt(i);
    		if (character == key)
    		{
    			System.out.println("Found!");
    			break;
    		}
    	}
    }

    // Efficient algorithm that looks for key in str
    public static void findCharEfficient(String str, String key)
    {
        // Paste your code here from the previous exercise
        
        
    }
}