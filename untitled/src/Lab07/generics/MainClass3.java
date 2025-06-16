package Lab07.generics;

public class MainClass3 {
    public static void main(String[] args) {
        AdvancedComparion<Integer>integerAdvancedComparion= new AdvancedComparion<Integer>();
        AdvancedComparion<Float>floatAdvancedComparion = new AdvancedComparion<>();
        AdvancedComparion<String>stringAdvancedComparion= new AdvancedComparion<>();
        integerAdvancedComparion.maximum(3,4,1);
        floatAdvancedComparion.maximum(2.3f,2.6f,6.3f);
        stringAdvancedComparion.maximum("ha","VietNam","HCM");
    }
}
