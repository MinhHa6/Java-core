package Lab11;

public class Car implements  ICar{
    private  String name ; // ten
    private  String producer;// nha san xuat
    private int year; // nam san xuat
    private int seat; // cho ngoi tren xe
    private float rootPrice;// gia goc

    public Car (){};
    public Car(String name, String producer, int year, int seat, float rootPrice) {
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.rootPrice = rootPrice;
    }

    @Override
    public float calculateTax() { // tinh thue xe
        if (seat<7){ // xe duoi 7 cho
            return rootPrice*0.6f;
        }
        else
        return rootPrice*0.7f;// xe tren<=7
    }

    @Override
    public float calulatePrice() {
        return rootPrice+calculateTax();
    }
    @Override
    public void getInfor() {
        System.out.println("Ten xe:"+name+"\n Nha san xuat:"+producer+"\n Nam san xuat:"+"\n Ghe ngoi:"+seat+
                "\n Gia goc cua xe:"+rootPrice);
    }
}
