package core.regex;

import java.util.regex.*;
import java.util.regex.Pattern;

/*
JavaRegex bieu thuc chinh quy
regex la 1 api manh me trong Java dung de xac dinh mau tim kiem va thao tac voi moi chuoi ky tu
Trong Java regex dc ho tro thong qua javauntil.regex gom cac thanh phan chinh sau
1.MatchResult
2.Matcher class
3.Pattern class
4.PatternSyntaxException class
2.partter class
-parter class la phien ban dich cu abieu thuc chinh quy,dung de dinh nghia mau(patter) va ket hop matcher  de xu ly chuoi
3.Cac phuong phap viet regex
co 3 phuong phap tao regex
su dung pattern va matcher
-dung khi can xu ly phuc tap ( dung nhieu lan, thao tac vs grop,start/end,lap lai find ...
🎯 Tổng kết
Có 6 cách viết và sử dụng Regex trong Java:

Pattern + Matcher → mạnh mẽ, linh hoạt.
Pattern.matches() → kiểm tra nhanh.
String.matches() → đơn giản, gọn.
String.split() → tách chuỗi.
String.replaceAll()/replaceFirst() → thay thế chuỗi.
Scanner với regex → đọc dữ liệu theo mẫu.


👉 Với Java Regex, bạn có thể dễ dàng xử lý các tác vụ như:

Kiểm tra định dạng email, số điện thoại.
Tách chuỗi theo dấu phẩy, khoảng trắng.
Trích xuất thông tin từ văn bản.
Thay thế, làm sạch dữ liệu đầu vào.
4. Cac loai partter trong java regex
Trong Java, Pattern (thuộc java.util.regex) cho phép mô tả nhiều mẫu ký tự (pattern) khác nhau. Nắm vững các loại pattern này sẽ giúp bạn xử lý chuỗi linh hoạt hơn.
 */
public class JavaRegex {
    public static void main(String[] args) {
        String text= "Xin chao 2025";
        String regex="\\d+"; // tim so
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
        {
            System.out.println("Tim thay:"+matcher.group());
        }

        // Su dung pattern>matches
        // dung khi can validate du lieu (email,sodien thoai,password)
        String email= "minhha1192003@hmail.com";
        String regexs= "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$";
        boolean isValid= Pattern.matches(regexs,email);
        System.out.println("email hop le ?"+isValid);
    }
}
