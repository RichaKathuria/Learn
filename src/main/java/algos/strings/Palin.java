package algos.strings;

public class Palin {

    public static void main(String[] args) {
         boolean res= new Palin().isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(res);
    }

    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");

        int left = 0 ;
        int right = s.length()-1;

        while(left<right){

            if(s.charAt(left)!=s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}

