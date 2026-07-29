public class Extremes
{
    private Integer min;
    private Integer max;
    
    // Constructor
    public Extremes()
    {
        //Set min and max values 
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the quotient
    // max / number
    public Integer maxQuotient(Integer number)
    {
        if (number == 0){
            throw new ArithmeticException("Can't be divided by zero");
            
        }
         return max / number;
    }

    // Returns the quotient
    // min / number
    public Integer minQuotient(Integer number)
    {
        if (number == 0){
            throw new ArithmeticException("Can't be divided by zero");
        }
        return min / number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}// reviewed: 2026-07-29
