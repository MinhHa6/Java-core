package core.bt.lab5;

public class VipPatient extends Patient{
    private double discountRate;
    public VipPatient(String patientId, String fullName, int age, double baseCost,double discountRate) {
        super(patientId, fullName, age, baseCost);
        this.discountRate=discountRate;
    }
   @Override
   public double calculateTotalCost()
   {
       return getBaseCost()*(discountRate/100);
   }
}
