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
        listNguyen.add(7);
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
        // giai thuat blue sort
        for (int i=0;i<listNguyen.size();i++)
        {
            for (int j=i+1;j<listNguyen.size();j++)
            {
                if(listNguyen.get(i)>listNguyen.get(j))
                {
                    int temp=listNguyen.get(j);
                    listNguyen.set(j,listNguyen.get(i));
                    listNguyen.set(i,temp);
                }
            }
        }
        System.out.println("List nguyen sau khi dc sap xep tang dan la:"+listNguyen);
    }
}
