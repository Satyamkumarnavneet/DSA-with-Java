package Arrays;

import java.util.Arrays;
public class BagOfTokens {
    public static int bagOfTokensScore(int tokens[], int power){
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length-1;
        int score = 0;

        while (left<=right){
            if (power >= tokens[left]){
                power -= tokens[left++];
                score++;
            } else {
                if (power+tokens[right] > tokens[left] && score != 0 && right != left){
                    power += tokens[right--];
                    score--;
                } else {
                    break;
                }
            }
        }
        return score;

    }


    public static void main(String[] args) {
        int tokens [] = {100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens,power));
    }
}
