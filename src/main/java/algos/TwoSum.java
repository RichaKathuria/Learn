package algos;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[] arr = twoSum.getTargetSum(new int[]{1,2,3,4,5,6,7} , 100);

        System.out.println("The indices are stored in result array.");
        twoSum.displayArray(arr);

    }

    public void displayArray(int[] arr){
        System.out.println("The array is: ");

        for(int num : arr){
            System.out.println(num);
        }
    }

    public int[] getTargetSum(int[] arr , int target){


        if(arr.length<2){
            return new int[]{-1,-1};
        }

        int[] retArr = new int[2];

        int left = 0;
        int right = arr.length-1;

        int found = 0;

        while (left<right && right<=arr.length-1){


            int leftVal = arr[left];
            int rightVal = arr[right];
            int sum = leftVal+rightVal;

            if(sum==target){
                found = 1;
                break;
            } else if (sum>target) {
                right--;
            }
            else{
                left++;
            }
        }


        if(found==1){
            retArr[0] = left;
            retArr[1] = right;
        }
        else{
            retArr[0] = -1;
            retArr[1] = -1;
        }

        return retArr;
    }
}
