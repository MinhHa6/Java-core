package Lab07.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> listNguyen= new ArrayList<>();
        listNguyen.add(3);
        listNguyen.add(5);
        listNguyen.add(4);
        listNguyen.add(1);
        listNguyen.add(5);
        listNguyen.add(4);
        System.out.println("List nguyen:"+listNguyen);
        listNguyen.set(1,6);
        System.out.println("List nguyen sau khi update o vi tri thu [1] la"+listNguyen);
        System.out.println(" phan tu thu [1] bi xoa  la:"+listNguyen.remove(1)) ;
        System.out.println("Sap xep giam dan :");
        Collections.sort(listNguyen,Collections.reverseOrder());
        System.out.println(listNguyen);
        // sap xep bang bieu thuc lamda
        System.out.println("Ds sap xep tang dan:");
        listNguyen.sort((a,b)->a-b);
        System.out.println(listNguyen);
    }
}
