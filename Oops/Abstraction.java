package Oops;

abstract class Animal {
    abstract void walk();
}

class horse extends Animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class chicken extends Animal {
    public void walk (){
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        horse horse = new horse();
        horse.walk();
        chicken chicken = new chicken();
        chicken.walk();

    }
}
