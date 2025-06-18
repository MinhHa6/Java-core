package Lab07.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // tao doi tuong map va chen du lieu
        Map<String,String>map= new HashMap<>();
        map.put("kv1","MH3");
        map.put("kv2","MH23");
        map.put("kv3","MH2");
        map.put("kv4","MH1");
        for (Map.Entry<String,String> entrySet:map.entrySet())
                {
                    String key=entrySet.getKey();
                    String value=entrySet.getValue();
                    System.out.println(key+"-"+value);
                }
        System.out.println("Key"+map.get("kv1"));
        System.out.println(map.remove("kv2"));
        System.out.println("Sau khi xoa:"+map);
    }
}
