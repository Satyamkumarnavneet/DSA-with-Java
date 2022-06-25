package Oops;

class Shape {
    public void area(){
        System.out.println("Display area");
    }

}

class Traingle extends Shape {
    public void area (int l, int h){
        System.out.println(1/2*l*h);
    }

}

class EquiletralsTraingle extends Traingle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}



public class Inheritence {
    public static void main(String[] args) {
        Traingle t1 = new Traingle();


    }
}
