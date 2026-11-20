
package model;

/**
 * Represents the common details shared by all menu items.
 * FoodItem and DrinkItem inherit this class.
 */
public abstract class MenuItem {

    private int id;
    private String name;
    private double price;

    /**
     * Initializes a menu item with its ID, name, and price.
     */
    /**
     * Initializes a menu item with its ID, name, and price.
     */
    public MenuItem(int id, String name, double price) {
        if (id <= 0) {
            throw new IllegalArgumentException("Item ID must be positive.");
            
        }
        if (name == null || name.trim().isEmpty()) {
    throw new IllegalArgumentException("Item name cannot be empty.");
}
if (price <= 0) {
    throw new IllegalArgumentException("Item price must be greater than zero.");
}
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Returns the item ID.
    public int getId() {
        return id;
    }

    // Returns the item name.
    public String getName() {
        return name;
    }

    // Returns the item price.
    public double getPrice() {
        return price;
    }

    /**
     * Displays the details of the menu item.
     * Each child class provides its own implementation.
     */
    public abstract void displayDetails();
}
