package Recursion;

public class PathInMaze {
    public static int countPath(int i, int j, int n, int m){
        if (i == n || j ==m){
            return 0;
        }

        if (i == n-1 && j == m-1){
            return 1;
        }

        // Move downwards
        int downPath = countPath(i+1,j,n,m);
        // Move rightwards
        int rightPath = countPath(i,j+1,n,m);
        return downPath+rightPath;

    }


    public static void main(String[] args) {
        int n = 3, m = 3;
        int toatalPaths = countPath(0,0,m,n);
        System.out.println(toatalPaths);

    }
}
