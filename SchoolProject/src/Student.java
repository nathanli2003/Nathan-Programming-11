public class Student {
    private String firstName;//declares variables
    private String lastName;
    private int grade;
    private int studentNumber;

    Student(String firstName, String lastName, int grade, int studentNumber) { //constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }

    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }


    public  String toString() {//override method which lets program output a string
        return "Name: " + this.getFirstName() + " " + this.getLastName() + " Grade: " + this.getGrade();
    }

}
