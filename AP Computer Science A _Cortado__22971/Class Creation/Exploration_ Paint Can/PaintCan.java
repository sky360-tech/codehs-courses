public class PaintCan
{
    private double paintAmount;
    private String color;

    public PaintCan(double initialPaint, String col)
    {
        paintAmount = initialPaint;
        color = col;
    }

    // Checks if there is enough paint for a required amount
    public boolean canPaint(double requiredAmount)
    {
        return paintAmount >= requiredAmount;
    }

    // Mutator: reduces paintAmount by the amount used
    public void usePaint(double amount)
    {
        paintAmount = paintAmount - amount;
    }

    // Accessor: returns the current paint amount
    public double getPaintAmount()
    {
        return paintAmount;
    }

    // Mutator: sets paintAmount to a new value
    public void setPaintAmount(double amount)
    {
        paintAmount = amount;
    }

    // Accessor: returns the color
    public String getColor()
    {
        return color;
    }

    // Mutator: sets the color to a new value
    public void setColor(String newColor)
    {
        color = newColor;
    }

    // Returns how many square feet the current paint can cover
    public double getCoverage()
    {
        return paintAmount * 375;
    }

    public String toString()
    {
        return "Can of " + color + " paint with " + paintAmount + " gallons.";
    }
}// reviewed: 2026-05-31
