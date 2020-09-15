package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class createBlock {
    public static String course;
    public static String teacher;
    public static String myLocation;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Block> blocks = new ArrayList<>();

    public static ArrayList createAllBlocks(String fileName) throws IOException {//formats and creates block
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

    private static void parseBlock (String string){//Parses thru .txt files
        int posOne = 0;//declares variables
        int posTwo = 0;
        String course = "";
        String teacher = "";
        String myLocation = "";
        for (int i = 0; i<string.length(); i++){//parses through the .txt file and gives it variables
            if(string.substring(i, i+1).equals(",")) {
                posOne = i;
                course = string.substring(0, posOne);
            }
            if (string.substring(i, i+1).equals("*")){
                posTwo = i;
                teacher = string.substring(posOne+1, posTwo);
                myLocation = string.substring(posTwo+1);
            }
        }
        blocks.add(new Block(course, teacher, myLocation));//adds a new object
    }
}
