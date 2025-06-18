package Lab11;

public class LuxuryCar extends Car{
    private float specialRate;// gia dac biet
    public LuxuryCar (){super();}
    public  LuxuryCar (String name, String producer, int year, int seat, float rootPrice,float specialRate)
    {
        super(name, producer, year, seat, rootPrice);
        this.specialRate=specialRate;
    }
    @Override
    public  float calulatePrice() {
        return getRootPrice()+calculateTax()+getRootPrice()*specialRate;
    }
    public  float calulatePrice( float transportCost) { // nap chong tinh them chi phi van chuyen
        return calulatePrice()+transportCost;
    }
    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Tỷ lệ đặc biệt: " + specialRate);
        System.out.println("Tổng giá xe sang: " + calulatePrice());
    }
}
