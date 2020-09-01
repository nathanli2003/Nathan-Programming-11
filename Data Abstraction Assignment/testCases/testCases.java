import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

public class testCases {
    //creates customer
    Customer MrB = new Customer("Mr. Bond", 007, 5000, 5000);
    Date Today = new Date(1L); // sets date to Wed Dec 31 16:00:00 PST 1969

    @Test
    public void  testCustomerDeposit() {
        //check customer accounts
        assertEquals(5000.0, MrB.getCheckBalance(), 0);
        assertEquals(5000.0, MrB.getSavingBalance(), 0);
        MrB.deposit(100, Today, "Checking");
        assertEquals(5100.0, MrB.getCheckBalance(), 0);
        assertEquals(5000.0, MrB.getSavingBalance(), 0);
    }

    @Test
    public void  testCustomerWithdraw() {
        //check customer accounts
        assertEquals(5000.0, MrB.getCheckBalance(), 0);
        assertEquals(5000.0, MrB.getSavingBalance(), 0);
        MrB.withdraw(100, Today, "Saving");
        assertEquals(5000.0, MrB.getCheckBalance(), 0);
        assertEquals(4900.0, MrB.getSavingBalance(), 0);
    }

    @Test
    public void testDepositToString(){
        //assertArrayEquals(MrX.getDeposit());
        MrB.deposit(100, Today, "Checking");
        assertEquals(MrB.getDeposit(), "[Deposit of: $100.0 Date: Wed Dec 31 16:00:00 PST 1969 into account: Checking]");
    }

    @Test
    public void testWithdrawToString(){
        //assertArrayEquals(MrX.getWithdraw(),);
        MrB.withdraw(100, Today, "Saving");
        assertEquals(MrB.getWithdraw(),"[Withdraw of: $100.0 Date: Wed Dec 31 16:00:00 PST 1969 into account: Saving]");
    }
}