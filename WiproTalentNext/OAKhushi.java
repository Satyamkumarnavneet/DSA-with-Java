package WiproTalentNext;
import java.util.*;
public class OAKhushi {
//    public static int stockLounge(List<Integer> onHand, List<Integer> supplier, int demand) {
//        List<Integer> onHandCopy = new ArrayList<>(onHand);
//        List<Integer> supplierCopy = new ArrayList<>(supplier);
//
//        Collections.sort(onHandCopy, Collections.reverseOrder());
//        Collections.sort(supplierCopy, Collections.reverseOrder());
//
//        int maxOrder = 0;
//        int waste = 0;
//
//        while (demand > 0 && (!onHandCopy.isEmpty() || !supplierCopy.isEmpty())) {
//            if (!onHandCopy.isEmpty()) {
//                int current = onHandCopy.get(0);
//                if (current >= demand) {
//                    maxOrder += demand;
//                    return maxOrder;
//                } else {
//                    maxOrder += current;
//                    demand -= current;
//                    onHandCopy.remove(0);
//                }
//            } else if (!supplierCopy.isEmpty()) {
//                int current = supplierCopy.get(0);
//                if (current >= demand) {
//                    maxOrder += demand;
//                    return maxOrder;
//                } else {
//                    maxOrder += current;
//                    demand -= current;
//                    supplierCopy.remove(0);
//                }
//            }
//        }
//
//        if (demand > 0) {
//            return -1; // Waste is guaranteed, so return -1
//        }
//
//        // Calculate waste
//        for (int creamer : onHandCopy) {
//            waste += creamer;
//        }
//        for (int creamer : supplierCopy) {
//            waste += creamer;
//        }
//
//        return maxOrder;
//    }
public static int check(List<Integer> onHand, List<Integer> supplier, int demand, int order) {
    int m = onHand.size();
    int n = supplier.size();
    int onHandIndex = 0;
    int supplierIndex = n - order;
    for (int i = 0; i < m + order; i++) {
        if (supplierIndex < n && (supplier.get(supplierIndex) <= onHand.get(onHandIndex) || onHandIndex >= m)) {
            if (supplier.get(supplierIndex) < i / demand) {
                return 0;
            }
            supplierIndex++;
        } else {
            if (onHand.get(onHandIndex) < i / demand) {
                return 0;
            }
            onHandIndex++;
        }
    }
    return 1;
}
    public static int stockLounge(List<Integer> onHand, List<Integer> supplier, int demand) {
        int m = onHand.size();
        int n = supplier.size();
        Collections.sort(onHand);
        Collections.sort(supplier);
        for (int i = 0; i < m; i ++) {
            if (onHand.get(i) < i / demand) {
                return -1;
            }
        }
        int left = 0, right = n, mid;
        while (left + 1 < right) {
            mid = left + (right - left) / 2;
            if ( check(onHand, supplier, demand, mid) == 1 ) left = mid;
            else right = mid - 1;
        }
        if ( check(onHand, supplier, demand, right) == 1 ) return right;
        else return left;
    }
    public static void main(String[] args) {
        // Test Case 1: Provided example
        List<Integer> onHand1 = Arrays.asList(0, 2, 2);
        List<Integer> supplier1 = Arrays.asList(2, 0, 0);
        int demand1 = 2;
        int result1 = stockLounge(onHand1, supplier1, demand1);
        System.out.println("Test Case 1: " + result1);

        // Test Case 2: Not enough creamer in stock
        List<Integer> onHand2 = Arrays.asList(0, 0, 0);
        List<Integer> supplier2 = Arrays.asList(2, 1, 3);
        int demand2 = 2;
        int result2 = stockLounge(onHand2, supplier2, demand2);
        System.out.println("Test Case 2: " + result2);

        List<Integer> onHand3 = Arrays.asList(4, 1, 3);
        List<Integer> supplier3 = Arrays.asList(0, 1, 0);
        int demand3 = 2;
        int result3 = stockLounge(onHand3, supplier3, demand3);
        System.out.println("Test Case 3: " + result3);

    }

}
