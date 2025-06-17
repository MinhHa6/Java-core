package Java.Lesson10;

public class InsufficentFE extends  Exception {
    private  double amount;
    @Override
    public  void printStackTrace ()
    {
        System.err.println("Tai khoan cua quy khach ko du thuc hien giao dich");
        super.printStackTrace();
    }
    public InsufficentFE (double amount)
    {
        this.amount=amount;
    } public double getAmount ()
    {
        return amount;
    }

}
