import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(4,5,6));
        list.add(Arrays.asList(9,8,9));
        System.out.println(list);
        int i = diagonalDifference(list);
        System.out.println(i);
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i);
            secondaryDiagonalSum += arr.get(i).get(n - i - 1);
        }
        int diaDifference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        return diaDifference;
    }
}
