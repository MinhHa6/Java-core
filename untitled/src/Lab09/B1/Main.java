package Lab09.B1;

public class Main {
    public void pheptinh (ITinhToan phepTinh, float num1, float num2)
    {
        phepTinh.doOperation(num1,num2);
    }
    public static void main(String[] args) {
        Main main= new Main();
        ImplOperationAdd add = new ImplOperationAdd();
        add.setAccuracy(IAccuracy.TWO_NUMBER);
        main.pheptinh(add,6,99);

        ImplOperationSub sub = new ImplOperationSub();
        add.setAccuracy(IAccuracy.THREE_NUMBER);
        main.pheptinh(sub,9,6);

        ImplOperationMul mul = new ImplOperationMul();
        add.setAccuracy(IAccuracy.FOUR_NUMBER);
        main.pheptinh(mul,6,3);

    }
}
