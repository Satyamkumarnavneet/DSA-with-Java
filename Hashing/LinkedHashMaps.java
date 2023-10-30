package Hashing;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lmh = new LinkedHashMap<>();
        lmh.put("India", 500);
        lmh.put("Russia", 200);
        lmh.put("Japan", 500);
        lmh.put("America", 700);

        System.out.println(lmh);
    }
}
