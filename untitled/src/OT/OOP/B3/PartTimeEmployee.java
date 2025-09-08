package OT.OOP.B3;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String id, String name, String email, double hourlyRate, int hoursWorked) {
        super(id, name, email);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public Double calculateSalary()
    {
        return hourlyRate * hoursWorked;
    }
}
