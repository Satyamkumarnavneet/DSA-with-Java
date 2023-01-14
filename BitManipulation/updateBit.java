package BitManipulation;
import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); // Oper = 1 set, oper = 0 clear
        int n = 5; // 0101 -> 0111 -> 7 dec
        int pos = 1;
        int bitMask = 1<<pos;
        if (oper == 1){
            // Set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // Clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
