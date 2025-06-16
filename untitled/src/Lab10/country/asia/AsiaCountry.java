package Lab10.country.asia;

import Lab10.country.Country;

import java.util.Scanner;

public class AsiaCountry extends Country {
    private String location;//vi tri dia ly Dong A, Trung a , Nam A
    public AsiaCountry ()
    {
        super();
    }
    public AsiaCountry (String countryName,double area,long numbersPerson,String location)
    {
        super(countryName, area, numbersPerson);
        this.location=location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public void input ()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap location:");
        location=sc.nextLine();
    }
    @ Override
    public void display()
    {
     super.display();
        System.out.println("Location:"+location);
    }
}
