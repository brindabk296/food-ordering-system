
package model;

/**
 * Represents a food item available in the restaurant.
 * Inherits common item details from MenuItem.
 */
public class FoodItem extends MenuItem {

    private String category;

    /**
     * Creates a food item with its ID, name, price, and category.
     */
    public FoodItem(int id, String name, double price, String category) {
        super(id, name, price);
        this.category = category;
    }

    /**
     * Displays the food item's details, including its category.
     */
    @Override
    public void displayDetails() {
        System.out.printf("%-5d %-20s Rs. %-8.2f %s%n",
                getId(), getName(), getPrice(), category);
    }
}
