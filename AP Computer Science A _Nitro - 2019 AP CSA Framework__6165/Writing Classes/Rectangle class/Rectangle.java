public class Rectangle {

    private int width;

    private int height;
    
    /**

    * This is the constructor to create a Rectangle.
    
    * To create a Rectangle we need to know its width

    * and height.
    
    */
    
    public Rectangle(int rectWidth, int rectHeight) {

    width = rectWidth;

    height = rectHeight;

    }

    // Accessor (getter) methods

    public int getWidth() {

    return width;
    
    }

    public int getHeight() {

    return height;

    }

    // Mutator (setter) methods

    public void setWidth(int width) {

    this.width = width;

    }

    public void setHeight(int height) {

    this.height = height;

    }

    // Method to calculate the area of the rectangle

    public int getArea() {

    return width * height;

    }

    // Method to calculate the perimeter of the rectangle

    public int getPerimeter() {

    return 2 * (width + height);

    }

    /**

    * This is the toString method. It returns a String

    * representation of the object.

    */

    public String toString() {

    return "Rectangle width: " + width + ", Rectangle height: " + height;

    }

}// reviewed: 2026-08-14
