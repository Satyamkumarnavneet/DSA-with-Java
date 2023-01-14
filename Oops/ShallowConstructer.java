package Oops;
class Students {
    String name;
    int roll;
    String password;
    int marks[];

////    shallow copy constructor
//    Students(Students s1){
//        marks=new int[3];
//        this.name=s1.name;
//       this.roll=s1.roll;
//       this.marks=s1.marks;
//      }
    //deep copy constructor
    Students(Students S1){
        marks=new int[3];
        this.name=S1.name;
        this.roll=S1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=S1.marks[i];
        }
    }
    Students(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    Students(String name){
        marks=new int[3];
        this.name=name;
    }
    Students(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}
public class ShallowConstructer {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Sweety";
        s1.roll = 232;
        s1.password = "gcrfd";
        s1.marks[0] = 90;
        s1.marks[1] = 60;
        s1.marks[2] = 91;
        Students s2 = new Students(s1);
        s2.password = "xhs";
        s1.marks[2] = 100;
        for(int i =0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

