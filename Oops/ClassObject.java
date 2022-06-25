package Oops;

class pen {
    String color;
    String type;

    public void printPenInfo() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class ClassObject {
    public static void main (String args[]){
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type =  "Ballpoint";

        pen pen2 = new pen();
        pen2.color = "Red";
        pen2.type = "Gell";

        pen1.printPenInfo();
        pen2.printPenInfo();


    }
}
