package Java.lab8demonested;

public class nested {
    String name;
    int age;
    public void display (){
        System.out.println("Name :"+name);
        System.out.println("Tuoi:"+age);
        Nested nested= new Nested();
        System.out.println("Adress:"+nested.adress);
    }
    class Nested
    {
        public String adress;

    }
}
