package Lab05.B1;

import java.util.Scanner;

public class Product {
    private String proId;
    private String prodName;
    private String manufacturer;
    private float productPrice;

    private float taxImported;
    public Product(String proId, String prodName, String manufacturer, float productPrice) {
        this.proId = proId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
       this.productPrice = productPrice;
    }
    public Product (){}


    public void input()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap id san pham:");
        proId=scanner.nextLine();
        System.out.println("Nhap ten san pham:");
        prodName=scanner.nextLine();
        System.out.println("Nhap nha san xuat:");
        manufacturer=scanner.nextLine();
        System.out.println("Nhap gia san xuat:");
        productPrice= scanner.nextInt();
        System.out.println("Nhap thue nhap khau:");
        taxImported=scanner.nextFloat();
    }
    public void display ()
    {
        System.out.println("=====Thong tin san pham =======");
        System.out.println("Idproduct:"+proId+"-Ten san pham:"+prodName+"-Nha san xuat:"+manufacturer+"-Gia:"+productPrice);
        System.out.println("Gia ban:"+clalculateSalePrice());
        System.out.println("Tong tien sau khuyen mai:"+khuyenmai(10));

    }
    public float clalculateSalePrice ()
    {
        return productPrice+(float) (0.05*productPrice)+(productPrice* taxImported/100);
    }
    public float khuyenmai(float khuyenmai)
    {
        return clalculateSalePrice()- (clalculateSalePrice()*khuyenmai/100);
    }
}
