package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    //declare variables
    public TextField saveFile;
    public TextField loadFile;
    public TextField course;
    public TextField teacher;
    public TextField myLocation;//the variable location is a reserved keyword, meaning I can't use it
    public Label labelCourse;
    public Label labelTeacher;
    public Label labelLocation;
    public ListView<Block> blockList = new ListView<>();


    public void submit(ActionEvent actionEvent) {//enters in a new person
        //creates friend
        Block temp = new Block(course.getText(), teacher.getText(), myLocation.getText());
        blockList.getItems().add(temp);
        course.clear();//clears fields
        teacher.clear();
        myLocation.clear();
    }

    public void displayBlock(MouseEvent mouseEvent) {//displays info when clicked on from list
        Block temp;
        temp = blockList.getSelectionModel().getSelectedItem();
        labelCourse.setText(temp.getCourse());
        labelTeacher.setText(temp.getTeacher());
        labelLocation.setText(temp.getMyLocation());
    }

    public void deleteBlock(ActionEvent actionEvent) {
        int index = blockList.getSelectionModel().getSelectedIndex();//deletes selected friend
        if (index >= 0) {
            blockList.getItems().remove(index);
            labelCourse.setText("");//clears labels
            labelTeacher.setText("");
            labelLocation.setText("");
        }
    }

    public void saveBlock(ActionEvent actionEvent) throws IOException {//save method
        ObservableList<Block> myList = blockList.getItems();
        for(Block b : myList) {
            b.writeToFile(saveFile.getText()); }
        blockList.getItems().clear();
        labelCourse.setText("");//clears labels
        labelTeacher.setText("");
        labelLocation.setText("");
    }

    public void loadBlock(ActionEvent actionEvent) throws IOException {//load method
        blockList.getItems().clear();
        ArrayList<Block> blocks = createBlock.createAllBlocks(loadFile.getText() + ".txt");
        for(Block b : blocks){//Goes through the person
            blockList.getItems().add(b); }
        labelCourse.setText("");//clears labels
        labelTeacher.setText("");
        labelLocation.setText("");
    }
     
}
