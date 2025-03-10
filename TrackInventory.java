import java.util.*;
//class item
 class Item {
     int itemCode;
     String itemName;
     int price;
     int quantity;
//method to display
     void display() {
         System.out.println("Item Code: " + itemCode);
         System.out.println("Item Name: " + itemName);
         System.out.println("Price: " + price);
         System.out.println("Total Cost:" + price * quantity);
     }
 }
 //main class
class TrackInventory{
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         //creating object
         Item item =new Item();
         //input
         System.out.print("Enter the item code: ");
         item.itemCode =sc.nextInt();
         sc.nextLine();
         System.out.print("Enter the item name: ");
         item.itemName =sc.nextLine();
         System.out.print("Enter the item price: ");
         item.price =sc.nextInt();
         System.out.print("Enter the item quantity: ");
         item.quantity =sc.nextInt();
         //output
         item.display();

     }
}
/*
Input:
Enter the item code: 2
Enter the item name: name
Enter the item price: 20
Enter the item quantity: 2
Output:
Item Code: 2
Item Name: name
Price: 20
Total Cost:40
 */