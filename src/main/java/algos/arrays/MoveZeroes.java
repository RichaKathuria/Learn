package algos.arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,0};
        new MoveZeroes().moveZeroes(arr);

        System.out.println("The array post method call is :");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public void moveZeroes(int[] nums) {
        //5,6,0,0,0,3,12
        //5,6,1,3,12,0,0

        int j = -1;
        int n=nums.length;
        // Step 1: Find the first zero in the array
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;  // Found the first zero index
                break;
            }
        }

        // If no zeros are found, return the array as is
        if (j == -1) return;

        // Step 2: Swap non-zero elements with position j and update j
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }


    }
}
