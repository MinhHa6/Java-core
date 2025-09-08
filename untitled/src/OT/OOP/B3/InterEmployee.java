package OT.OOP.B3;

public class InterEmployee extends Employee{
    private Double supportAllowance;

    public InterEmployee(String id, String name, String email, Double supportAllowance) {
        super(id, name, email);
        this.supportAllowance = supportAllowance;
    }
    @Override
    public Double calculateSalary()
    {
        return supportAllowance;
    }
}
