package Lab07.Set;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<Integer>setTree= new TreeSet<>();
        //Treeset ko lay phan tu trung lap,tu dong sap xep cac phan tu
        setTree.add(8);
        setTree.add(4);
        setTree.add(4);
        setTree.add(5);
        setTree.add(6);
        setTree.add(7);
        System.out.println(setTree);
        // kiem tra phan tu co trong set ko
        System.out.println(setTree.contains(4));
        // xoa phan tu trong treeset
        System.out.println(setTree.remove(4));
        System.out.println(setTree);
    }
}
