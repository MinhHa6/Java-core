package core.bt.lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu can nhap vao list :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>list = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
       for (Integer l:list)
       {
           System.out.println(l);
       }
       // blusort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // đổi chỗ
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
    }
}
