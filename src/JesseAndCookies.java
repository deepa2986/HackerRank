import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookies {

    public static void main(String[] args) {

        // List<Integer> list = Arrays.asList(2,7,3,6,4,6);
        List<Integer> list = Arrays.asList(1, 2, 3, 9, 10, 12);
        int k = 7;
        int cookies = cookies(k, list);
        System.out.println(cookies);
    }

    public static int cookies(int k, List<Integer> A) {
        // Write your code here

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int minOperations = 0;
        for(int i :A){
            queue.add(i);
        }
        while(queue.size() > 1 && queue.peek() < k){
            int min = queue.peek();
            int sweetness = queue.poll() + (2 * queue.poll());
            if(sweetness < min)
                return -1;
            queue.add(sweetness);
            minOperations++;
        }
        if(queue.peek() >= k)
            return minOperations;
        else return -1;
    }
}
