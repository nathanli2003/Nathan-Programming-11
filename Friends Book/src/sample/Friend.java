package sample;

public class Friend {
    //declare variables
    String name;
    int age;
    String hobby;

    Friend(String n, int a, String h){//constructor
        name = n;
        age = a;
        hobby = h;
    }
    //getters and setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString(){
        return name;
    }
}
