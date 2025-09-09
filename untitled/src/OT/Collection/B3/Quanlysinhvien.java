package OT.Collection.B3;

import OT.OOP.B3.InterEmployee;

import java.util.HashMap;
import java.util.Map;

public class Quanlysinhvien {
    public static void main(String[] args) {
        Map<Integer,String>dsSV= new HashMap<>();
        // map luu theo cap keyvalue va ko dc de key trung nhau
        dsSV.put(1,"Ha");
        dsSV.put(2,"Hoang");
        dsSV.put(3,"Hien");

        // duyệt qua entrySet lay ca key va values
        for (Map.Entry<Integer, String> entry : dsSV.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("-------");
        dsSV.getOrDefault(1,"Ha");
        //xoa
        System.out.println("------------");
        dsSV.clear();
        for (Integer key:dsSV.keySet())
        {
             System.out.println(key);
        }
    }
}
