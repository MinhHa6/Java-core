package Lab06;

import java.util.ArrayList;

public class vd3 {
    ArrayList<String> stMonHoc = new ArrayList<>();
    public void test()
    {
        stMonHoc.add("Java");
        stMonHoc.add("C#");
        stMonHoc.add("Sql");
        stMonHoc.add("Android");
        System.out.println("Danh sach chua sap xep:");
        for (int i=0;i<stMonHoc.size();i++)
        {
            String get=stMonHoc.get(i);
            System.out.println((i+1)+get);
        }
    }
    public static void main(String[] args) {

    }
}
