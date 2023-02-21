package Strings;

public class ShortestPath {
    public static int getShortPath(String str){
        int x = 0;
        int y = 0;
        for (int i = 0; i<str.length(); i++){
            char dir = str.charAt(i);
            if (dir == 'E' ){
                x++;
            } else if (dir == 'W'){
                x--;
            } else if (dir == 'N'){
                y++;
            } else {
                y--;
            }
        }
        return Math.abs(x) + Math.abs(y);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortPath(str));
    }
}
