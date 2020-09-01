import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }
    //getters
    public double getAmount() {
        return amount;
    }
    public Date getDate() {
        return date;
    }
    public String getAccount() {
        return account;
    }

    /*
        Requires: n/a
        Modifies: Override which turns address into string
        Effects: Return withdraw info
         */
    public String toString(){
        //your code here
        return "Deposit of: $" + this.getAmount() + " Date: " + this.getDate() + " into account: " + getAccount();
    }
}