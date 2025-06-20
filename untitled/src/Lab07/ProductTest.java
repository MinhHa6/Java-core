package Lab07;

import java.util.*;

public class ProductTest {
    Map<Integer,Product> ds= new HashMap<>();
    public void input ()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao n thong tin san pham:");
        int n=Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++) {
            System.out.println("Nhap ProductId:");
            String productId = sc.nextLine();
            System.out.println("Nhap productName:");
            String productName = sc.nextLine();
            System.out.println("Nhap producer:");
            String producer=sc.nextLine();
            System.out.println("Nhap yearMaking:");
            int yearMaking = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap price :");
            float price = Float.parseFloat(sc.nextLine());
            Product product1 = new Product(productId,productName,productName,yearMaking,price);
            ds.put((i+1),product1);
        }
    }
    public void display()
    {
        if (ds.isEmpty())
        {
            System.out.println("Ds rong");
        }
        for(Map.Entry<Integer,Product> pr: ds.entrySet())
        {
            System.out.println("Ds producer:"+pr.getKey()+pr.getValue());
        }
    }

    public void sort()
    {
        List<Product>products= new ArrayList<>(ds.values());
        products.sort((a,b)->Integer.compare(a.getYearMaking(),b.getYearMaking()));
        System.out.println("Ds tang dan theo nam san xuat:");
        display();
    }
    public static void main(String[] args) {
        ProductTest productTest= new ProductTest();
        productTest.input();
        productTest.display();
        productTest.sort();
    }
}
