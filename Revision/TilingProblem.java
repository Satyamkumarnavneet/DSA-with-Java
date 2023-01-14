package Revision;

public class TilingProblem {
    public static int calculateWays(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        // vertical
        int vertical = calculateWays(n-1);
        // horizontal
        int horizontal = calculateWays(n-2);
        return vertical+horizontal;
    }

    public static void main(String[] args) {
        System.out.println(calculateWays(4));
    }
}
