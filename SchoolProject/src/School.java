import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();//creates arraylists
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<School> courses = new ArrayList<>();

    String location;
    String mascot;
    String sport;
    School(String location, String mascot, String sport) {//constructor for the school
        this.location = location;
        this.mascot = mascot;
        this.sport = sport;
    }


    public void newTeacher(Teacher x){//method adds new objects to list
        teachers.add(x);
    }
    public void newStudent(Student x){
        students.add(x);
    }
    public void removeTeacher(Teacher x){//method removes objects from list
        teachers.remove(x);
    }
    public void removeStudent(Student x){
        students.remove(x);
    }
    public void showTeachers(){//shows objects in the list
        for(int i = 0; i < teachers.size(); i++){
            System.out.println(teachers.get(i));
        }
    }
    public void showStudents(){//shows objects in the list
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}

