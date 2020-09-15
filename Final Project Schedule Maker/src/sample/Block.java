package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Block {
    //declares variables
    String course;
    String teacher;
    String myLocation;
    public Block(String c, String t, String l){//constructor
        course = c;
        teacher = t;
        myLocation = l;
    }
    public void writeToFile(String fileName) throws IOException{//writes block details into file
        FileWriter fw = new FileWriter(fileName + ".txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(course + ",\r");
        bw.write(teacher + "*\r");
        bw.write(myLocation + "\r");
        bw.write(";\r");
        bw.close();
    }
    //getters
    public String getCourse() { return course; }
    public String getTeacher() { return teacher; }
    public String getMyLocation() { return myLocation; }
    //setters
    public void setCourse(String course) { this.course = course; }
    public void setTeacher(String teacher) { this.teacher = teacher; }
    public void setMyLocation(String myLocation) { this.myLocation = myLocation; }
    //override toString
    public String toString() {return course;}
}