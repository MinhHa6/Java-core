package OT.OOP.B1;

public class PartTime extends Employee{
    private int workingHours;
    public PartTime(String id,String name,Double salary,int workingHours)
    {
        super(id,name,salary);
        this.workingHours=workingHours;
    }

    @Override
    public double calculateBonus() {
        return workingHours *300000;
    }

}
