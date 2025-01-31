import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,3,2,1);
        int result = lonelyInteger(list);
        System.out.println(result);

    }

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i : a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
