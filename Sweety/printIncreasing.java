package Sweety;

public class printIncreasing {
//    public static void printdec(int n){
//        if(n==1){
//            System.out.println(n);
//            return;
//        }
//        System.out.print(n+" ");
//        printdec(n-1);
//    }
    public static void printinc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }

        printinc(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[]){
        int n=5;
        //printdec(n);
        printinc(n);
    }
}

