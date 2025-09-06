package OT.OOP.B1;

class FullTime extends Employee{
    private int overtimeHouses;
    public FullTime(String id, String name, double salary, int overtimeHours) {
        super(id, name, salary);
        this.overtimeHouses=overtimeHours;
    }
    @Override
    public double calculateBonus() {
        int overtimeHours;
        return getSalary() * 0.1 + overtimeHouses * 50000;
    }
}
