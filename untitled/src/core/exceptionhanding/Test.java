package core.exceptionhanding;

public class Test {
    static void checkScore(int score) throws CustomerException
    {
        if(score <50)
        {
            throw new CustomerException(" diem qua thap ko dat dc ");
        }
        System.out.println("Diem hop le:"+score);
    }
    public static void main (String []args)
    {
        try {
            checkScore(30);
        }
        catch (CustomerException e)
        {
            System.out.println("Loi:"+e.getMessage());
        }
    }
}
