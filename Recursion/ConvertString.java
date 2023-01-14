package Recursion;

public class ConvertString {
    static String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void printNumbers(int numbers){
        if (numbers == 0){
            return;
        }
        int lastDigit = numbers%10;
        printNumbers(numbers/10);
        System.out.println(words[lastDigit] + " ");
    }
    public static void main(String[] args) {
        printNumbers(1234);
        System.out.println();
    }
}
