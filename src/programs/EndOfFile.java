package programs;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNum = 1;
        while (scanner.hasNext()){
            System.out.println(lineNum + " " + scanner.nextLine());
            lineNum++;
        }
        scanner.close();
    }
}
