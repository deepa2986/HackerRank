public class RecursiveDigitSum {

    public static void main(String[] args) {
        String digit = "861568688536788";
        int k = 100000;

        int superDigit = superDigit(digit, k);
        System.out.println(superDigit);

    }

    public static int sumOfDigit(String num){
      if(num.length() == 1){
          return Integer.parseInt(num);
      }
      int sum = 0;
      for(int i = 0; i < num.length(); i++){
          sum += Integer.parseInt(String.valueOf(num.charAt(i)));
      }
      return sumOfDigit(String.valueOf(sum));
    }

    public static int superDigit(String n, int k) {
        // Write your code here
        int superDigit = sumOfDigit(n) * k;
        if(superDigit > 9){
            superDigit = sumOfDigit(String.valueOf(superDigit));
        }
        return superDigit;
    }
}
