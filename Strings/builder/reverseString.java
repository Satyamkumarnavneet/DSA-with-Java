package Strings.builder;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()- 1 - i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
    }
}
