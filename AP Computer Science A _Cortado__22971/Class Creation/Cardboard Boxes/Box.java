public class Box
{
    private int width;
    private int length;
    private int height;

    // Constructor using "this" to differentiate instance variables
    public Box(int width, int length, int height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // Compares the volumes of this box and otherBox, returning
    // the larger of the two boxes
    public Box getLargerBox(Box otherBox)
    {   
        // "this" is used to clearly describe which volume
        if (this.getVolume() >= otherBox.getVolume())
        {
            // Returns this object, which is the object that
            // is used to call this method
            return this;
        }
        else
        {
            return otherBox;
        }
    }

    public int getVolume()
    {
        return width * height * length;
    }

    public String toString()
    {
        return "Width: " + width + "\nLength: " + length +
            "\nHeight: " + height;
    }
}