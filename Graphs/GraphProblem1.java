package Graphs;

public class GraphProblem1 {
    public static char findAddedLetter(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            countS[index]++;
        }

        for (char c : t.toCharArray()) {
            int index = c - 'a';
            countT[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (countT[i] > countS[i]) {
                return (char) ('a' + i);
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char addedLetter = findAddedLetter(s, t);
        System.out.println("Added letter: " + addedLetter);
    }
}
