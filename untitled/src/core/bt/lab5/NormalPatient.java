package core.bt.lab5;

public class NormalPatient extends Patient{
    public NormalPatient(String patientId, String fullName, int age, double baseCost) {
        super(patientId, fullName, age, baseCost);
    }
@Override
public double calculateTotalCost() {
    return getBaseCost();
}

}
