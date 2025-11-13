package core.javastring;
/*
1. Java String la j
trong java String co ban la mot doi tuong bieu dien chuoi cac gia tri char.Mot mang cac ky tu hoat dong giong nhu Java Sring
-Lop java String cung cap nhieu phuong thuc de thuc hien cac de xu ly String nhu compare(),concat(),equals(),split(),length(),replace(),compareTo(),intern()
,substring(),...
-interface charSquerece dc sd de bieu dien chuoi ky tu .Cac lop String,StringBuffer,StringBuider deu implement no.Dieu do co nghia la chung ta co the su dung
tao mot string trong Java bang cach su dung 3 lop nay/
-Java String la bat bien nghia la ko the thau doi kich thuoc cu ano.Bat cu khi nao chung ta thay doi bat ky String nao thi mot istance moi se dc
tao ra .Neu ban muon su dung cac chuoi co the thay doi thi co the dung stringbuider va stringbuffer
2.De khoi tao 1 java String
a.su dung String literal
String dc tao ra voi dau ""
String s1="well come vu minh ha"
-moi lan tao ra 1 string jvm se kiem tra " String constant pool" truoc neu string da ton tai trong pool thi 1 tham chieu den instance do se dc tao ra .neu String do
chua ton tai thi jvm se tao String moi
* tai sao dung String literal
de lam java su dung bo nho hieu qua hon,boi vi khong co doi tuong  moi nao dc tao neu no da ton tai trong Spring constant pool
b. su dung tu khoa new
Trong trường hợp như vậy, JVM sẽ tạo một đối tượng String mới trong bộ nhớ heap bình thường (không phải pool) và giá trị “Welcome to Tây Java” theo nghĩa đen sẽ được đặt trong Spring constant pool.
 Biến s sẽ tham chiếu đến đối tượng trong heap (không phải pool).

 */
public class JavaString {
    public static void main(String[] args) {
        char []ch ={'v','u','m','i','n','h','h','a'};
        String s= new String(ch);
        System.out.println(s);
        String s1= "welcome";
        String s2= "welcome";// jvm ko tao 1 String moi
        System.out.println(s2+s1);

        // tao doi tuogn String moi bang  new
        String s3 = new String("welcome");
    }
}
