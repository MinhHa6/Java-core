package core.multithreading;
/*
-multhithreading trong java la 1 ky thuat cho phep mot ung dung thuc thi dong thoi nhieu doan ma ( nhieu luong- thread). viec nay giup tang hieu suat va tan dung toi da tai nguyen
Multithreading dc bt huu ich trong cac ung dung can xu ly song song nhu:
- ung dung web
-game
-xu ly du lieu lon
1. thread la j
- trong Java, thread la don vi nhi nhat cua tien trinh (process) co the chay song song voi cac thread khac trong cung tien trinh
-cac thread chia se bo nho cua tien trinh cha
-moi thread co the thuc hien cac tac vu rieng biet
* co 2 cach tao thread
ke thua lop thread
- cai dat interface Runnable
2. Tao thread ban cach ke thua lop thread
4. Su khac biet giua thread va Runnable
-Extends Thread:Ko the ke thua them class nao khac
-Implements Runnable: Linh hoat hon vi van co the ke thua class khac
5. Cac phuong thuc quan ly Thread
start() -> Bat dau mot thread
run() → Định nghĩa công việc của thread (không gọi trực tiếp).
sleep(milliseconds) → Tạm dừng thread.
join() → Chờ một thread khác kết thúc.
yield() → Nhường CPU cho thread khác cùng ưu tiên.
setPriority(int priority) → Đặt độ ưu tiên (1–10).
isAlive() → Kiểm tra thread còn đang chạy hay không.
6. Thrad Synchronization(Dong bo hoa)
Khi nhieu thrad truy cap cung 1 tai nguyen,de xay ra race condition.Giai phap:Su dung tu khoa synchronized
7.ExecutorService va threadPool
- de quan ly nhieu thrad hieu qua, su dung executorService.No dung threadPool de tai su dung thread, giup tiet kiem tai nguyen
8. Deadlock và Livelock
Deadlock: Xảy ra khi nhiều thread chờ lẫn nhau giải phóng tài nguyên → tất cả bị treo.
Livelock: Các thread vẫn chạy và thay đổi trạng thái, nhưng không tiến triển công việc.
 */
public class JavaMultithreading {
}
