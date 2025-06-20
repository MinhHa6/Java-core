package Lab07;

public class Product {
    private  String proId;
    private  String proName;
    private String producer;
    private int yearMaking;
    private float frice;
    public Product () {
    }

    public Product(String proId, String proName, String producer, int yearMaking, float frice) {
        this.proId = proId;
        this.proName = proName;
        this.producer = producer;
        this.yearMaking = yearMaking;
        this.frice = frice;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getFrice() {
        return frice;
    }

    public void setFrice(float frice) {
        this.frice = frice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", producer='" + producer + '\'' +
                ", yearMaking=" + yearMaking +
                ", frice=" + frice +
                '}';
    }
}
