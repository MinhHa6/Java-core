package core.loopstaments;

import java.util.ArrayList;
import java.util.List;

public class LoopStatements {
    /*
    1.vong lap for
    - vong lap for dung de lap lai chuong trinh nhieu lan.Neu so lan lap co dinh nen su dung vong lap for
    systax:
    for (initialization;condition;increment/decrement)
    {
    // statement or code to be executed
    2.vong lap for each
    ap dung khi: doc 1 ds voi cac kieu du lieu khac nhau theo tuan tu de tim ra gia tri tuong ung
    for (datat_type variable :array_name)
    {
    code to be executed
    }
    3.vong lap while
    vong lap while cua java dc su dung de lap lai mot phan cua chuong trinh nhieu lan cho den khi dieu kien boolean dc chi dinh dung.ngay khi dieu kien
    false vong lap se tu dong dung lai
    cu phap
    while (condition)
    {
    code to be executed
    ++ hoac --}
    4.vong lap do while
    ap dung :dung de duyet ds theo chi dinh
    do
    {
    code tobe executed / loop body
    // update statement
    }
    while (condition);
     */
    public static void main(String[] args) {
        for (int i=0;i<10;i++)
        {
            System.out.println("So:"+i);
        }
        // lap chong lap (++
        for (int i=1;i<=10;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
        // lap chong lap --
        for (int i=1;i<=10;i++)
        {
            for (int j=10;j>=i;j--)
            {
                System.out.println("*");
            }
            System.out.println();
        }
        // vong lap  for each
        List<String >list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String e:list)
        {
            System.out.println(e);
        }
        //vong lap while
        int x=5;
        while (x<=10)
        {
            System.out.println(x);
            x++;
        }
        // vong lap do while
        int y=5;
        do
            {
                System.out.println(y);
                y++;
            }
            while (y<4);
    }
}
