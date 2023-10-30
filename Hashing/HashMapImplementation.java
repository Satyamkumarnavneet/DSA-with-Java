package Hashing;
import java.util.*;

public class HashMapImplementation {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements
        private int N;
        private LinkedList<Node>[] buckets; // array of linked lists

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % N;
        }

        public int searchInLinkedList(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];
            int dataIndex = 0;
            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return dataIndex;
                }
                dataIndex++;
            }
            return -1;
        }

        private void reHash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Re-insert elements into the new buckets array
            for (LinkedList<Node> ll : oldBucket) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // 0(lambda) -> 0(1)
            int bucketIndex = hashFunction(key); // 0 to 3
            int dataIndex = searchInLinkedList(key, bucketIndex); // valid index or -1
            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            } else {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                reHash();
            }
        }

        public boolean containsKey(K key) { // 0(1)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            return dataIndex != -1;
        }

        public V remove(K key) { // 0(1)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            }
            return null;
        }

        public V get(K key) { // 0(1)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            if (dataIndex != -1) {
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("Russia", 200);
        map.put("America", 300);
        map.put("Sweden", 300);
        map.put("Belarus", 600);

        System.out.println(map.get("India")); // Output: 100
        System.out.println(map.containsKey("Belarus")); // Output: true
        System.out.println(map.containsKey("Denmark")); // Output: false

        map.remove("America");
        System.out.println(map.containsKey("America")); // Output: false

        ArrayList<String> keys = map.keySet();
        System.out.println(keys); // Output: [Sweden, Belarus, Russia, India]
    }
}
