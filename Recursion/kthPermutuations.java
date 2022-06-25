package Recursion;
import java.util.*;

public class kthPermutuations {
    public static void fun(int index, List<Integer> b, int[] a, int n, boolean []feq, List<List<Integer>> s) {
                if(b.size()==n) {
                    s.add(new ArrayList<>(b));
                    return;
                }
                for (int i=0;i<n;i++) {
                    if(!feq[i]){
                        feq[i]=true;
                        b.add(a[i]);
                        fun(i,b,a,n,feq,s);
                        b.remove(b.size()-1);
                        feq[i]=false;
                    }
                }
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = 3;
                List<Integer> b = new ArrayList<Integer>(n);
                List<List<Integer>> s = new ArrayList<>();
                boolean feq[] = new boolean[n];
                int find  = 4;
                int[] a = {1, 2, 3};
                fun(0, b, a, n, feq,s);
                List<Integer> ans = s.get(find-1);
                System.out.println(ans.toString());

            }

    }
