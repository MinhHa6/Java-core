package core.variable;

public class Variables {
    int instance;// bien instance thuoc doi tuong
    static int staticVar =100; // bien static thuoc lop
    final double pi=3.14; // bien hang so
    String wekcome ="Welcome to java";// bien tham chieu doi voi string
    public  void printName()
    {
        String localVar = "Tay Java";// bien cuc bo
        System.out.println(localVar);
    }
    public void display()
    {
        System.out.println(wekcome);
    }
    public static void main(String[] args) {

    }
}
