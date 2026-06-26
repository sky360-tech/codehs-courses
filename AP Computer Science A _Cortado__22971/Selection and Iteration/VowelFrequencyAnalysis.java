public class VowelFrequency
{
    public static void main(String[] args)
    {
    String sentence = "The most dangerous phrase in"
            + " the language is, 'We've always done"
            + " it this way.' - Grace Hopper";
            
    // Call the method
    countVowels(sentence);
    }

    
    // Prints the number of each vowel in `sentence`
    public static void countVowels(String sentence)
    {
    // Create the vowels string and normalize the sentence to lowercase
    String vowels = "aeiou";
    String lowerSentence = sentence.toLowerCase(); //

    // Outer loop: iterates through each vowel in "aeiou"
    for (int i = 0; i < vowels.length(); i++) 
    {
        char currentVowel = vowels.charAt(i); //
        int count = 0; // Reset counter for the current vowel

        // Inner loop: iterates through every character in the sentence
        for (int j = 0; j < lowerSentence.length(); j++) 
        {
            // If the character matches the current vowel, increment count
            if (lowerSentence.charAt(j) == currentVowel) 
            {
                count++;
            }
        }
        
        // Print the result for the current vowel
        System.out.println(currentVowel + " : " + count);
    }
    }

}// reviewed: 2026-06-26
