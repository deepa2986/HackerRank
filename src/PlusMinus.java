import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                countZero++;
            } else if (arr.get(i) < 0) {
                countNegative++;
            } else countPositive++;
        }

        float positive =  (float) countPositive / arr.size();
        System.out.println(positive);
        float negative = (float) countNegative / arr.size();
        System.out.println(negative);
        float zero = (float)countZero / arr.size();
        System.out.println(zero);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(list);
    }
}
