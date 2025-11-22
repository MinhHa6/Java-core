package core.bt.lab06;

import java.util.Scanner;

// nhap mang co n phan tu cac nguyen to , In ra cac phan tu la so nguyen cua mang
// nhap mang n phan tu in ra cac phan tu la so chan
// sap xep mang bang thuat toan chon truc tiep (selection sort)
// sap xep mang tang dan bang thuat toan noi bot
// sap xep mang tang dan bang thuat toan chen
public class B3 {
    static  boolean soNguyenTo(int n)
    {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
   static void  soChan(int arr [])
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 ==1)
            {
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println();
    }
    static void  selectionSort(int arr [])
    {
        int n= arr.length;
        for (int i=0; i<n-1;i++)
        {
            int minIndex= i;
           for (int j=i+1;j<n;j++)
           {
               if(arr[j]<arr[minIndex])
               {
                   minIndex =j;
               }
           }
            // Hoán đổi
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // In mảng sau mỗi vòng i
            System.out.print("Vong " + (i+1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
     }
static void blueSort(int arr [])
{
    int n= arr.length;
    for(int i=0;i<n-1;i++)
    {
        for (int j=0;j<n-i-1;j++)
        {
            if (arr[j] < arr[j+1])
            {
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        // in mang sau moi vong lap i
        System.out.println("Sau vong"+(i+1)+":");
        for (int k=0;k<n;k++)
        {
            System.out.println(arr[k]+"");
        }
        System.out.println();
    }
}
    static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // phần tử cần chèn
            int j = i - 1;

            // Dời các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Chèn key vào vị trí đúng
            arr[j + 1] = key;

            // In mảng sau mỗi bước
            System.out.print("Sau vong " + i + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n phan tu cua mang:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        // in ra cac so nguye to
        for (int i=0;i<n ;i++)
        {
            if(soNguyenTo(arr[i]))
            {
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println("So le  cua mang la:");
        soChan(arr);
        System.out.println("Mang tang  dan cua mang la:");
        selectionSort(arr);
        System.out.println("Mang sap xep giam dan la :");
        blueSort(arr);
        System.out.println("Mang sap xep la:");
        insertionSort(arr);
    }
}
