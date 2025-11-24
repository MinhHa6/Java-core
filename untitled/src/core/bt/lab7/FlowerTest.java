package core.bt.lab7;

import java.util.Scanner;

public class FlowerTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Flower []flowers=null;
        while (true)
        {
            System.out.println("======Menu======");
            System.out.println("1.Nhap thong tin n loai hoa:");
            System.out.println("2.Hien thi thong ");
            System.out.println("3. Sap xep theo ds tang dan cua hoa");
            System.out.println("4.Tim kiem theo flowerId");
            System.out.println("5.Hien thi tat ca loai hoa co mau trang");
            System.out.println("6. Thoat");
            System.out.println("Nhap su lua chon chua ban:");
            int choice= sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Nhap so loai hoa muon nhap:");
                    int n=sc.nextInt();
                    sc.nextLine();
                     flowers=new Flower[n];
                    for (int i=0;i<n;i++)
                    {
                        System.out.println("Hoa thu"+(i+1)+":");
                        flowers[i]= new Flower();
                        flowers[i].input();
                    }
                    break;
                case 2:
                   if (flowers == null)
                   {
                       System.out.println("Ko co du lieu hien thi");
                   }
                   else
                   {
                       for (Flower flower:flowers)
                       {
                           flower.display();
                       }
                   }
                   break;
                case 3:
                    if(flowers ==null)
                    {
                        System.out.println("Ko co du lieu");
                    }
                    else {
                        for (int i=0;i< flowers.length;i++)
                        {
                            for(int j=i+1;j< flowers.length;j++)
                            {
                                if(flowers[i].getFlowerId().compareTo(flowers[j].getFlowerId())>0)
                                {
                                    Flower temp=flowers[i];
                                    flowers[i]=flowers[j];
                                    flowers[j]=temp;
                                }
                            }
                        }
                        System.out.println("ds da dc sap xep");
                    }
                    break;
                case 4:
                    System.out.println("Nhap flower id can tim kiem:");
                    String key=sc.nextLine();
                    if(flowers ==null)
                    {
                        System.out.println("Ko co du lieu");
                    }
                    else {
                        for(int i=0;i<flowers.length;i++)
                        {
                            if(key.equals(flowers[i].getFlowerId()))
                            {
                                flowers[i].display();
                            }
                            else {
                                System.out.println("Ko co id nao ");
                            }
                        }
                    }
                case 5:
                    for (int i=0;i<flowers.length;i++)
                    {
                        if(flowers[i].getColor().equals("trang"))
                        {
                            flowers[i].display();
                        }
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Nhap cac so tu 1 den 6");
                    break;
            }
        }
    }
}
