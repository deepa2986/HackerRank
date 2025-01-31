package mocktest;

public class PalindromeIndex {
    public static int isValidPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while ((left <= right)) {
            if(s.charAt(left) != s.charAt(right)){
                if( isPalindrome(s,left+1,right)){
                    return left;
                } if(isPalindrome(s,left,right-1)){
                    return right;
                }
            }
            left++;
            right--;
        }
        return -1;
    }

    public static boolean isPalindrome(String s,int start,int end){
        while (start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aaa";
        int validPalindrome = isValidPalindrome(s);
        System.out.println(validPalindrome);
    }
}
