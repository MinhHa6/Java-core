package Java;

import java.util.ArrayList;

public class Lesson5 {
    public static void main(String[] args) {
        /*
        1.method- phuong thuc
        //bo tu kieu gia tri tra ve ten phuong thuc tham so
        {
        noi dung pt
        }
        2.bo tu
        public-private-protected-default
        3.javadoc
        luu y:thuong se viet tren phuong thuc
        cach viet:

        @param tham sotruyenvao-goiy
        @return giatritrave -goiy
        xuat ra 1 javadoc
         */
        //mang 1 chieu
        float [] arrFloat;//khai bao mang
        //cap phat bo nho cho mang systax: datatype [] tenmang = new datatype[size]
        float [] arrfloat =new float[5];
        // mang da chieu
        float [][] arrFloat2;//khai bao mang da chiue
        float [][] arrFloat3= new float[2][4];//cap phat bo nho cho cot
        //cach gan gia tri
        arrfloat[0]=2;
        arrfloat[1]=3;
        arrfloat[2]=4;
        //gan gia tri da chieu
        arrFloat3[0][0]=1;
        arrFloat3[0][1]=2;
        arrFloat3[0][2]=13;
        //gan gia tri cho mang 1 chiue nhanh
         arrFloat3=new float[][]{{1,2,3,4,5},{0,1,3,6}};
         //cach khac: int [][] arr3Float ={{6,6,5},{2,1,2}};
        // cacch truy cap
        //Systax: tenmang[vitri phan tu]
        int [] arr1= {2,3,4};
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println("arr1["+i+"]="+arr1[i]);
        }
        for (int i=0;i<arrFloat3.length;i++)
        {
            for (int j=0;j<arrFloat3[i].length;j++)
            {
                System.out.println("arr["+i+"]["+j+"]="+arrFloat3[i][j]);
            }
        }
        // mang 3 chiu
        int [][][] arr3= new int[1][2][3];
        //array
        //systax:giong object
        //arraylist  ten = new Arraylist();
        ArrayList arrayList1= new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add("Minh Ha");
        arrayList1.add("Nam dinh");
        for (int i=0;i<arrayList1.size();i++)
        {
            System.out.println(arrayList1.get(i));
        }
        //hashset
        // String
        char a;
        a='h';
        char [] arrChar = new char[]{'M','i','n','h','H','a'};
        String name ="Minh Ha";
        name="Vu Minh Ha";
        name.concat("Nam dinh");

    }
}
