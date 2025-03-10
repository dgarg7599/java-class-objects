import java.util.*;

class Circle{

    double radius;

    // Method to calculate area of circle
    double calculateArea(){
        return Math.PI * radius * radius;
    }

    // Method to calculate its circumference
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    // Method to display
    void display(){
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();
        System.out.println("Enter the radius of the circle: ");
        circle.radius = sc.nextDouble();

        circle.display();
    }
}


/*
Input:
Enter the radius of the circle:
10
Output:
Area: 314.1592653589793
Perimeter: 62.83185307179586
 */