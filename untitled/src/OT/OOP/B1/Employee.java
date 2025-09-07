package OT.OOP.B1;

abstract class Employee {

    private  String id;
    private String name;
    private Double salary;
    public Employee(String id,String name,Double salary)
    {
        this.id=id;
        this.name= name;
        this.salary=salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public abstract  double calculateBonus();
    public void showInfo()
    {
        System.out.println("Id"+id+"\n Name:"+name+"\n Salary:"+salary);
    }
}
