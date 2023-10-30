package WiproTalentNext;

public class EY2 {
    public static void Bonacci(int X, int Y) {
        int[] bonacci = new int[X];
        bonacci[X - 1] = X;
        bonacci[X - 2] = Y;
        for (int i = X - 3; i >= 0; i--) {
            bonacci[i] = bonacci[i + 1] - bonacci[i + 2];
        }
        System.out.println(Math.abs(bonacci[1]));
        System.out.println(Math.abs(bonacci[0]));
    }
    public static void main(String[] args) {
        // Sample Input
        int X = 10;
        int Y = 6;

        Bonacci(X, Y);
    }
}
