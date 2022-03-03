import java.util.*;

// creating class
class Pen {
    String color;
    String type;

    // method calling
    public void write() {
        System.out.println("Write using Pen");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

// Create student class
class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
        System.out.println();
    }
}

public class OOPS {
    public static void main(String[] args) {

        Pen pen1 = new Pen(); // Pen is class name pen1 is object name
        pen1.color = "Black"; // property
        pen1.type = "Dot";

        Pen pen2 = new Pen();
        pen2.color = "Blue"; // property
        pen2.type = "Gel";

        // pen1.write(); // Write using Pen
        // pen1.printColor(); // Black
        // pen2.printColor(); // Blue

        Student student1 = new Student();
        student1.name = "Subham";
        student1.age = 24;
        Student student2 = new Student();
        student2.name = "Rahul";
        student2.age = 23;
        Student student3 = new Student();
        student3.name = "Raja";
        student3.age = 20;
        Student student4 = new Student();
        student4.name = "Ankita";
        student4.age = 22;

        student1.getInfo();
        student2.getInfo();
        student3.getInfo();
        student4.getInfo();
    }
}