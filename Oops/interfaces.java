package Oops;

interface Animals {
    int eyes = 2;
    void walk();

}

interface Herbivore {

}
class Horse implements Animals {
    public void walk (){
        System.out.println("Walk on 4 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {

    }
}
