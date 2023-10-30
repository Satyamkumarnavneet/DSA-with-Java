package WiproTalentNext;
import java.util.*;

public class Problem1 {

//    public static String userIdGeneration(String input1, String input2, int input3, int input4) {
//        String longer;
//        String smaller;
//        int s1 = input1.length();
//        int s2 = input2.length();
//        if (s1 == s2) {
//            if (input1.compareTo(input2) < 0) {
//                smaller = input1;
//                longer = input2;
//            } else {
//                smaller = input2;
//                longer = input1;
//            }
//        } else if (s1 > s2) {
//            longer = input1;
//            smaller = input2;
//        } else {
//            longer = input2;
//            smaller = input1;
//        }
//
//        String pin = String.valueOf(input3);
//        char firstLetterOfLongerName = longer.charAt(longer.length() - 1);
//        char digitLeftToRight = pin.charAt(input4 - 1);
//        char digitRightToLeft = pin.charAt(pin.length() - input4);
//
//        String output = firstLetterOfLongerName + smaller + digitLeftToRight + digitRightToLeft;
//
//        StringBuilder output1 = new StringBuilder();
//
//        for (int i = 0; i < output.length(); i++) {
//            char c = output.charAt(i);
//            if (Character.isUpperCase(c)) {
//                output1.append(Character.toLowerCase(c));
//            } else if (Character.isLowerCase(c)) {
//                output1.append(Character.toUpperCase(c));
//            } else {
//                output1.append(c);
//            }
//        }
//
//        return output1.toString();
//    }






    public static int fixTheFormula(String input1) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        for (char ch : (input1 + "+").toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }
                sign = ch;
                num = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }





//
//    public String userIdGeneration(String input1, String input2, int input3, int input4) {
//        String ans = "";
//        String s1 = "";
//
//        if (input1.length() < input2.length()) {
//            s1 = input2.charAt(input2.length() - 1) + input1;
//        } else if (input1.length() > input2.length()) {
//            s1 = input1.charAt(input1.length() - 1) + input2;
//        } else {
//            if (input1.compareTo(input2) < 0) {
//                s1 = input1.charAt(input1.length() - 1) + input2;
//            } else {
//                s1 = input2.charAt(input2.length() - 1) + input1;
//            }
//        }
//
//        String ss = "" + input3;
//        s1 = s1 + ss.charAt(input4 - 1) + ss.charAt(ss.length() - input4);
//
//        for (int i = 0; i < s1.length(); i++) {
//            char ch = s1.charAt(i);
//            ans = ans + ((ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch);
//        }
//        return ans;
//    }
//
//






    public int findKey(int input1, int input2, int input3) {
        int key = 0;

        key = calculatePositionValue(input1, input2, input3, 1000) * 1000;
        key += calculatePositionValue(input1, input2, input3, 100) * 100;
        key += calculatePositionValue(input1, input2, input3, 10) * 10;
        key += calculatePositionValue(input1, input2, input3, 1);

        return key;
    }

    private int calculatePositionValue(int num1, int num2, int num3, int divisor) {
        int minDigit = 9, maxDigit = 0;

        // Calculate digits at the specified position for each number
        int digit1 = (num1 / divisor) % 10;
        int digit2 = (num2 / divisor) % 10;
        int digit3 = (num3 / divisor) % 10;

        minDigit = Math.min(minDigit, Math.min(digit1, Math.min(digit2, digit3)));
        maxDigit = Math.max(maxDigit, Math.max(digit1, Math.max(digit2, digit3)));

        return (maxDigit - minDigit);
    }





































    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter First_Name: ");
//        String input1 = in.next();
//
//        System.out.print("Enter Last_Name: ");
//        String input2 = in.next();
//
//        System.out.print("Enter PIN: ");
//        int input3 = in.nextInt();
//
//        System.out.print("Enter N: ");
//        int input4 = in.nextInt();
//
//        String result = userIdGeneration(input1, input2, input3, input4);
//        System.out.println("Generated User-ID: " + result);
    }
}





































