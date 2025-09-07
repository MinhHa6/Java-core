package OT.OOP.B1;

public class PartTime extends Employee{
    public PartTime(String  id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.1; // bonus 10%
    }

}
