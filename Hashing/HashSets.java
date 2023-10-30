package Hashing;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(5);

        set.remove(2);
        System.out.println(set.contains(3));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

    }
}
