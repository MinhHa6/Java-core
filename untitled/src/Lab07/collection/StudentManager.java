package Lab07.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String>stSinhVien = new ArrayList<>();
    public static void main(String[] args) {
        StudentManager studentManager1 = new StudentManager();
        studentManager1.add();
        studentManager1.update();
        studentManager1.delete();
    }
    // ham them du lieu
    public void add ()
    {
        stSinhVien.add("Ha");
        stSinhVien.add("Hoang");
        stSinhVien.add("Kinh");
        stSinhVien.add("Anh");
        System.out.println("ArrayList Student:"+"\t"+stSinhVien+"\n");
    }
    // ham sua du lieu
    public  void update ()
    {
        stSinhVien.set(0,"Minh");
        System.out.println("ArrayList Student:"+"\t"+stSinhVien+"\n");
    }
    // ham xoa du lieu
    public void delete ()
    {
        stSinhVien.remove(0);
        System.out.println("ArrayList Student:"+"\t"+stSinhVien+"\n");
    }
}
