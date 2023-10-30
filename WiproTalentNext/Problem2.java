package WiproTalentNext;

public class Problem2 {
//    public int findTvalue(int input1, int input2, int input3) {
//        int t = 0;
//
//        // Rule 1
//        if (isPrime(input2)) {
//            if (input2 % 2 == 0) {
//                // Case 1
//                t = input1 * input1 * sumOfFirstNPrimes(input2);
//            } else {
//                // Case 2
//                t = input2 * input2 * sumOfFirstNPrimes(input3);
//            }
//        } else {
//            if (input2 % 2 == 0) {
//                // Case 3
//                t = input3 * input3 * sumOfFirstNPrimes(input2 + input3);
//            } else {
//                // Case 4
//                t = sumOfFirstNPrimes(input1 + input2 + input3);
//            }
//        }
//
//        // Rule 2
//        if (isPrime(t)) {
//            return t + input3; // Case 1
//        } else {
//            return t - input3; // Case 2
//        }
//    }
//
//    // Helper method to check if a number is prime
//    private boolean isPrime(int num) {
//        if (num <= 1) return false;
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//    }
//
//    // Helper method to calculate the sum of the first N prime numbers
//    private int sumOfFirstNPrimes(int n) {
//        int sum = 0;
//        int count = 0;
//        int num = 2;
//
//        while (count < n) {
//            if (isPrime(num)) {
//                sum += num;
//                count++;
//            }
//            num++;
//        }
//
//        return sum;
//    }

    public static String userIdGeneration(String input1, String input2, int input3, int input4) {
        String ans = "";
        String s1 = "";

        if (input1.length() < input2.length()) {
            s1 = input2.charAt(input2.length() - 1) + input1;
        } else if (input1.length() > input2.length()) {
            s1 = input1.charAt(input1.length() - 1) + input2;
        } else {
            if (input1.compareTo(input2) < 0) {
                s1 = input1.charAt(input1.length() - 1) + input2;
            } else {
                s1 = input2.charAt(input2.length() - 1) + input1;
            }
        }

        String ss = "" + input3;
        s1 = s1 + ss.charAt(input4 - 1) + ss.charAt(ss.length() - input4);

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            ans = ans + ((ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example-1
        System.out.println(userIdGeneration("Raiv", "Roy", 560037, 6)); // Output: VrOY75
        // Example-2
        System.out.println(userIdGeneration("Manoj", "Kumar", 561327, 2)); // Output: jKumar62
        // Example-3
        System.out.println(userIdGeneration("Kumud", "Kumar", 561327, 2)); // Output: dKumar62
    }

}
