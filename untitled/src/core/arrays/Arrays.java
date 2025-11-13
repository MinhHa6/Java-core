package core.arrays;
/*
1.Java arrays la j
-La  mot doi tuong chua cac phan tu co cung kieu du lieu.Cac phan tu cua 1 mang dc luu tru trong 1 vi tri bo nho lien ke.Day la 1 cau truc du lieu
de luu tru cac phan tu giong nhau .Chung chi co the luu tru co dinh cac phan tu trong 1 nmang java
uu diem:+Toi uu code:no lam code dc toi uu hoa vi chung ta de dang sap xep va truy suat du lieu
+truy xuat ngau nhien: chung co the lay bat ky du lieu nao theo chi muc
Nhuc diem:
- gioi han kich thuoc :Chung ta chi co the luu tru co dinh cac phan tu trong mang .No ko tang kich thuco khi chay chuong trinh.De giai quyet van de nay javacollection co
the tu dong gia tang kich thuoc cua array
2.Cac loai arrays
co 2 laoi arrays
mang 1 chieu (single dimensional array)
mang da chieu (multidimensional array)
a. mang 1 chieu
cu phapp

dataType[] arr ;
dataType []arr;
datatype arr[];
// khoi tao
arrayRefva r = new datatype[size]
ArrayIndexOutOfBoundsException: Ngoại lệ ArrayIndexOutOfBoundsException xảy ra khi chúng ta cố gắng truy xuất phần tử ngoài độ dài của mảng.
b.Mang da chieu
cu phap dataType[][] arr; (or)
dataType [][]arr; (or)
dataType arr[][]; (or)
dataType []arr[];
c. mang rang cua
3.Clone mang
1 chieu
da chieu
 */
public class Arrays {
    public static void main(String[] args) {
//        int arr[] = new int[3];
//        arr[0] =1;
//        arr[1]=2;
//        arr[2]=3;
//        // duyet mang
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//        // mang string
//        String arrS[]= {"a","b","c"};
//        for ( String e:arrS)
//        {
//            System.out.println(e);
//        }
        // dinh nghia khai bao va khoi tao array
//        int arr[]= {2,3,4};
//        for(int a:arr)
//        {
//            System.out.println(a);
//        }
//        int yArr[]= {2,4,6};
//        System.out.println("Do dai cua mang la:"+yArr.length);
//        System.out.println(yArr[0]);
//        System.out.println(yArr[1]);
//        System.out.println(yArr[2]);
//        // dong nay bi loi arrIndexouOfBoundExeption do mang chi co 3 phan tu index=3 la ko ton tai
//        System.out.println(yArr[3]);
        /**
         * Mang da chieu
         */
        int [][]xArr= new int[3][3];// 3= row and 3= column
        xArr[0][0] = 1;
        xArr[0][1] = 2;
        xArr[0][2] = 3;

        xArr[1][0] = 4;
        xArr[1][1] = 5;
        xArr[1][2] = 6;

        xArr[2][0] = 7;
        xArr[2][1] = 8;
        xArr[2][2] = 9;
        System.out.println("----xArr----");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(xArr[i][j]);
            }
            System.out.println();
        }

        int[][] yArr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println("--- yArr ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(yArr[i][j]);
            }
            System.out.println();
        }
    }
}
