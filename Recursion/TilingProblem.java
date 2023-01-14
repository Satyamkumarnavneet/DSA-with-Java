package Recursion;

public class TilingProblem {
    public static int calcuWays(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        // Vertical
        int vertical = calcuWays(n-1);
        // Horizontal
        int horizontal = calcuWays(n-2);
        return vertical+horizontal;
    }

    public static void main(String[] args) {
        System.out.println(calcuWays(3));
    }
}
