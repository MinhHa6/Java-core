package OT.OOP.B3;

public class FullTimeEmployee extends Employee{
    private Double baseSalary; // luong co ban
    private Double bonus; // luong thuong

    public FullTimeEmployee(String id, String name, String email, Double baseSalary, Double bonus) {
        super(id, name, email);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public Double calculateSalary()
    {
        return baseSalary+bonus;
    }
}
