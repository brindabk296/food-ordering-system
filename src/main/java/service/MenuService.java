package service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import model.DrinkItem;
import model.FoodItem;
import model.MenuItem;
/**
 * Manages the restaurant menu.
 * Provides methods to display, search, and retrieve menu items.
 * Uses a HashMap to store menu items with their unique IDs.
 */
public class MenuService {
    private HashMap<Integer, MenuItem> menu = new HashMap<>();
    // Initializes the menu with sample food and drink items.
    public MenuService() {
        // Add a few sample items to the menu.
        menu.put(1, new FoodItem(1, "Veg Burger", 90, "Fast Food"));
        menu.put(2, new FoodItem(2, "Paneer Pizza", 180, "Main Course"));
        menu.put(3, new FoodItem(3, "French Fries", 70, "Snacks"));
        menu.put(4, new FoodItem(4, "Veg Sandwich", 80, "Snacks"));
        menu.put(5, new DrinkItem(5, "Cold Coffee", 60, "Regular"));
        menu.put(6, new DrinkItem(6, "Lime Soda", 40, "Regular"));
    }
    // Displays all available menu items.
// Displays all available menu items in ID order.
public void showMenu() {
    System.out.println("\n========== RESTAURANT MENU ==========");
    System.out.printf("%-5s %-20s %-14s %s%n",
            "ID", "Item", "Price (Rs.)", "Category");

    System.out.println("-------------------------------------");

    ArrayList<Integer> itemIds = new ArrayList<>(menu.keySet());
    Collections.sort(itemIds);

    for (int id : itemIds) {
        menu.get(id).displayDetails();
    }

    System.out.println("-------------------------------------");
}
    public MenuItem findItem(int id) { return menu.get(id); }

   // Searches for menu items by name.
public void searchItem(String name) {
    boolean found = false;

    if (name == null || name.trim().isEmpty()) {
        System.out.println("Please enter an item name.");
        return;
    }

    String searchName = name.trim().toLowerCase();

    for (MenuItem item : menu.values()) {
if (item.getName().trim().toLowerCase().contains(searchName)) {
            item.displayDetails();
            found = true;
        }
    }

    if (!found) {
        System.out.println("Item not found.");
    }
}

}