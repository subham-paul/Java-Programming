public class ArrayOfObject {

    public static class Student {
        String name;
        int roll;
        int age;
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.roll = 1;
        s1.age = 15;
        Student s2 = new Student();
        s2.name = "Love Babbar";
        s2.roll = 2;
        s2.age = 16;
        Student s3 = new Student();
        s3.name = "Striver";
        s3.roll = 3;
        s3.age = 15;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].age);
        }
    }
}
