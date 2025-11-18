package core.bt.lab5;

public class Patient {
   private String patientId;// ma benh nhan
    private String fullName;// ho ten
    private int age;// tuoi
    private double baseCost; // chi phi kham ban dau

    public Patient(String patientId, String fullName, int age, double baseCost) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.baseCost = baseCost;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    public  double calculateTotalCost()
    {
        return baseCost;
    }
}
