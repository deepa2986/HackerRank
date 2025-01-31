import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSort {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,3,2,1);
        List<Integer> result = countingSort(list);
        System.out.println(result);

    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here

        int[] countArray = new int[100];
        for(int i :  arr){
            countArray[i]++;
        }
        List<Integer> result = new ArrayList<>();
        for(int count :countArray){
            result.add(count);
        }
        return result;

    }
}
