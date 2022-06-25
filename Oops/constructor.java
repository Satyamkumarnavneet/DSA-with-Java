package Oops;

import java.util.Scanner;

class Student {
    String name;
    int age;
    String gender;

    public Student() {

    }

    public void printStundetInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

//    Student(){
//        System.out.println("This is non parametrized construtor For student class");
//    }


//    Student(String name, int age, String gender){ // Parametrized constructor
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.gender = s2.gender;

    }

}


public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Student s1 = new Student("Satyam", 22, "Male"); // Paramertrized constructor
        Student s1 = new Student();
        s1.name = "Satyam";
        s1.age = 18;
        s1.gender = "male";

        Student s2 = new Student(s1); // Copy constructor
        s2.printStundetInfo();
    }
}
