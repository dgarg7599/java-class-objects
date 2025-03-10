import java.util.*;
//creating class Student
class Student {
    //attributes
    String name;
    int rollNumber;
    double marks;

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // Method to display student details and grade
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

class StudentReport {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
    //input
        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        student.rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        student.marks = sc.nextDouble();
//output
        student.display();
        sc.close();
    }
}
/*Enter student name: Divyansh
Enter roll number: 2
Enter marks: 90
Student Name: Divyansh
Roll Number: 2
Marks: 90.0
Grade: A+
 */