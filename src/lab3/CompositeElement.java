package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a composite element that consists of other elements.
 */
public class CompositeElement extends GameElem {
    private List<GameElem> elements = new ArrayList<>();

    /**
     * Constructor to create a composite element with a name.
     * @param name the name of the composite element.
     */
    public CompositeElement(String name) {
        super(name);
    }

    /**
     * Adds a sub-element to the composite element.
     * @param element the sub-element to add.
     */
    public void addElement(GameElem element) {
        elements.add(element);
    }

    /**
     * Removes a sub-element from the composite element.
     * @param element the sub-element to remove.
     */
    public void removeElement(GameElem element) {
        elements.remove(element);
    }

    /**
     * Calculates the total area occupied by the composite element along with all its sub-elements.
     * @return the sum of the areas of all sub-elements.
     */
    @Override
    public double calculateArea() {
        double totalArea = 0;
        for (GameElem element : elements) {
            totalArea += element.calculateArea();
        }
        return totalArea;
    }

    /**
     * Displays information about the composite element and its sub-elements.
     */
    @Override
    public void displayInfo() {
        System.out.println("CompositeElement: " + name + ", Total Area: " + calculateArea());
        for (GameElem element : elements) {
            element.displayInfo();
        }
    }
}

