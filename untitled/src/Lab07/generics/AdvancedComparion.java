package Lab07.generics;

public class AdvancedComparion <T extends Comparable<T>>{
    public  void maximum (T a, T b, T c)
    {
        T max=a;
        if (b.compareTo(a)>0)
        {
            max=b;
        }
        if (c.compareTo(b)>0) {
            max=c;
        }
        System.out.println("Maximum :"+max);
    }
}
