package programs;

public class IfElse {
    public static void main(String[] args) {
        int N = 4;
        if(N % 2 > 0){
            System.out.println("Weird");
        }else {
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }else if(N >= 6 && N <= 20 ){
                System.out.println("Weird");
            }else if(N > 20){
                System.out.println("Not Weird");
            }
        }
    }
}
