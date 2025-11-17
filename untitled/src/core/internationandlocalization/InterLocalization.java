package core.internationandlocalization;

import java.util.Locale;

/*
Internationalization (i18n):Quoc te hoa-qua trinh thiet ke ung dung de co the ho tro nhieu ngon ngu/ khu vuc
-localization(110): ban dia hoa- qua trinh dich thuat va tuy chinh ung dung theo ngon ngu va van hoa cu the
1.internationnalization (i18n) -quuoc te hoa
truoc khi ap dung I18N can hieu rang nhieu du lieu phu thuoc va khu vuc dia ly va van hoa,vi du :
Messages(thong diep)
- dates (ngay thang)
Times (Thời gian)
Numbers (Số)
Currencies (Tiền tệ)
Measurements (Đo lường)
Phone Numbers (Số điện thoại)
Postal Addresses (Địa chỉ bưu điện)
Labels trên GUI components
a,Lop locale
- locale dai dien cho 1 khu vuc hoac van hoa. No cun gcap thong tin:ngon ngu, quoc gia, bien the ...
- Mot so hang so trong Locale
ublic static final Locale ENGLISH;...
- cac constructor cua Locale
Locale(String language)
Locale(String language, String country);
Locale(String language, String country, String variant);
b.resourceBundle
-ResourceBundle dc dung de quoc te hoa message(text hien thi)
 Giải thích:

ResourceBundle.getBundle("messages") → Java sẽ tự động tìm file messages_{ngôn ngữ}_{quốc gia}.properties phù hợp với Locale.

Nếu không tìm thấy, nó sẽ fallback về messages.properties (nếu có).

Điều này giúp ứng dụng hiển thị đúng ngôn ngữ theo khu vực mà không cần viết code if-else phức tạp.
2.Internationalizing Currency (Tiền tệ)
- vidu:Hien thi tien te theo tung khu vuc
3. Internationalizing Date (Ngày tháng)
– Ví dụ: Lấy ngày tháng năm theo local mặc định.
4. Internationalizing Time (Thời gian)
– Ví dụ: Lấy thời gian theo local mặc định.
 */
public class InterLocalization {
    public static void main(String[] args) {
        Locale locale= Locale.getDefault();
        System.out.println("getCountry():"+locale.getCountry());
        System.out.println("getDisplayCountry(): " + locale.getDisplayCountry());
        System.out.println("getLanguage(): " + locale.getLanguage());
        System.out.println("getDisplayLanguage(): " + locale.getDisplayLanguage());
        System.out.println("getDisplayName(): " + locale.getDisplayName());
        System.out.println("getISO3Country(): " + locale.getISO3Country());
        System.out.println("getISO3Language(): " + locale.getISO3Language());
        //chuyen tu tieng viet sang ngon ngu khac
        Locale vnLocale = new Locale("vi","VN");
        Locale chinaLocal =Locale.CHINA;
        Locale japanLocale =Locale.JAPAN;
        System.out.println("Vn:"+vnLocale.getDisplayLanguage(vnLocale));
        System.out.println("China:"+chinaLocal.getDisplayLanguage(chinaLocal));
        System.out.println("NB:"+japanLocale.getDisplayLanguage(japanLocale));
        // Hien thin ngon ngu tu nhieu Locale
        Locale []locales= {
                new Locale("en","GB"),
        new Locale("fr","FR"),
                new Locale("es","ES")
        };
        for (Locale loc:locales)
        {
            String displayLanguage = loc.getDisplayLanguage(loc);
            System.out.println(loc+ ":"+displayLanguage);
        }
    }

}
