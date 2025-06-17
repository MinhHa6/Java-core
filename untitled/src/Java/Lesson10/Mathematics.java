package Java.Lesson10;

public class Mathematics {
    public void devide (int num1 ,int num2)
    {
        try {
            System.out.println(num1+"/"+num2+"="+(num1/num2));
        }
        catch (ArithmeticException e)
        {
            System.out.println("class: Mathematics -method:devide "+e.getMessage());
        }
        finally {
            System.out.println("Method excutation compled");

        }
    }
    public void devide2 (int num1 ,int num2) throws ArithmeticException
    {
       if (num2==0)
       {
           throw new ArithmeticException("chia cho 0");
       }
       else
       {
           System.out.println(num1+"/"+num2+"="+(num1/num2));
       }
    }
}
