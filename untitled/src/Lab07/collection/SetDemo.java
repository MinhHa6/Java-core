package Lab07.collection;

import java.util.Arrays;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int []count ={34,22,10,60,40};
        System.out.println("Original Arrays"+ Arrays.toString(count));
        // tao doi tuong tu treeset va them doi tuong
        TreeSet sortset= new TreeSet<Integer>();
        for (int i=0;i<count.length;i++)
        {
            sortset.add(count[i]);
        }
        System.out.println("The sorted list:"+sortset);
        System.out.println(sortset);
        System.out.println("The first element sortedset:"+sortset.first());
        System.out.println("The last element of the set list: "+sortset.last());
    }
}
