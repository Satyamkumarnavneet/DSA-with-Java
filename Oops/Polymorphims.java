package Oops;

import java.util.Scanner;

class Studentinfo {
    String name;
    int age;
    String gender;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, String gender){
        System.out.println(name + gender);
    }

}
public class Polymorphims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentinfo s1 = new Studentinfo();
        s1.name = sc.next();
        s1.age = sc.nextInt();
        s1.gender = sc.next();

        s1.printInfo(s1.age);


    }
}
