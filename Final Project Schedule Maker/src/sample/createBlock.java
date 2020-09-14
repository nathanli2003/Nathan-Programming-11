package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class createBlock {
    public static String course;
    public static String teacher;
    public static String location;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Block> blocks = new ArrayList<>();

    public static ArrayList createAllBlocks(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String blockString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                blockString += line;
            } else {
                parseBlock(blockString);
                blockString = "";
            }
        }
        return blocks;
    }

    private static void parseBlock (String string){
        int posOne = 0;
        int posTwo = 0;
        String course = "";
        String teacher = "";
        String location = "";
        for (int i = 0; i<string.length(); i++){
            if(string.substring(i, i+1).equals(",")) {
                posOne = i;
                course = string.substring(0, posOne);
            }
            if (string.substring(i, i+1).equals("*")){
                posTwo = i;
                teacher = string.substring(posOne+1, posTwo);
                location = string.substring(posTwo+1);
            }
        }
        blocks.add(new Block(course, teacher, location));
    }
}
