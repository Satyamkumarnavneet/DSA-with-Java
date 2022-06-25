package Lecture_4;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i= 0; i<t; i++ ){

            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            int w = n-x;
            int correct = x*3;
            int worng = w*(-1);
            int score = correct+worng;
            if(score>=p){
                System.out.println("Pass");
            } else{
                System.out.println("Fail");
            }

        }


    }

    }

