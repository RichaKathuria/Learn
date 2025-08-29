package algos.strings;

public class Palindrome {

    public static void main(String[] args) {
        boolean res = new Palindrome().isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(res);
    }
    public boolean isPalindrome(String s) {

        int length=s.length();

        if(length<2)
            return true;



        s=s.trim().toLowerCase().replaceAll("[^a-z0-9]","");
        length=s.length();

        int left = 0;
        int right = length-1;

        while(left<right){

            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
