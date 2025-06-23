package Lab06;

public class BaiThucHanh5 {
    void yeuCau1()
    {
        String vietnam="Viet Nam";
        System.out.println("concat()="+vietnam.concat("Cong hoa xa hoi chu nghia"));
    }
    void yeuCau2()
    {
        String baoViet= "Tong cong ty Bao Viet"+"la cong ty tai chienh bao hiem bao Viet"+"bao Viet dau tu 100 von";
        System.out.println("length()"+baoViet.length());
        baoViet= baoViet.replaceAll("Cty","Cong ty");
        System.out.println("ReplaceAll()"+baoViet);
    }
    void yeucau3()
    {
        String baoViet= "Tong cong ty Bao Viet"+"la cong ty tai chienh bao hiem bao Viet"+"bao Viet dau tu 100 von";
        System.out.println("toUppercase()"+baoViet.toUpperCase());
        System.out.println("tolowercase()"+baoViet.toLowerCase());
    }
    void yeucau4 ()
    {
        String baoViet= "Tong cong ty Bao Viet"+"la cong ty tai chienh bao hiem bao Viet"+"bao Viet dau tu 100 von";

        System.out.println("LastIndex()"+baoViet.lastIndexOf("Bao Viet"));
    }
    void yeucau5()
    {
        String baoViet= "Tong cong ty Bao Viet"+"la cong ty tai chienh bao hiem bao Viet"+"bao Viet dau tu 100 von";
        String []arrBaoViet= baoViet.split(" ");
        for (int i=0;i<arrBaoViet.length;i++)
        {
            String arrBaoViet1=  arrBaoViet[i];
            if(i%2==0)
            {
                System.out.println("\t"+arrBaoViet1);
            }
            else
            {
                System.out.println(arrBaoViet1);
            }
        }
    }

    public static void main(String[] args) {
        BaiThucHanh5 main= new BaiThucHanh5();
        main.yeuCau1();main.yeuCau2();
        main.yeucau3();main.yeucau4();
        main.yeucau5();
    }
}
