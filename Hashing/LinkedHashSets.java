package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Supriya");
        names.add("Sweet");
        names.add("Sweety");
        names.add("Satyam");
        names.add("Pooja");
        names.add("Shaily");

        System.out.println(names);

        LinkedHashSet<String> name = new LinkedHashSet<>();
        name.add("Supriya");
        name.add("Sweet");
        name.add("Sweety");
        name.add("Satyam");
        name.add("Pooja");
        name.add("Shaily");

        System.out.println(name);

    }
}
