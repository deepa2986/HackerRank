package programs.lambdaexpressions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) throws IOException {
        LambdaExpressions expressions = new LambdaExpressions();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean test = false;
        String result = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                Predicate<Integer> odd = expressions.isOdd();
                test = odd.test(num);
                result = (test) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                Predicate<Integer>  prime = expressions.isPrime();
                test = prime.test(num);
                result = (test) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                Predicate<Integer> palindrome = expressions.isPalindrome();
                test = palindrome.test(num);
                result = (test) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(result);
        }
    }
}

