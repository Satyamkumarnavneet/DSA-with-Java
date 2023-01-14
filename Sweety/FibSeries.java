package Sweety;

public class FibSeries {
//    public static void printSeries(int a, int b, int n){
//        if (n == 0){
//            return;
//        }
//        int c = a+b;
//        System.out.println(c);
//        printSeries(b,c,n-1);
//    }
//
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        System.out.println(0);
//        System.out.println(1);
//        int n = 5;
//        printSeries(a,b,n-2);
//    }
//}
public static int fib(int n){
    if(n==0||n==1){
        return n;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    int fn=fib(n-1)+fib(n-2);
    return fn;
}
    public static void main(String args[]){
        int n=50;
        //printdec(n);
        // printinc(n);

        //System.out.println(fact(n));
        //System.out.println(sum(n));
        System.out.println(fib(n));
    }
}