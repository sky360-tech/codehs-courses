public class Smoothie 
{
    private String boost;

    public Smoothie(String smoothieBoost) 
    {
        boost = smoothieBoost.toLowerCase();
    }
    
    public String getNutrients()
    {
        if (boost.equals("spinach"))
        {
            return "Your smoothie has extra vitamin A, vitamin B, and fiber!";
        } 
        else if (boost.equals("protein"))
        {
            return "Your smoothie has extra protein!";
        } 
        else // ginger boost
        {
            return "Your smoothie improves digestive health!";  
        }
    }
    
    public String toString()
    {
        return "smoothie with a boost of " + boost;
    }
}