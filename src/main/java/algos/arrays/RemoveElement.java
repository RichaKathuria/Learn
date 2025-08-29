package algos.arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int res=new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println(res);
    }

    public void displayArray(int[] arr){
        for(int num:arr){
            System.out.println(num);
        }
    }
    public int removeElement(int[] nums, int val) {

        int left=0;
        int length=nums.length;

        int i=0;
        while(i<length){
            if(nums[left]!=val){
                left++;
            }
            else{
                nums[left]=nums[i];
                nums[i]=val;
            }
            i++;
        }
        displayArray(nums);
        return left+1;
    }
}