import java.util.Arrays;
import java.util.List;

public class MinMax {

    //1 2 3 4 5 -input
    //10 14 -output

    public static void minMaxSum(List<Integer> list) {
        long minSum = 0;
        long maxSum = Integer.MIN_VALUE;
        long sumMax = 0;
        long sum = 0;
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
            sum = sum + list.get(i);
        }
        minSum = sum - max;

        for(int  i = 0; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
            sumMax = sumMax + list.get(i);
            maxSum = Math.max(sumMax,maxSum);
        }

        maxSum = maxSum - min;
        System.out.println(minSum + " " + maxSum);
    }


    public static void minMaxOptimised(List<Integer> list){
        long min= list.stream().min(Integer::compareTo).get();
        long max = list.stream().max(Integer::compareTo).get();
        long sum = 0;
        long maxSum;
        long minSum;
        for(int i : list){
            sum = sum + i;
        }
        maxSum = sum - min;
        minSum = sum - max;
        System.out.println(minSum + " " + maxSum);

    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        minMaxSum(list);

        List<Integer> list2 = Arrays.asList(1,3,5,7,9);
        minMaxSum(list2);

        List<Integer> list1 = Arrays.asList(7 ,69, 2, 221, 8974);
        minMaxSum(list1);

        List<Integer> list3 = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
        minMaxSum(list3);

        List<Integer> list4 = Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279);
        minMaxSum(list4);

        System.out.println("---------------------");

        minMaxOptimised(list);
        minMaxOptimised(list2);
        minMaxOptimised(list1);
        minMaxOptimised(list3);
        minMaxOptimised(list4);


    }
}
