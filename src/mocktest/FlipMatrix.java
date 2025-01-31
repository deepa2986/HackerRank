package mocktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipMatrix {

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(112, 42, 83, 119));
        matrix.add(Arrays.asList(56, 125, 56, 49));
        matrix.add(Arrays.asList(15, 78, 101, 43));
        matrix.add(Arrays.asList(62, 98, 114, 108));
        int sum = flippingMatrix(matrix);
        System.out.println(sum);

    }

        public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.size()/2; i++){
            for(int j = 0; j < matrix.size()/2; j++){
                sum += Math.max(matrix.get(i).get(j),Math.max(matrix.get(i).get(matrix.size() - 1 -j)
                        ,Math.max(matrix.get(matrix.size() - 1 -i).get(j)
                                ,matrix.get(matrix.size() - 1 -i).get(matrix.size() - 1 - j))));
            }

        }
            return sum;
        }

}
