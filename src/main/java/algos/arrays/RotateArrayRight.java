package algos.arrays;

public class RotateArrayRight {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};//1,2 (7)--->
        new RotateArrayRight().rotate(arr,2);

        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public void rotate(int[] nums, int k) {

        int length = nums.length;
        if(length<2){
            return;
        }

        k=k%length;//If k>length

        reverseArray(nums , 0, length-k-1);
        reverseArray(nums, length-k, length-1);
        reverseArray(nums, 0, length-1);
    }

    //2 pointer approach for Reversal.
    public void reverseArray(int[] arr, int begin, int end){

        int left = begin;
        int right = end;

        while(left<right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
