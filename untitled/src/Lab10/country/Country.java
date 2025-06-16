package Lab10.country;

import java.util.Scanner;

public class Country implements ICountry{
    private  String countryName;
    private double area;
    private long numbersPerson;
    public Country (){};
    public Country (String countryName,double area,long numbersPerson)
    {
        this.countryName=countryName;
        this.area=area;
        this.numbersPerson=numbersPerson;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getNumbersPerson() {
        return numbersPerson;
    }

    public void setNumbersPerson(long numbersPerson) {
        this.numbersPerson = numbersPerson;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner( System.in);
        System.out.println("Nhap CountryName:");
        countryName=sc.nextLine();
        System.out.println("Nhap area:");
        area=Double.parseDouble(sc.nextLine());
        System.out.println("Nhap numbersperson :");
        numbersPerson=Long.parseLong(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.println("CountryName:"+countryName+
                "\n Area:"+area+"\n NumbersPerson:"+numbersPerson);
    }

    @Override
    public float averageArea(double area, long numbersPreson) {
        return 0;
    }
}
