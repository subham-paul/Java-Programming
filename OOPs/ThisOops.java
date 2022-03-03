class Pen {
    String color;
    String type;

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(type);
    }

    public void write() {
        System.out.println("writing Something");
    }
}

class Student {
    String name;
    String stream;

    public void detailsPrint() {
        System.out.println("Student name is " + this.name);
        System.out.println("Student stream is " + this.stream);
        System.out.println();
    }

    /*
     * // Parameterized Constructor
     * Student(String name, String stream){
     * this.name=name;
     * this.stream=stream;
     * }
     */
    /*
     * Student(){
     * System.out.println("This is non Parameterized Constructor");
     * }
     */

    Student(Student s2) {
        this.name = s2.name;
        this.stream = s2.stream;
    }

    Student(){
        // Blank used for copy constructor
    }
}

// Class name always start in Capital letter
// Object name always start in small letter

public class ThisOops {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Green";
        pen2.type = "Ocean Gel";

        // pen1.write(); // writing Something
        // pen1.printColor(); // Black
        // pen2.printColor(); // Green
        // pen1.printType(); // Gel
        // pen2.printType(); // Ocean Gel

        Student s1 = new Student(); // New is a KeyWord. Student() is a constructor
        s1.name = "subham";
        s1.stream = "CSE";
        /*
         * Student s2 = new Student();
         * s2.name = "Shamaita Pal";
         * s2.stream = "CSE";
         */
        /*
         * // parameterisez Constructor
         * Student s1= new Student("Ajay", "ece");
         * Student s2= new Student("Upasana", "Civil");
         */

        Student s2 = new Student(s1);
        // s1.detailsPrint();
        s2.detailsPrint();
    }
}
