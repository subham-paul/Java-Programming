class Employee {
    String name;
    String designation;

    public void empInfo() {
        System.out.println("employee name " + name);
        System.out.println("employee name " + designation);
        System.out.println();
    }
}

public class BasicClass {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.name = "Subham";
        e1.designation = "Software Engineer";

        Employee e2 = new Employee();
        e2.name = "Akash";
        e2.designation = "Software Developer";

        Employee e3 = new Employee();
        e3.name = "Ankita";
        e3.designation = "HR";

        e1.empInfo();
        e2.empInfo();
        e3.empInfo();
    }
}