import java.util.*;
//MobilePhone class which has the objects
class MobilePhone{
    String brand;
    String model;
    int price;
    //method to display
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class MobileDetails{
    //main method which takes input
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //getting variable types from MobilePhone class
        MobilePhone mobile =new MobilePhone();
        System.out.print("Enter the Brand: ");
        mobile.brand = sc.nextLine();
        System.out.print("Enter the Model: ");
        mobile.model = sc.nextLine();
        System.out.print("Enter the price: ");
        mobile.price = sc.nextInt();
        //calling the display method to print output
        mobile.display();
    }
}
/*
Input:
Enter the Brand: Samsung
Enter the Model: Galaxy
Enter the price: 20000
Output:
Brand: Samsung
Model: Galaxy
Price: 20000
 */