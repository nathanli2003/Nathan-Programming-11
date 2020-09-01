import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        this.name = "";
        this.accountNumber = 0;
        this.checkBalance = 0;
        this.savingRate = 0;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //create constructor
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance += checkDeposit;
        this.savingBalance += savingDeposit;
    }

    /*
    Requires: amt, date, account
    Modifies: this
    Effects: Adds a deposit to saving, or else deposit to checking
     */
    public double deposit(double amt, Date date, String account){
        if(account.equals(SAVING)){ savingBalance += amt; }
        else if(account.equals(CHECKING)){ checkBalance += amt; }
        Deposit d = new Deposit(amt, date, account);
        deposits.add(d);
        return 0;
    }

    /*
    Requires: amt, date, account
    Modifies: this
    Effects: Withdraws money from saving, or else from checking
     */
    public double withdraw(double amt, Date date, String account){
        if(account.equals(SAVING)){ savingBalance -= amt; }
        else if(account.equals(CHECKING)){ checkBalance -= amt; }
        Withdraw w = new Withdraw(amt, date, account);
        withdraws.add(w);
        return 0;
    }
    private boolean checkOverdraft(double amt, double accountTotal){
        if(amt > accountTotal) { return true; }
        else { return false; }
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

    //getters
    public String getDeposit() {
        return deposits.toString();
    }
    public String getWithdraw() {
        return withdraws.toString();
    }
    public double getCheckBalance() {
        return checkBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
}