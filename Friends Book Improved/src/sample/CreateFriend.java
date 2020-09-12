package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    public static String name;
    public static int age;
    public static String hobby;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList createAllFriends(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                friendString += line;
            } else {
                parseFriend(friendString);
                friendString = "";
            }
        }
        return friends;
    }

    private static void parseFriend (String string){
        int posOne = 0;
        int posTwo = 0;
        String name = "";
        String hobby = "";
        int age = 0;
        for (int i = 0; i<string.length(); i++){
            if(string.substring(i, i+1).equals(",")) {
                posOne = i;
                name = string.substring(0, posOne);
            }
            if (string.substring(i, i+1).equals("*")){
                posTwo = i;
                age = Integer.parseInt(string.substring(posOne+1, posTwo));
                hobby = string.substring(posTwo+1);
            }
        }
        friends.add(new Friend(name, age, hobby));
    }
}
