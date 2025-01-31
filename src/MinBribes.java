import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinBribes {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 1, 3, 4);
      //  List<Integer> list = Arrays.asList(2, 1, 5, 3, 4);
        minimumBribes(list);

    }

    public static void minimumBribes(List<Integer> q) {

        int count = 0;
        for(int i = q.size() - 1; i > 0; i--){
      //  for(int i = 1; i < q.size(); i++){
            if(q.get(i) != i + 1){
                if(q.get(i -1) == (i + 1)){
                    count++;
                  //  q.set(i,q.get(i-1));
                    Collections.swap(q, i, i - 1);
                } else if (q.get(i-2) == (i+1)) {
                    count = count + 2;
//                    q.set(i - 2, q.get(i - 1));
//                    q.set(i - 1, q.get(i));

                    Collections.swap(q, i-2, i-1);
                    Collections.swap(q, i-1, i);
                }else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(count);
    }
}


