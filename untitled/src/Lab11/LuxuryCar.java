package Lab11;

public class LuxuryCar extends Car{
    private float specialRate;// gia dac biet
    private float rootPrice;
    public LuxuryCar (){super();}
    public  LuxuryCar (float specialRate,float rootPrice)
    {
        this.rootPrice=rootPrice;
        this.specialRate=specialRate;
    }
    @Override
    public  float calulatePrice() {
        return rootPrice+calculateTax()+rootPrice*specialRate;
    }
    public  float calulatePrice( float transportCost) { // nap chong tinh them chi phi van chuyen
        return rootPrice+calculateTax()+rootPrice*specialRate+transportCost;
    }
}
