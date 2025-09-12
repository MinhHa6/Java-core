package OT.Collection.B6;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student>dshs= new ArrayList<>();
    // them hs moi vao ds
    public void addStudent(Student student)
    {
        dshs.add(student);
    }
    // xoa sinh vien
    public void deleteStudent(String id) {
        if (dshs.isEmpty()) {
            System.out.println("Không có sinh viên nào");
            return;
        }

        Student found = null;
        for (Student s : dshs) {
            if (s.getId().equals(id)) {
                found = s;
                break;
            }
        }

        if (found != null) {
            dshs.remove(found);
            System.out.println("Đã xóa sinh viên có id: " + id);
        } else {
            System.out.println("Không tìm thấy sinh viên có id: " + id);
        }
    }
    //tim sinh vien co spa cao nhat
    public  void gpaMax()
    {
        Student gpaMax=dshs.get(0);
        for(Student s:dshs)
        {
            if(s.getGpa()>gpaMax.getGpa())
            {
                gpaMax=s;
            }
        }
        System.out.println("Hs co gpa cao nhat la:"+gpaMax);
    }
    //dem so sinh vien co gpa >=8.0
    public void demSv()
    {
        int count =0;
        for (Student s:dshs)
        {
            if(s.getGpa()>=8.0)
            {
                count++;
            }
        }
        System.out.println("So hs co diem gpa>8 la:"+count);
    }
    // In danh sách học sinh
    public void printAll() {
        System.out.println("=== Danh sách học sinh ===");
        for (Student s : dshs) {
            System.out.println(s);
        }
    }
}
