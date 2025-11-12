package core.oop.encapsulations;

public class User {
    // thuoc tinh private chi cho tru cap tu ben trong lop nay

    private String name;
    private int age;
    // phuong thuc get cua thuoc tinh name
    public  String getName(String name)
    {
        return name;
    }
    // phuong thuc setter cho thuoc thinh name
    public void setName(String name)
    {
        this.name=name;
    }// phuong thuc get cho age
    public int getAge(int age)
    {
        return age;
    }
    // phuong thuc setter cho thuoc tinh age
    public void setAge(int age)
    {
        if(age >18)
        {
            this.age=age;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
