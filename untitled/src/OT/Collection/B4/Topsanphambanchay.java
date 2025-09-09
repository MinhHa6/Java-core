package OT.Collection.B4;

import java.util.*;

public class Topsanphambanchay {
    public static void main(String[] args) {
        // ds san pham dc ban chay
        List<String> ds = Arrays.asList("S1", "S2", "S1", "S3", "S2", "S1", "S4", "S2");
        Map<String,Integer>thongke= new HashMap<>();
        for(String s:ds)
        {
            thongke.put(s,thongke.getOrDefault(s,0)+1);
        }
        //In ra ds
        // In thống kê
        System.out.println("Thong ke san pham:");
        for (Map.Entry<String, Integer> entry : thongke.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // tim san pham ban chay nhat
        String topSP = null;
        int max=0;
        for(Map.Entry<String,Integer> entry:thongke.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                topSP=entry.getKey();
            }
        }
        System.out.println("\nSan pham ban chay nhat: " + topSP + " (so luong: " + max + ")");

    }
}
