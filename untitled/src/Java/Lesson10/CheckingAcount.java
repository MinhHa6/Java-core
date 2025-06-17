package Java.Lesson10;

import javax.naming.InsufficientResourcesException;
import java.security.PublicKey;

public class CheckingAcount {
    private  double balance;
    private  int number;
    public  CheckingAcount (int number)
    {
        this.number=number;
    }
    public void deposit (double amount)
    {
        balance+=amount;
    }
    public void withdraw (double amount) throws  InsufficentFE
    {
            if(amount<=balance)
            {
                balance-=amount;
            }
            else
            {
                double needs=amount-balance;
                throw new InsufficentFE(needs);
            }
    }
    public double getBalance()
        {
            return balance;
        }
        public int getNumber ()
        {
            return number;
        }

}
