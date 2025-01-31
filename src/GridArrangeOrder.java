import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridArrangeOrder {

    public static void main(String[] args) {

        List<String> grid = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
//        for (String s : grid) {
//            System.out.println(s);
//        }
       // System.out.println(grid);
        List<String> grid1 = Arrays.asList("abc", "ade", "efg");
        String s = gridChallenge(grid1);
        System.out.println(s);

    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        List<String> result = new ArrayList<>();
        for (String s : grid) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String s1 = new String(charArray);
            result.add(s1);
        }
            for(int row  = 1; row < result.size(); row++){
                for(int col = 0; col < result.get(0).length(); col++){
                if(result.get(row).charAt(col) < result.get(row - 1).charAt(col)){
                    return "No";
                }
            }
        }
        return "yes";

    }
}
