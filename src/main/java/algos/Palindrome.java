package algos;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.checkIfPalindrome("levels");
        System.out.println(isPalindrome);
    }

    public boolean checkIfPalindrome(String str){

        boolean isPalindrome = true;

        int length = str.length();

        int left = 0;
        int right = length-1;

        str=str.toLowerCase(Locale.ROOT);

        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }

            left++;
            right--;

        }
        return isPalindrome;
    }
}
