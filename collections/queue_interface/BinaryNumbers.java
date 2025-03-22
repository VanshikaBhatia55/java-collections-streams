package java_collections_streams.collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class BinaryNumbers {
    public static List<String> generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();
        queue.offer("1");

        for (int i = 0; i < N; i++) {
            String curr = queue.poll();
            result.add(curr);
            queue.offer(curr + "0");
            queue.offer(curr + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println("First " + N + " binary numbers: " + binaryNumbers);
    }
}
