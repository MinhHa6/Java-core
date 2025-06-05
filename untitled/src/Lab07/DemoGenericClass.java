package Lab07;

import java.beans.Introspector;

public class DemoGenericClass {
    public static <T> void printArray (T[] inputArray)
    {
        for (T element:inputArray)
        {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] arrInt={1,2,34,5,6};
        Double [] arrDouble={3.5,6.4,6.8};
        Character [] arrChar = { 'h','a'};
        System.out.println("Gia tri so nguyen la:");
        printArray(arrInt);
    }
}
