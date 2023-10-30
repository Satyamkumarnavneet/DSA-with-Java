package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // Insert - 0(1)
        hm.put("India", 5000);
        hm.put("Sweden", 3000);
        hm.put("Russia", 6000);
        hm.put("China", 3000);

        // Get -> 0(1)

        int russian = hm.get("Russia");
        System.out.println(russian);
        System.out.println(hm.get("Spain"));

        // Contains key -> 0(1)

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Spain"));

        System.out.println(hm);

        // Remove -> 0(1)
        hm.remove("India");

        System.out.println(hm.size());

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String s: keys) {
            System.out.println("Key = "+s + ", " + "Value = " + hm.get(s));
        }





    }
}
