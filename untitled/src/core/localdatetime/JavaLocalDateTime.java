package core.localdatetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Locale;

/*
 localdatetime la 1 class trong java time api(java.time) dc gioi thieu tu java 8.No dai dien cho ngay+gio nhung ko co thong tin mui gio timezone
 vid u:2025-09-10 t12:30:15 -> day chi la ngay h dia phuong  loacl, chua bt thuoc mui h nao
 1.Cach tao Localdatetime
 a. lay thoi gian hien tai
b. tao thu cong
2. cac phuong thuc cua localdateime
a. khoi toa (Factory methods)
now()	Lấy thời gian hiện tại theo hệ thống
now(ZoneId zone)	Lấy thời gian hiện tại theo múi giờ
of(int y, int m, int d, int h, int min)	Tạo LocalDateTime với năm, tháng, ngày, giờ, phút
of(int y, int m, int d, int h, int min, int s)	Tạo với năm, tháng, ngày, giờ, phút, giây
of(LocalDate date, LocalTime time)	Tạo từ LocalDate + LocalTime
parse(CharSequence text)	Parse chuỗi ISO-8601 thành LocalDateTime
parse(CharSequence text, DateTimeFormatter f)	Parse chuỗi với định dạng custom
b.Lay thong tin (Gettter)
getYear()	Lấy năm
getMonth()	Lấy tháng (enum Month)
getMonthValue()	Lấy tháng (1–12)
getDayOfMonth()	Ngày trong tháng (1–31)
getDayOfWeek()	Ngày trong tuần (enum DayOfWeek)
getDayOfYear()	Ngày trong năm (1–365/366)
getHour()	Lấy giờ (0–23)
getMinute()	Lấy phút (0–59)
getSecond()	Lấy giây (0–59)
getNano()	Lấy nano giây
.c chinh sua thoi gian
d. so danh
e.chuyendoi
f.dinh dang
3. cac phuong thuc hay dung
a. lay thong tin ngya thang nam h
b. cong tru thoi gian
c. so sanh thoi gian
4. dinh dang(formatting)
5.chuyen doii localdatetime kieu khac
6. khi nao dung Localdatetime
- khi nao can lam viec vs ngay gio nhung ko can mui g
-phu hop cho du lieu :cocal: nhu
+ngay sinh nhat,lich hen
+Deadline trong he thong
Neu can ,mui h chinh xac vi du:event toan cau,dat ve may bay) hay dung zoneDatetime hoac OffsetDatime

 */
public class JavaLocalDateTime {
    public static void main(String[] args) {
        // tao localdatetime
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Thoi gian hien tai:"+now);
        // toa thu cong
        LocalDateTime birthday= LocalDateTime.of(2003,10,06,16,45);
        System.out.println("Ngay h toa thu cong:"+birthday);
        // localDatime-> locatdate/loacaltime
        System.out.println("Chi ngay:"+now.toLocalDate());
        System.out.println("chi gio :"+now.toLocalTime());
        // localdatetime -> instant (can zoneOffset)

        Instant instant= now.toInstant(ZoneOffset.UTC);
        System.out.println("Instant(UTC):"+instant);
    }
}
