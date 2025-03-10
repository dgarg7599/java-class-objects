import java.util.*;

class Employee{

    String name;
    int id;
    double salary;

    // method to display
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class DisplayEmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("Enter the name of the employee: ");
        emp.name = input.nextLine();
        System.out.println("Enter the ID of the employee: ");
        emp.id = input.nextInt();
        System.out.println("Enter the salary of the employee: ");
        emp.salary = input.nextDouble();

        // calling the display method
        emp.display();
    }
}


// ------- Sample Input and Output------
/*
Enter the name of the employee:
Amit Khurana
Enter the ID of the employee:
1250
Enter the salary of the employee:
50000
Name: Amit Khurana
Id: 1250
Salary: 50000.0
 */