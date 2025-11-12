package core.oop.polymorphism;

public class SampleOverLoading {
    // thay doi so luong arguments
    public int add (int a,int b)
    {
        return a+b;
    }
    public int add (int a, int b,int c)
    {
        return a+b+c;
    }
    // thay doi kieu du lieu
    public float add (float a, int b)
    {
        return a+b;
    }
    public float add (float a, float b,float c)
    {
        return a+b+c;
    }
}
