package core.oop.abstractioni;

public class SampleExtendClass extends SampleAbstractClass{

    // ghi de phuong thuc abstract mehod
    @Override
    public void sayHello() {
        System.out.println("Hello,Vu Minh Ha");
    }
    // ghi de phuong thuc non abstractMethod
    @Override
    public int calculate(int a,int b)
    {
        return a*b;
    }
}
