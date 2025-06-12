package Java.Lesson09;

public class Herbivore extends Animal{
    String name;
    int age;

    public Herbivore(String name, int leg,int age) {
        super(name, leg);
        this.age=age;
    }

    @Override
    void show()
    {
        System.out.println("Herbivore");
        super.show();
        System.out.println(age);
    }
}
