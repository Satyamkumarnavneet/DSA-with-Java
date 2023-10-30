package Sets;

public class Union {
    public static void main(String[] args) {
        int setA [] = {1,2,4,5,6};
        int setB [] = {1,2,3,4,5,6,7};
        int size = Math.max(setA.length, setB.length);
        int finalSet [] = new int[size];

        for (int i = 0; i<setA.length; i++){
            finalSet[i] = setA[i];
        }
        for (int i = 0; i < setB.length; i++) {
            if (finalSet[i] != setB[i]) {
                finalSet[i] = setB[i];
            }
        }

        for (int i = 0; i<finalSet.length; i++){
            System.out.print(finalSet[i] + " ");
        }

    }
}
