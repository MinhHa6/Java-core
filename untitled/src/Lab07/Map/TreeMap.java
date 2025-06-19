package Lab07.Map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Integer,String>treeMap= new java.util.TreeMap<>();
        treeMap.put(1,"Ha");
        treeMap.put(2,"Minh");
        treeMap.put(3,"Hoang");
        treeMap.put(3,null);
        // hien thi treemap
        System.out.println(treeMap);
        // lay thong tin o khoa 1
        System.out.println("Thong tin khoa 1:"+treeMap.get(1));
        //
        treeMap.containsKey(2);
        // kiem tra
        System.out.println(treeMap.containsKey(3));
        // thong tin sau ghi de thong tin truoc 
    }
}
