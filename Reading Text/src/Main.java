import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class Main {

    public static void searchMethod() throws IOException {
        ArrayList<String> lines = new ArrayList<>();//initialize array
        ArrayList<Integer> words = new ArrayList<>();
        FileReader fr = new FileReader("in.txt");//creates file reader object
        BufferedReader br = new BufferedReader(fr);//creates buffered reader object
        String line;
        String input = "Lovelace";   // Input word to be searched
        while ((line = br.readLine()) != null) {//adds all lines to the lines arraylist
            lines.add(line);
        }
        for (String s : lines) {//goes through each line
            if(s.contains(input)){//searches line for input
                words.add(lines.indexOf(s));//adds line with input to the word arraylist
            }
        }
        System.out.println("The input appears in the following index positions " + words);
        fr.close();
    }
    public static void main(String[] args) throws IOException {
        searchMethod();
    }
}
