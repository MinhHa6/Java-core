package Lab07;

public class generricclass <T>{
    private  T bienT;
    public void add(T t)
    {
        this.bienT=t;
    }
    public T getBienT()
    {
        return this.bienT;
    }
}
