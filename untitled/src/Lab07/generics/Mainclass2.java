package Lab07.generics;

/**
 * @author MinhHa
 */

public class Mainclass2 {
    //generic method array
    public static <E> void printArray (E[] inputArray)
    {
        // Display element
        for (E element :inputArray)
        {
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // create array character,interger,double
        Integer []intarrays = {1,2,3,4,5,6};
        Double []doubleArrays = {3.4,2.5,1.4};
        Character[]charactersArrays= {'M','i','n','h'};
        // hien thi
        System.out.println("Interger:");
        printArray(intarrays);
        System.out.println("Double:");
        printArray(doubleArrays);
        System.out.println("Character:");
        printArray(charactersArrays);
    }
}
