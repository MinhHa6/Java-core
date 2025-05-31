package Lab06.B5;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        int []arr= new int[]{4,6,8,2,9};
        int min =0;
        for(int i=0;i<arr.length-1;i++)
        {
            min=arr[i];
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    min=arr[j];//vi tri phan tu nho nhat
                }
            }
        }

        System.out.println(min);
    }
}
