package Lab07;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List list1= new ArrayList<>();
        list1.add(1);
        list1.add("Minh Ha");
        System.out.println(list1);

        //
        List<Integer> listInt= new ArrayList<>();
        listInt.add(2);
        listInt.add(4);
        System.out.println(listInt.get(1));
    }
}
