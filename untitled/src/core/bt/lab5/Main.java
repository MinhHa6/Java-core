package core.bt.lab5;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new NormalPatient("s1","hhhh",60,20003000);
        Patient p2 =new VipPatient("s2","hjsjs",67,27743883,10);

        HospitalService service = new BellingService();
        service.printPatientBill(p1);
        service.printPatientBill(p2);
    }
}
