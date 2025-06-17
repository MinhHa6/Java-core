package Lab11;

public class Car implements  ICar{
    private  String name ;
    private  String producer;
    private int year;
    private int seat;
    private float rootPrice;

    @Override
    public float calculateTax() {
        if (seat>7){
            return rootPrice*0.6f;
        }
        else
        return rootPrice*0.7f;
    }

    @Override
    public float calulatePrice() {
        return rootPrice+calculateTax();
    }
    @Override
    public void getInfor() {

    }
}
