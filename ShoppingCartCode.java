import java.util.*;
//class cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Method to calculate total cost of this item
    double getTotalPrice() {
        return price * quantity;
    }

    // Method to display item details
    void displayItem() {
        System.out.println(quantity + " x " + itemName + " - ₹" + getTotalPrice());
    }
}

class ShoppingCart {
    CartItem[] cart = new CartItem[10]; // Fixed size array (basic approach)
    int itemCount = 0;

    // Method to add an item to the cart
    void addItem(String name, double price, int quantity) {
        if (itemCount < cart.length) {
            CartItem item = new CartItem();
            item.itemName = name;
            item.price = price;
            item.quantity = quantity;
            cart[itemCount] = item;
            itemCount++;
            System.out.println(quantity + " x " + name + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equalsIgnoreCase(name)) {
                found = true;
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1]; // Shift items to the left
                }
                cart[itemCount - 1] = null; // Remove last item reference
                itemCount--;
                System.out.println(name + " removed from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println(name + " not found in the cart.");
        }
    }

    // Method to display all cart items and total cost
    void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
            return;
        }

        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            cart[i].displayItem();
            totalCost += cart[i].getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + totalCost);
    }
}

public class ShoppingCartCode {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("\nChoose an action: add / remove / display ");
        String action = sc.next().toLowerCase();
        sc.nextLine(); // Fixing input skipping issue

        if (action.equals("add")) {
            System.out.print("Enter item name: ");
            String name = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            cart.addItem(name, price, quantity);
            cart.displayCart();
        } else if (action.equals("remove")) {
            System.out.print("Enter item name to remove: ");
            String name = sc.nextLine();
            cart.removeItem(name);
            cart.displayCart();
        } else if (action.equals("display")) {
            cart.displayCart();
        }
            else{
        System.out.println("Invalid action. Try again.");
    }

        sc.close();
}
}
