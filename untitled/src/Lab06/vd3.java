package Lab06;

import java.util.ArrayList;
import java.util.Collections;

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
            System.out.println((i+1)+"-"+get);
        }
        // sap xep theo ds amphabet
        Collections.sort(stMonHoc);
        System.out.println("Ds sau khi duoc sap xep la:");
        for (int i=0;i<stMonHoc.size();i++)
        {
            String get=stMonHoc.get(i);
            System.out.println((i+1)+"-"+get);
        }
    }

    public static void main(String[] args) {
        vd3 vs = new vd3();
        vs.test();
    }
}
