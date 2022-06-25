package Recursion;

public class PlaceTiles {
    public static int placeTiles(int n, int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }

        // Horizontally
        int placeHoron = placeTiles(n-m,m);
        // Vertically
        int placeVertic = placeTiles(n-1,m);
        return placeHoron+placeVertic;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n,m));

    }
}
