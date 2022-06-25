/* Make a program that takes the radius of a circle as input,
calculates its radius and area and prints it as output to the user.*/

package Lecture_2;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = sc.nextInt();
        double pi = 3.142;
        double area;
        area = pi*radius*radius;
        System.out.println("Area of circle is: " + area);



    }
}
