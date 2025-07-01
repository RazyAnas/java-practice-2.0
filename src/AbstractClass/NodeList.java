package AbstractClass;

public interface NodeList { // Interface

    // It has four methods: getRoot(), addItem(), removeItem(), and traverse() --> package-private + abstract
    abstract ListItem getRoot(); // getter for root
    abstract boolean addItem(ListItem item); // takes a ListItem and returns true if it was added successfully or false otherwise.
    abstract boolean removeItem(ListItem item); // takes a ListItem and returns true if it was removed successfully or false otherwise
    abstract void traverse(ListItem root); // takes the root as an argument and does not return anything

}
