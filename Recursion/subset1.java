package Recursion;

import java.util.ArrayList;
import java.util.Comparator;

public class subset1 {
        public static void f(int index,int sum, ArrayList<Integer> b, int[] a, int n) {
            if(index ==n){
                b.add(sum);
                return;
            }
            f(index+1, sum+ a[index],b,a,n);
            f(index+1,sum,b,a,n);
        }
        public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> b = new ArrayList<Integer>(n);
        int[] a={5,2,1};
        f(0,0,b,a,n);
        b.sort(Comparator.naturalOrder());
        System.out.println(b);

    }
    }
