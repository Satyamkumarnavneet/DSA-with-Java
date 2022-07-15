package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        // Add function
        numberList.add(0);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        System.out.println(numberList);

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Satyam");
        nameList.add("Supriya");
        nameList.add("Alisha");
        nameList.add("Jayati");
        nameList.add("Khusboo");
        nameList.add("Shweta");

        System.out.println(nameList);

        // Get function
        int element = numberList.get(1);
        System.out.println(element);
        String nameElement = nameList.get(1);
        System.out.println(nameElement);

        // Add element in between
        numberList.add(1,5);
        nameList.add(1,"Archi");
        System.out.println(numberList);
        System.out.println(nameList);

        // Set element
        numberList.set(0,9);
        nameList.set(2,"Shweta");
        System.out.println(numberList);
        System.out.println(nameList);

        // Delete element
        nameList.remove(2);
        numberList.remove(0);
        System.out.println(numberList);
        System.out.println(nameList);

        // Size function
        int numSize = numberList.size();
        int nameSize = nameList.size();
        System.out.println(numSize);
        System.out.println(nameSize);

        for (int i = 0; i<numberList.size(); i++){
            System.out.print(numberList.get(i) + " ");
        }
        System.out.println();

        for (int j = 0; j<nameList.size(); j++){
            System.out.print(nameList.get(j)+ " ");
        }
        System.out.println();

        // Sorting
        Collections.sort(numberList);
        Collections.sort(nameList);
        System.out.println(numberList);
        System.out.println(nameList);







    }
}
