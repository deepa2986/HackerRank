package programs;

import java.util.Scanner;

public class StdInOutII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        String s = scanner.nextLine();
        if(s.isEmpty()){
            s = scanner.nextLine();
        }

        System.out.println("String : " +s);
        System.out.println("Double : " +d);
        System.out.println("Int : " + i);
    }
}
