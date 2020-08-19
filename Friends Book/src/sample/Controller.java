package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField name;
    public TextField age;
    public TextField hobby;
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
}
