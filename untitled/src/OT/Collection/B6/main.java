package OT.Collection.B6;

public class main {
    public static void main(String[] args) {
        Classroom c= new Classroom();
        c.addStudent(new Student("S1", "Hà", 9.0f));
        c.addStudent(new Student("S2", "Nam", 7.5f));
        c.addStudent(new Student("S3", "Lan", 8.2f));
        c.printAll();
         c.deleteStudent("s1");
         c.printAll();
         c.gpaMax();
         c.demSv();
    }
}
