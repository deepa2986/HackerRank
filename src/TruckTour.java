import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckTour {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,5));
        list.add(Arrays.asList(10,3));
        list.add(Arrays.asList(3,4));

        int i = truckTour(list);
        System.out.println(i);

    }

    public static int truckTour(List<List<Integer>> petrolpumps) {
        // Write your code here
        int remainingPetrol = 0;
        int smallestIndex  = 0;

        for (int i = 0; i <  petrolpumps.size(); i++){
            int petrolQ = petrolpumps.get(i).get(0);
            int distance = petrolpumps.get(i).get(1);
            remainingPetrol += petrolQ - distance;


            if (remainingPetrol < 0){
                smallestIndex =  i + 1;
                remainingPetrol = 0;
            }
        }
        return smallestIndex;
    }
    }

