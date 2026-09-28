public class Student {
    private String studentID;
    private String studentName;
    private String Course;
    private double marks;
    private int attendance;

  
    public Student(String studentName , String Course , double marks) {
        this.studentName = studentName;
        this.marks = marks;
        this.Course = Course;
    }

    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    // Getter
    public double getMarks() {
        return marks;
    }

    // Display method
    public void displayStudentInformation() {
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Course: " + Course);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance);
    }

    // Stipend calculation
    public void calculateStipend() {
        if (attendance > 80 && marks >= 70) {
            System.out.println("You are eligible for the stipend");
        } else {
            System.out.println("You are not eligible for the stipend");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe" , "Computer Science" , 200.00);
        student1.displayStudentInformation();

        student1.setStudentID("Kepler-002");
        student1.setStudentName("Cloe");

          System.out.println(student1.getMarks() *495 *78);

        student1.displayStudentInformation();
          System.out.println(student1.getMarks())
    }
}
