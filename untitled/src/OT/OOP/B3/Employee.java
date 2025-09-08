package OT.OOP.B3;

public abstract class Employee {
    private String id;
    private String name;
    private String email;

    public Employee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract Double calculateSalary();// phuong thuc abstract class tinh luong

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +"\n Luong:"+calculateSalary()+
                '}';
    }
}
