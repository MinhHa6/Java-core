package OT.OOP.B3;

public class Main {
    public static void main(String[] args) {
        Company company= new Company();
        company.addEmployee(new FullTimeEmployee("s1","Ha","Minhha1192003@Gmail.com",120000.,30000.));// FullTime
        company.addEmployee(new PartTimeEmployee("s2","Hoang","honagjsjjjsj",56000 ,33));
        company.addEmployee(new InterEmployee("s3","Hien","hiennsnnaj",300000.));
        company.showEmployees();
    }
}
