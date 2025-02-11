package mocktest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairsCount {

    public static int pairs(int k, List<Integer> arr) {
    int pairsCount = 0;
    Set<Integer> set = new HashSet<>();
    for(int i : arr){
        set.add(i);
    }
    for(int i: arr){
        if(set.contains(i + k)){
            pairsCount++;
        }
    }
    return pairsCount;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,4,2);
        int k = 2;
        int pairsCount = pairs(k, list);
        System.out.println(pairsCount);

    }
}
