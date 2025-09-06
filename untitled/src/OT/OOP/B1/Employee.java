package OT.OOP.B1;

abstract class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }

    // Phương thức trừu tượng
    public abstract double calculateBonus();

    // Phương thức chung
    public void showInfo() {
        System.out.println("ID: " + id + ", Tên: " + name + ", Lương: " + salary);
    }
}
