package Recursion;

public class calcuPower {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int xPownm1 = printPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }


        // When n is even
//        if(n%2==0){
//             return printPower(x, n/2) * printPower(x, n/2);
//        }
//        else{ // When n is odd
//            return printPower(x, n/2) * printPower(x,n/2) * x;
//        }
//    }

        public static void main (String[]args){
            int x = 2, n = 6;
            int ans = printPower(x, n);
            System.out.println(ans);


        }
    }

