package Lab09.vehicle;

public class vehicles implements IVehicle{
    private  String maker;
    private String model;
    private double price;

    public vehicles (){};

    public vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {

    }

    @Override
    public void display() {

    }
}
