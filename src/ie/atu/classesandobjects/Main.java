package ie.atu.classesandobjects;

public class Main {
    public static void main(String[] args) {
        // Create an instance od the student class
        // Student studentObject1 = new Student();
        // Student studentObject2 = new Student("G00405163");
        // Student studentObject3 = new Student("G00304612", 20, true);
        Student s1 = new Student("S001", 20, true);
        //Student s2 = s1; // s2 references the same object as s1
        //Student s3 = new Student("S001", 20, true); // same data, different object

        // System.out.println(s1 == s2); // true (same identity)
        System.out.println(s1); // or just System.out.println(s1);
        // System.out.println(s1.equals(s3)); // false unless equals() is overridden/
        // overridden = true

        // Call the displayInfo method to show deafault values
        // studentObject1.displayInfo();
        // studentObject2.displayInfo();
        // studentObject3.displayInfo();

    }

}
