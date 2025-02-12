package programs;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //String s = String.valueOf(n);
        String s = Integer.toString(n);
        try{
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}



//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }
}



