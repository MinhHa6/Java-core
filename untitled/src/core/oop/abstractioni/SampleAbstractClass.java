package core.oop.abstractioni;

public abstract class SampleAbstractClass {
    // abstract method
    public abstract void sayHello(); // abstract method has not body
    // no abstract method has body
    public int calculate(int a,int b)
    {
        return a+b;
    }
    // sattic method
    public static void sayGoodBye()
    {
        System.out.println("bye!");
    }
    // constructor
    protected  SampleAbstractClass (){};
    // final method
    public final void noChangeBody()
    {
        System.out.println("Lop con ko dc thay doi noi dung phuong thuc nay vi no final method ");
    }

}
