public class Main {
    public static void main(String[] args) {
        //creates students and teachers with required info
        Teacher teacher1 = new Teacher("John", "Smith", "Math");
        Teacher teacher2 = new Teacher("Justin", "Trudeau", "English");
        Teacher teacher3 = new Teacher("Jane", "Doe", "History");
        Student student1 = new Student("Bill", "Gates", 8, 824593);
        Student student2 = new Student("William", "Buffet", 12, 539753);
        Student student3 = new Student("Megan", "Fox", 12, 932765);
        Student student4 = new Student("Napoleon", "Bonaparte", 12, 726478);
        Student student5 = new Student("Jennifer", "Lawrence", 11, 429678);
        Student student6 = new Student("Oprah", "Winfrey", 10, 948703);
        Student student7 = new Student("Barack", "Obama", 9, 837604);
        Student student8 = new Student("Frank", "Sinatra", 11, 948905);
        Student student9 = new Student("Benjamin", "Franklin", 12, 947635);
        Student student10 = new Student("George", "Washington", 11, 206893);
        //creates school object which stores students and teachers
        School lordKitchener = new School("Vancouver", "Fox" , "Soccer");
        //adds new teachers and students to lordKitchener
        lordKitchener.newTeacher(teacher1);
        lordKitchener.newTeacher(teacher2);
        lordKitchener.newTeacher(teacher3);
        lordKitchener.newStudent(student1);
        lordKitchener.newStudent(student2);
        lordKitchener.newStudent(student3);
        lordKitchener.newStudent(student4);
        lordKitchener.newStudent(student5);
        lordKitchener.newStudent(student6);
        lordKitchener.newStudent(student7);
        lordKitchener.newStudent(student8);
        lordKitchener.newStudent(student9);
        lordKitchener.newStudent(student10);
        //displays full class
        System.out.println("Teachers:");
        lordKitchener.showTeachers();
        System.out.println("Students:");
        lordKitchener.showStudents();
        System.out.println("--------------------------------");
        //removes students and teachers
        lordKitchener.removeTeacher(teacher1);
        lordKitchener.removeStudent(student1);
        lordKitchener.removeStudent(student2);
        System.out.println("Teachers:");
        lordKitchener.showTeachers();
        System.out.println("Students:");
        lordKitchener.showStudents();
    }
}
