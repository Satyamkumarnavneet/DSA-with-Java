package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetIterator {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Supriya");
        names.add("Sweet");
        names.add("Sweety");
        names.add("Satyam");
        names.add("Pooja");
        names.add("Shaily");

        Iterator it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(names);

        for (String name : names){
            System.out.println(name);
        }

    }
}
