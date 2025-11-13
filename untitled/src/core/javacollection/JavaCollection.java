package core.javacollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
1.Java Collection
-javacollection la 1 farmwork trong java dung de quan ly va thao tac voi nhom doi tuong.No cung cap 1 tap hop cac cau truc du lieu va cac thuat toan
de xu ly du lieu nhu them,xoa,duyet qua va sap xep cac phan tu .Java collection bao gom interface va classes giup lap trinh vien de qua ly du lieu
theo cach hieu qua hon.
2.interface
-collection : interface co so cho tat ca cac tap hop. No dinh nghia cac phuong thuc co ban nhu add(),remove(),size(),iteratoe(),...
-List:Interface mo rong tu collection, dai diencho 1 tap hop co thu tu va cho phep cac phan tu trung lap .vi du :Arraylist,linkedList
-Set:interface ko cho phep cac phan tu trung lap.vi du hashset,linkedhashset,treeset
Map:interface cho phep luu tru cac cap khoa gia tri,trong do moi khoa la duy nhat.vidu :hashmap,treemap,linkedMap
-Queue:Interface dai dien cho 1 tap hop cho phep xu ly cac phan tu theo thu tu thuong theo nguyen tac fifo .vd linkedList,priorityQueue
3.Class
-ArrayList:1 ds co the thay doi kich thuoc dc trien khai duoi dang mang dong
-LinkedList:mot ds su dung cau truc tdu lieu das lien ket cho phep them va xoa nhanh chong
hashset:1 tap hop ko cho phep cac phan tu trung lap va ko duy tri thu tu
LinkedHashSet:giong nhu hashset nhung duy tri thu tu chen cac phan tu
treeset:1 tap hop cho phep tu dong sap xep cac phan tu
hashmap:1 anh xa khong duy tri thu tu cho phep cac cap khoa gia tri
LinkedHashMap:giong nhu hashMap nhung duy tri thu thu chen cac muc
treeMap:1 anh xa sap xep cac khoa theo thu tu tu nhien hoac theo trinh soan thao comparator
4.Algorithms
jcf cung cung cap cho 1 so thuat toan huu ich de thao tac voi cac cau truc du lieu nhu
sort():sap xep cac phan tu trong 1 ds
shuffe():xao tron cac phan tu trong 1ds
reverse(): dao nguoc thu tu cua phan tu trong 1ds
binarySearch():Tim kiem nhi phan trong 1ds sap xep
5.Generics
Javacollections farmwork ho tro generics cho phep ban chi dinh loai du lieu ma tap hop se chua.Dieu chinh nay giup tang cuong tinh an toan kieu
typesafety va giam thieu loi runtime
6. Su khac biet giua cac collection
List:co thu tu cho phep trung lap
Set:ko co thu tu khong cho phep trung lap
Map:ko co thu tu (trong truong hop cua hashmap),cho phep khoa duy nhat va gia tri trung lap

 */
public class JavaCollection {
    public static void main(String[] args) {
        // Su dung arrayList
        List<String>fruits = new ArrayList<>();
        fruits.add("Chuoi");
        fruits.add("tao");
        fruits.add("xoai");
        System.out.println("Fruits:"+fruits);
        // su dung hashMAp
        HashMap<String,Integer>map = new HashMap<>();
        map.put("Dau",10);
        map.put("Tay",20);
        System.out.println("Tay:"+map.get("Tay")+"tuoi");
    }
}
