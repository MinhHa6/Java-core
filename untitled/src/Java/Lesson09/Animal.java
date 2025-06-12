package Java.Lesson09;

public class Animal {
    protected String name;
    protected int leg;

    public Animal(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    void show ()
    {
        System.out.println(name);
        System.out.println(leg);
    }
}
