package core.jumpStatements;

public class JumpStatements {
    /*
    cau lenh ngat quang dc dung de thay doi luong thuc thi binh thuong cua chuong trinh. chung cho phep ban nhay ra khoi vong lap,bo qua mot phan ma
    haoc quay lai dau vong lap
    1.cau lenh break
    - khi gap cau lenh break vong lap ngya lap tuc ket thuc va chuong trinh se tiep tuc dieu khien o cau lenh tiep theo vaong lap.
    cau lenh break cua java su dung de ngat vong lap hoac dunng de chuyen doi
    ap dung :dung khi muon dung vong lap ngay lap tuc
    cu phap jum_statement;
    break;
2.continue
cau lenh continue dc su dung trong cau truc dieu khien vong lap khi ban can nhay den vong lap tiep theo cua vong lap tiep theo ngay lap tuc .
Co the su dung vs for while do while
cau lenh continue cua Java dc du dung de tiep tuc vong lap .No tiep tuc luong hien tai cua chuong trinh va bo qua ma con lai o dieu kien chi dinh
ap dung:su dung khi muon bo qua dieu kien nao do khi duyet mang
cu phap :continue;
3. return
dung de thoat khoi phuong thuc va co the tra ve neu ko phai phuong thuc void

     */
    public static String checkNumber(int n)
    {
        if(n%2==0)
        {
            return "even ";
        }
        return "odd";
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("So:" + i);
        }
        // continue
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("So le:" + i);
        }
        // return
        System.out.println(checkNumber(5));
    }
}
