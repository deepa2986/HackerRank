package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
interface PerformOperation {
    boolean test(int a);
}

public class LambdaExpressions {

    public static boolean checker(PerformOperation p, int num) {
        return p.test(num);
    }
    public PerformOperation isOdd(){
        return n -> n % 2 != 0;
    }

    public  PerformOperation isPrime(){
        return n -> {
            if (n < 2)
                return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {
            int reverse = 0, original = n;
            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }
            return reverse == original;
        };
    }

    class Solution{

    public static void main(String[] args) throws IOException {

        LambdaExpressions expressions = new LambdaExpressions();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = expressions.isOdd();
                ret = expressions.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = expressions.isPrime();
                ret = expressions.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = expressions.isPalindrome();
                ret = expressions.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
    }
}
