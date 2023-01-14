package Pattern;

public class DaimondPattern {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i<=n; i++){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static class ButterflyPattern {
        public static void main(String[] args) {
            int n =5;
            for(int i = 1; i<=n; i++){
                for (int j =1; j<=i; j++){
                    System.out.print("*");
                }
                int spaces = 2*(n-i);
                for (int j = 1; j<=spaces; j++){
                    System.out.print(" ");
                }

                for (int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n; i>=1; i--){
                for (int j =1; j<=i; j++){
                    System.out.print("*");
                }
                int spaces = 2*(n-i);
                for (int j = 1; j<=spaces; j++){
                    System.out.print(" ");
                }

                for (int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }


























    //        int n =4;
    //        int num1 =1;
    //        int num =3;
    //        for (int i =1; i<=n; i++){
    //            for (int j =1; j<=i; j++){
    //                System.out.print("*");
    //            }
    //            num1 = num*2;
    //            for (int j = 0; j<num1; j++){
    //                System.out.print(" ");
    //            }
    //            for (int j =1; j<=i; j++){
    //                System.out.print("*");
    //            }
    //            System.out.println();
    //            num--;
    //        }
    //        num1 =1;
    //        num =0;
    //        for (int i =4; i>=1; i--){
    //            for (int j =1; j<=i; j++){
    //                System.out.print("*");
    //            }
    //            num1 = num*2;
    //            for (int j = 0; j<num1; j++){
    //                System.out.print(" ");
    //            }
    //            for (int j =1; j<=i; j++){
    //                System.out.print("*");
    //            }
    //            System.out.println();
    //            num++;
    //        }

        }
    }
}
