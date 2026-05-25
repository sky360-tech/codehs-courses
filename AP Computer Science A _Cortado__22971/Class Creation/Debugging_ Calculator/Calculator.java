public class Calculator 
{
    private int total;
    private int value;

    public Calculator(int startingValue)
    {
        total = startingValue;
        value = 1;
    }

    public int add(int value)
    {
        total = total + value;
        return total;
    }

    public int add()
    {
        total += value;
        return total;
    }

    public int multiply(int value)
    {
        total *= (this.value + value);
        return total;
    }

    public int formula()
    {
        int result = (total + value) * 2;
        return result;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}