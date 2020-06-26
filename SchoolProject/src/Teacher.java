public class Teacher {
    private String firstName;//declares variables
    private String lastName;
    private String subject;

    Teacher(String firstName, String lastName, String subject){//constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public  String toString() {//override method which lets program output a string
        return "Name: " + this.getFirstName() + " " + this.getLastName() + " Subject: " + this.getSubject();
    }
}
