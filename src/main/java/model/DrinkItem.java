
package model;

/**
 * Represents a drink available in the restaurant.
 * Inherits common item details from MenuItem.
 */
public class DrinkItem extends MenuItem {

    private String size;

    /**
     * Creates a drink with its ID, name, price, and size.
     */
    public DrinkItem(int id, String name, double price, String size) {
        super(id, name, price);
        if (size == null || size.trim().isEmpty()) {
    throw new IllegalArgumentException("Drink size cannot be empty.");
}

this.size = size.trim();
    }

    /**
     * Displays the drink details, including its size.
     */
    @Override
    public void displayDetails() {
System.out.printf("%-5d %-20s Rs. %-8.2f Size: %s%n",
        getId(), getName(), getPrice(), size);
    }
}
