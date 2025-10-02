package ie.atu.classesandobjects;

public class Student {
    // Fields
    String studentID;
    int age;
    boolean isRegistered;

    // Default Constructor
    Student() {
        this("N/A", 0, false);
    }

    // Constructor
    Student(String theStudentID) {
        studentID = theStudentID;

    }

    // Parameterized Constructor *MCQ
    Student(String theStudentID, int theAge, boolean studentIsRegistered) {

        this.studentID = theStudentID;
        this.age = theAge;
        this.isRegistered = studentIsRegistered;

    }

    // Methods
    void displayInfo() {
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Age: " + this.age);
        System.out.println("Registered: " + this.isRegistered);
    }

    // Equals method to compare two Student objects
    //@Override
    //public boolean equals(Object o) {
    //    if (this == o)
    //        return true;
    //    if (o == null || getClass() != o.getClass())
    //        return false;
    //    Student other = (Student) o;
    //    return studentID != null && studentID.equals(other.studentID);
      @Override
  public String toString() {
    return "Student{id='" + studentID + "', age=" + age + ", registered=" + isRegistered + "}";
  }
}
