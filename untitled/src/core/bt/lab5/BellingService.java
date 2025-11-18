package core.bt.lab5;

public class BellingService extends HospitalService{
    @Override
    public void printPatientBill(Patient p) {

        System.out.println("----Patient Bill ----");
        System.out.println("FullName:"+p.getFullName());
        System.out.println("Age:"+p.getAge());
        System.out.println("Total cost:"+p.calculateTotalCost());
    }
}
