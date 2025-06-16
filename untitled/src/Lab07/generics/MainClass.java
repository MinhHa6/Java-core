package Lab07.generics;

/**
 * @author  Minhha
 */

public class MainClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyGenerics<String>stringMyGenerics = new MyGenerics<String>();
        MyGenerics<Integer>integerMyGenerics= new MyGenerics<Integer>();
        // chen du lieu va in du lieu ra ngoai man hinh
        stringMyGenerics.setT("Toi yeu lap trinh");
        integerMyGenerics.setT( 2003);
        //lay gia tri
        System.out.println("String my generrics :"+stringMyGenerics.getT());
        System.out.println("Inter my genericts :"+integerMyGenerics.getT());

    }
}
