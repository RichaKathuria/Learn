package algos.strings;

public class ReverseStringAsArray {

    public static void main(String[] args) {
        char[] arr = new char[]{'h','e','l','l','o'};
        new ReverseStringAsArray().reverseString(arr);

        System.out.println("The array is:");

        for(char ch:arr){
            System.out.print(ch+" ");
        }
    }
    public void reverseString(char[] s) {

        int length = s.length;
        if (length < 2) {
            return;
        }
        int left = 0;
        int right = length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
