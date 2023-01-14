package Sweety;

public class AbstractionExp {
    public static void main(String args[]){
        Horse h=new Horse();
        h.eats();
        h.walk();
        System.out.println(h.color);
        chicken c=new chicken();
        c.eats();
        c.walk();
        Horse Mustang=new Mustang();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
        color="brown";
    }
    void eats(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");

    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class chicken extends Animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

