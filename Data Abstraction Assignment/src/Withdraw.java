import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
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
        return "Withdraw of: $" + getAmount() + " Date: " + getDate() + " into account: " + getAccount();
    }
}