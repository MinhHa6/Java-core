package core.localdatetime;

import java.time.LocalDateTime;
import java.util.Locale;

/*
 localdatetime la 1 class trong java time api(java.time) dc gioi thieu tu java 8.No dai dien cho ngay+gio nhung ko co thong tin mui gio timezone
 vid u:2025-09-10 t12:30:15 -> day chi la ngay h dia phuong  loacl, chua bt thuoc mui h nao
 1.Cach tao Localdatetime
 a. lay thoi gian hien tai

 */
public class JavaLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Thoi gian hien tai:"+now);
    }
}
