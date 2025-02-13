package programs.lambdaexpressions;



import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LambdaExpressions {

    public Predicate<Integer> isOdd(){
        return n -> n % 2 != 0;
    }
    public  Predicate<Integer> isPrime(){
        return n -> IntStream.range(2,(n/2) + 1).noneMatch(i -> n%i == 0);
    }
    public Predicate<Integer>  isPalindrome() {
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


}
