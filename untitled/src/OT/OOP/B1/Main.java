package OT.OOP.B1;

public class Main {
    public static void main(String[] args) {

        Employee p1= new FullTime("s1","HA",20000000d);
        Employee p2= new PartTime("s2","Hoang",25000);
        System.out.println("Nhan vien full time:");
        p1.showInfo();
        System.out.println("Thuong nhan vien Fulltime:"+p1.calculateBonus());
        System.out.println("Nhan vien PartTime:"+p2);
        p2.showInfo();
        System.out.println("Thuong nhan vien partTime:"+p2.calculateBonus());
    }
}
