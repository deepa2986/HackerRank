package mocktest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,3,1,2,4);
        int median = findMedian(list);
        System.out.println(median);

    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int medianI = arr.size() / 2;
        int median = arr.get(medianI);
        return median;
    }
}
