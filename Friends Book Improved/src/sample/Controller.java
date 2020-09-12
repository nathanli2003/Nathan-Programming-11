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
    public TextField name;
    public TextField age;
    public TextField hobby;
    public TextField saveFile;
    public TextField loadFile;
    public ListView<Friend> friendList = new ListView<>();
    public Label labelName;
    public Label labelAge;
    public Label labelHobby;


    public void addFriend(ActionEvent actionEvent) {
        //creates friend
        Friend temp = new Friend(name.getText(), Integer.parseInt(age.getText()), hobby.getText());
        friendList.getItems().add(temp);
        name.clear();//clears fields
        age.clear();
        hobby.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        labelName.setText(temp.getName());
        labelAge.setText(Integer.toString(temp.getAge()));
        labelHobby.setText(temp.getHobby());
    }

    public void deleteFriend(ActionEvent actionEvent) {
        int index = friendList.getSelectionModel().getSelectedIndex();//deletes selected friend
        if (index >= 0) {
            friendList.getItems().remove(index);
            labelName.setText("");//clears labels
            labelAge.setText("");
            labelHobby.setText("");
        }
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = friendList.getItems();
        for(Friend f : myList) {
            f.writeToFile(saveFile.getText()); }
        friendList.getItems().clear();
        labelName.setText("");//clears labels
        labelAge.setText("");
        labelHobby.setText("");
    }

    public void loadFriends(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends(loadFile.getText());
        for(Friend f : friends){
            friendList.getItems().add(f); }
        labelName.setText("");//clears labels
        labelAge.setText("");
        labelHobby.setText("");
    }

}
