package Strings.builder;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Satyam ");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.append("Kumar navneet");
        System.out.println(sb);
        sb.delete(6, 20);

        System.out.println(sb.length());
        sb.insert(0, "SS");
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);

    }
}
