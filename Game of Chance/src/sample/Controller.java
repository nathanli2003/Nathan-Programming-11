package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label moneyPool;
    public TextField betAmount;
    public Label diceOne;
    public Label diceTwo;
    public Button diceOneButton;
    public Button diceTwoButton;
    public Button confirmButton;
    public Label winOrLose;
    int randomNumber1;
    int randomNumber2;
    int bet;
    public int total = 1000;
    //getters and setters for randomNumbers and bet amount
    public void setRandomNumber1(int randomNumber1){
        this.randomNumber1 = randomNumber1;
    }
    public void setRandomNumber2(int randomNumber2){
        this.randomNumber2 = randomNumber2;
    }
    public void setBet(int bet) {
        this.bet = bet;
    }
    public int getRandomNumber1() {
        return randomNumber1;
    }
    public int getRandomNumber2() {
        return randomNumber2;
    }
    public int getBet() {
        return bet;
    }


    public void confirmBet(ActionEvent actionEvent) {
        winOrLose.setText("");
        setBet(Integer.parseInt(betAmount.getText()));
        if(total - getBet() >= 0) {
            total -= getBet();
            moneyPool.setText(Integer.toString(total));
            diceOneButton.setDisable(false);
            betAmount.clear();
            confirmButton.setDisable(true);
            winOrLose.setText("");
        }
        else{
            winOrLose.setText("You bet too much, try again"); //Makes sure user doesn't bet too much
        }
    }
    public void rollDiceOne(ActionEvent actionEvent) {
        setRandomNumber1((int)(Math.random() * ((6 - 1) + 1)) + 1);//gets random number between 1 and 6
        diceOne.setText(Integer.toString(getRandomNumber1()));//Prints card # in GUI
        diceOneButton.setDisable(true);
        diceTwoButton.setDisable(false);
    }

    public void rollDiceTwo(ActionEvent actionEvent) {
        setRandomNumber2((int)(Math.random() * ((6 - 1) + 1)) + 1);//gets random number between 1 and 6
        diceTwo.setText(Integer.toString(getRandomNumber2()));//Prints card # in GUI
        diceTwoButton.setDisable(true);
        if(getRandomNumber1() > getRandomNumber2()){
            winOrLose.setText("You Win");
            moneyPool.setText(Integer.toString(total + getBet()*2));
            total += getBet() * 2;
        }
        else{
            winOrLose.setText("You Lose");
        }
    }

    public void restart(ActionEvent actionEvent) {
        winOrLose.setText("");
        diceOne.setText("");
        diceTwo.setText("");
        confirmButton.setDisable(false);
    }



}
