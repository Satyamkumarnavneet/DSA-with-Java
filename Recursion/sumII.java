package Recursion;

import java.io.*;
import java.util.*;
public class sumII {
    public static void f(int index, ArrayList<Integer> b, int[] a, int n) {
        if (index >= n) {
            System.out.println(b);
            return;
        }
        b.add(a[index]);
        f(index + 1, b, a, n);
        b.remove(b.size() - 1);
        f(index + 1, b, a, n);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> b = new ArrayList<Integer>(n);
        int[] a = {3, 2, 1};
        f(0, b, a, n);

    }
}
