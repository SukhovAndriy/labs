package lab3;

/**
 * Class representing a simple element that occupies a specific area.
 */
public class SimpleElement extends GameElem {
    private double width;
    private double height;

    /**
     * Constructor to create a simple element with width and height.
     * @param name the name of the element.
     * @param width the width of the element.
     * @param height the height of the element.
     */
    public SimpleElement(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the simple element.
     * @return the area occupied by the element.
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Displays information about the simple element.
     */
    @Override
    public void displayInfo() {
        System.out.println("SimpleElement: " + name + ", Area: " + calculateArea());
    }
}

