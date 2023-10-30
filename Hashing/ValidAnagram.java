package Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> hmap = new HashMap<>();

        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            hmap.put(c, hmap.getOrDefault(c, 0)+1);
        }

        for (int i =0; i<t.length(); i++){
            char c = t.charAt(i);
            if (hmap.get(c) != null){
                if (hmap.get(c) == 1){
                    hmap.remove(c);
                } else {
                    hmap.put(c, hmap.get(c)-1);
                }
            } else {
                return false;
            }
        }

        return hmap.isEmpty();
    }
    public static void main(String[] args) {
        String s = "care";
        String t = "race";

        System.out.println(isAnagram(s,t));

    }
}
