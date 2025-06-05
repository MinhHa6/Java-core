package Lab08;

import java.util.Scanner;

public class City {

    private String cityId;
    private String cityName;
    private String country;
    private double area;
    public City () {};
    public City (String Id,String cityName,String country,double area)
    {
        this.cityId=Id;
        this.cityName=cityName;
        this.country=country;
        this.area=area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    public  void nhap()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("======Thong tin======");
        System.out.println("Nhap cityId:");
        cityId=scanner.nextLine();
        System.out.println("Nhap ten thanh pho:");
        cityName=scanner.nextLine();
        System.out.println("Nhap ten nuoc:");
        country=scanner.nextLine();
        System.out.println("Nhap dien tich:");
        area=scanner.nextDouble();
    }
    public void hienthi ()
    {
        System.out.println("Id:"+cityId);
        System.out.println("\n Ten thanh pho:"+cityName+"\n Ten dat nuoc:"+country+"\n Dien tich:"+area);
    }
}
