package bitManipulation;

public class getBit {
    public static void main(String[] args) {
        int n = 3;
        int pos = 1;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0){
            System.out.println("bit is zero");
        } else {
            System.out.println("bit is nonzero");
        }
    }
}
