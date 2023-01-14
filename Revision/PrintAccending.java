package Revision;

public class PrintAccending {
    public static void printAccending(int n){
        if (n==0){
            return;
        }
        printAccending(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printAccending(5);
    }
}
