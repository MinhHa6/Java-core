package Java.Lesson10;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAcount checkingAcount= new CheckingAcount(101);
        System.out.println("Depositing 500$");
        checkingAcount.deposit(500.000);
        try
        {
            System.out.println("\n Withdrawing 100$");
            checkingAcount.withdraw(100.00);
            System.out.println("With 600$");
            checkingAcount.withdraw(600.00);
        }
        catch (InsufficentFE e)
        {
            e.printStackTrace();
        }
    }
}
