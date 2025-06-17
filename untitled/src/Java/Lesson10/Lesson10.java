package Java.Lesson10;

import Lab09.B1.Main;

public class Lesson10 {
    /*
    //I.ke thua
    -lop con chi ke thua duy nhat1 lop cha,
    -1 lop cha co the nhieu lop con ke thua
    -lop con co the ke thua tu 1 lop con khac
    -Luu y:
    +cac truong cua lop tra co the duoc ke thua o lop con
    +cac phuong thuc o lop con co the ghi de hoac ke thua o lop cha
    +Neu khai bao ten truong cua lop cha thi truong cua lop cha se tu dong an di tai lop con
    +Co the them truong moi o lop cha
    +Co the su dung constructer  hay cac bien an di chung ta su dung tu khoa super
    +Da ke thua thi lop con thi extends
    //II. Da hinh
    -Duoc the hien qua overloading va overriding
    +Overloading : nap chong - cung ten pjuong thuc (constructer) nhang tham so truyen vao la khac nhau
    +overiding :ghi de =cung ten phuong thuc va tham so chi xuat hien khi lop con ke thua lop cha
    //III.actract
    -abtract class
    -asbtrac method-phuong thuc abtracts nam trong abtrac class hoac nam trong interface
     */
    /*
    // try ... catch ...
    try {
    -ham xu ly 1(co the xay ra loi)
    -ham xu ly 2 (co the xay ra loi)
    ...
    -ham-xu ly -n (co the xay ra loi)
    }catch (loai loi_1_ten){
    -ham dua ra thong bao loi
    -ham xu ly loi khi xay ra
    }
    catch (loai_loi_ten_2){
    -ham dua ra thong bao loi
    -ham xu ly loi khi xay ra
    }
     catch (loai_loi_ten_n){
    -ham dua ra thong bao loi
    -ham xu ly loi khi xay ra
    }
    finally {
    Ham_xu_ly(chac_chan_duoc_thuc_thi)
    }
    //luu y:
   sau khi cac ham trong try hoac catch da duoc thuc hien het thi ham trong final se duoc thuc thi
   loi bac thap luon phai duoc viet trc loi bac cao
     */
    public static void main(String[] args) {
        Mathematics mathematics= new Mathematics();
        mathematics.devide(6,2);
        mathematics.devide(5,0);
        try {
            mathematics.devide2(3,0);
        }
catch (ArithmeticException e)
{
    System.out.println(e);
}
    }
}
