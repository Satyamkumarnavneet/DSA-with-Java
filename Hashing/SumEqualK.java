package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SumEqualK {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int ans = 0;

        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
            if (map.containsKey(sum-k)){
                ans+= map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, map.getOrDefault(sum,1)+1));
        }
        System.out.println(ans);
    }
}
