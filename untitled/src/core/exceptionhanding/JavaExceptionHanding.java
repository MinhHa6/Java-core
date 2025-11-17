package core.exceptionhanding;
/*
Exceptionhanding trong java la co che xu ly loi xay ra trong ung dung de dam bao ung dung hoat dong on dinh va tranh bi gian doan dot ngot.Java cung cap cac tu
khoa de xu ly ngoai le bao gom :try,catch,finally,throw, va throws
1. cau truc cua lop JavaException
Lop java.lang.throwable la lop cua he thong phan cap javaException dc ke thua boi 2 lop con:Exception va error
2.cac laoi exception trong java
trong java,exception dc chia thanh 2 loai chinh
-checked Exception:day la nhung ngoai le ma trinh bien dich bat buoc phai xu ly (thuong la ngoai le co the xay ra trong qua trinh doc file,
ket noi co so du lieu,...) vi du:Ioexception,SqlException
-Unchecked Excepotion :La nhung ngoai le xay ra khi loi lap trinh va ko bi trinh vien dich kiem tra.Thuong la cac loi logic trong chuong trinh,vidu:
ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.
3. Cac tu khoa chinh
try :dc su dung de bao boc doan ma phat sinh ngoai le
catch :dung de xu xy cac ngoai le phat sinh trong khoi try.Khi ngoai le xay ra,Java se tim khoi catch tuong ung xu ly.
fillnaly: khoi lenh nay luon dc thuc thi du ngoai le co xay ra hay ko.No thuogn dc dung de don dep tai nguyen nhu dong tap hoac ket noi co so du lieu
throw:duoc dung de nem ra 1 ngoai le mot cach ro rang trong chuong trinh
throws:khai bao ngoai le co the phat sinh trong phuong thuc de phuong thuc goi bt rang ngoai le co the xay ra va phai dc xu ly .
4. cu phap Exeception handing trong java
try/catch/finally
try {
    // Mã có thể gây ra ngoại lệ
} catch (ExceptionType1 e1) {
    // Xử lý ngoại lệ loại ExceptionType1
} catch (ExceptionType2 e2) {
    // Xử lý ngoại lệ loại ExceptionType2
} finally {
    // Khối lệnh này sẽ luôn được thực thi (dù có ngoại lệ hay không)
}
* su dung throw  va throws
throw dung de nem ra 1 ngoai le cu the
throws: dung de khai bao method, cho bt method co the phat sinh nggoai le nao
5. loi ich cua exxep handding
Bao ve chuong tirnh khoi dung dot ngot
-> khi ngoai le xay ra chuong trinh ko bi crash ma tim cach xu ly
-tach biet logic binh thuong va xu ly loi
-> gip chuong trinh de doc va ro rang hon
-giam thieu rui ro
-> co the xu ly truoc nhung tinh huong bat ngo
6. Luu y khi xu ly exception
- ko xu ly ngoai le chung chung
-> tranh catch( exception e) ma ko bt loai ngoai le
ko bo qua khoi catch
-> ne log hoac xu ly, tanh de trong
luon dung finally de giai phong tai nguyen
-> vi dun dong ket noi csdl dong file
-cao custom exception khi can
-> cho cac truong hop dac biet cua ung dung
*** ghi nho nhanh
-checkedException:loi du doan trc(bat buoc xu ly)
-uncheckedException :loi thuong do lap trinh sai(ko bat buoc xu ly)
 */
public class JavaExceptionHanding {
    public static void main(String[] args) {
        try
        {
            int result = 10/0;// phat sinh Arith,eticException
        }
        catch (ArithmeticException e)
        {
            System.out.println("Ko the chia cho 0");
        }
        finally {
            System.out.println("Doan code trong finally luon dc thu thi ");
        }
        // handle exception bang try.catch
        try
        {
            validateAge(16);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
    // 'throws' khai bao noai le co the phat sinh
    static void validateAge(int age) throws ArithmeticException
    {
        if(age<18)
        {
            // 'throw' nem ra ngoai le khi dieu kien ko thoa man
            throw  new ArithmeticException("Ko du cuoi vo ");
        }
        else {
            System.out.println(" Bac si bao cuoi thi cuoi thooi");
        }
    }
}

