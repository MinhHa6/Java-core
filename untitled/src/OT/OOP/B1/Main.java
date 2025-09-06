package OT.OOP.B1;

public class Main {
    public static void main(String[] args) {
        Employee p1= new FullTime("w1l","ha",200000000,5);

        Employee p2 = new PartTime("E002", "Minh", 0., 60);
        p1.showInfo();
        System.out.println("Thưởng: " + p1.calculateBonus());

        p2.showInfo();
        System.out.println("Thưởng: " + p2.calculateBonus());
    }
}
