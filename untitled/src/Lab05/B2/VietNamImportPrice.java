package Lab05.B2;

import java.util.Scanner;

public class VietNamImportPrice {
    private String proId;
    private String prodName;
    private String manufacturer;
    private float productPrice;
    private float taxImported;
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
    }
    public void display ()
    {
        System.out.println("=====Thong tin san pham =======");
        System.out.println("Idproduct:"+proId+"Ten san pham:"+prodName+"Nha san xuat:"+manufacturer+"Gia:\n"+productPrice);
        System.out.println("Gia ban:\n"+clalculateSalePrice());
        System.out.println("Tong tien:\n"+khuyenmai(10));

    }
    public float clalculateSalePrice ()
    {
        return productPrice+(float) (0.05*productPrice);
    }
    public float khuyenmai(float khuyenmai)
    {
        return clalculateSalePrice()-(float) (clalculateSalePrice()*khuyenmai/100);
    }
}   
