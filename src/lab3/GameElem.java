package lab3;
/**
 * Abstract class representing a game element.
 */
public abstract class GameElem implements CalcArea {
    protected String name;

    /**
     * Constructor to create a game element with a specific name.
     * @param name the name of the element.
     */
    public GameElem(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the element.
     * @return the name of the element.
     */
    public String getName() {
        return name;
    }

    /**
     * Method to display information about the element.
     */
    public abstract void displayInfo();
}
