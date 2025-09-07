package OT.OOP.B1;

class FullTime extends Employee {

    public FullTime(String id,String name,Double salary)
    {
        super(id,name,salary);
    }
    @Override
    public double calculateBonus() {
        return getSalary()*0.2;
    }

}

