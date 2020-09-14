package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Block {
    //declares variables
    String course;
    String teacher;
    String location;
    Block(String c, String t, String l){//constructor
        course = c;
        teacher = t;
        location = l;
    }
    public void writeToFile(String fileName) throws IOException{//writes block details into file
        FileWriter fw = new FileWriter("blocks.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(course + ",\r");
        bw.write(teacher + "*\r");
        bw.write(location + "\r");
        bw.write(";\r");
        bw.close();
    }
    //getters
    public String getCourse() { return course; }
    public String getTeacher() { return teacher; }
    public String getLocation() { return location; }
    //setters
    public void setCourse(String course) { this.course = course; }
    public void setTeacher(String teacher) { this.teacher = teacher; }
    public void setLocation(String location) { this.location = location; }
    //override toString
    public String toString() {return course;}
}