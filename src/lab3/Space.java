package lab3;

/**
 * Main class to test the game space structure.
 */
public class Space {
    public static void main(String[] args) {
        // Creating simple elements
        SimpleElement tree = new SimpleElement("Tree", 2.0, 3.0);
        SimpleElement rock = new SimpleElement("Rock", 1.5, 1.5);

        // Creating a composite element "Forest" and adding simple elements
        CompositeElement forest = new CompositeElement("Forest");
        forest.addElement(tree);
        forest.addElement(rock);

        // Creating the main composite element "GameWorld" and adding elements
        CompositeElement gameWorld = new CompositeElement("GameWorld");
        gameWorld.addElement(forest);
        gameWorld.addElement(new SimpleElement("Lake", 5.0, 4.0));

        // Displaying information about the entire structure
        gameWorld.displayInfo();
    }
}
