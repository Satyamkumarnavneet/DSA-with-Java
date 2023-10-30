package WiproTalentNext;
import java.util.*;
public class FlipkartGrid {
    static int winTheGift(int n, int x) {
        int position = 1;

        for (int i = 1; i <= x; i++) {
            position++;
            if (position > n) {
                position = 1;
            }
        }

        return position;
    }

        public static void main(String args[]) {
            int n, x;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            x = sc.nextInt();
            System.out.print(winTheGift(n, x));
        }
    }

