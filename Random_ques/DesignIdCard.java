package Random_ques;

import java.util.Scanner;
import java.util.SortedMap;

public class DesignIdCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String bloodGroup = sc.next();
        String Group;
        if (age>=20){
            Group = "Red";
        } else if (age >= 15 && age == 20){
            Group = "Blue";
        } else if (age >= 15 && age == 15) {
            Group = "Yellow";
        }
        else {
                Group = "Not Found";
            }
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Blood Group " + bloodGroup);
        System.out.println("----------------------");
        System.out.println("Your Blood Gorup: "+ Group);
        System.out.println("----------------------");

    }
}
