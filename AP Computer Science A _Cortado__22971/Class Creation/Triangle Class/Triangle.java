public class Triangle 
{
	private int base;
	private int height;
	
	public Triangle(int tBase, int tHeight)
	{
		base = tBase;
		height = tHeight;
	}
	
	/**
     * Returns the area of the triangle
     * area = 1/2 * b * h
     * Preconditions: base and height are positive integers
     */
	public double area() 
	{
		return 0.5 * base * height;
	}
	
	// Accessor method for base
	public int getBase() 
	{
		return base;
	}
    
    // Mutator method for base
	public void setBase(int tBase) 
	{
		base = tBase;
	}
    
    // Accessor method for height
	public int getHeight() 
	{
		return height;
	}

    // Mutator method for height
	public void setHeight(int tHeight) 
	{
		height = tHeight;
	}

    // Custom toString method
    public String toString() 
    {
		return "Triangle with an area of " + area();
	}
}
// reviewed: 2026-06-04
