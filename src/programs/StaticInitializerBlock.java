package programs;

import java.util.Scanner;

public class StaticInitializerBlock {

    static int breadth;
    static int height;
    static boolean flag = true;
//    static {
//        Scanner scanner = new Scanner(System.in);
//        breadth = scanner.nextInt();
//        height = scanner.nextInt();
//        scanner.close();
//        try {
//            if(breadth <= 0 || height <= 0) {
//                flag = false;
//                throw new Exception("Breadth and height must be positive");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//            System.exit(0);
//        }
//    }

    static{
        Scanner input = new Scanner(System.in);
        breadth = input.nextInt();
        height = input.nextInt();
        input.close();
        if(breadth <= 0 || height <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else flag = true;
    }

    public static void main(String[] args) {
        if(flag){
            int area = breadth * height;
            System.out.println(area);
        }
    }
}
