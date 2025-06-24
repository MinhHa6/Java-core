package Java.Lesson10;

import org.w3c.dom.ls.LSOutput;

public class Student {
    String name ;
    int age;
    public Student (String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
