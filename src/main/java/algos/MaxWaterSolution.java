package algos;

public class MaxWaterSolution {

    public static void main(String[] args) {
        MaxWaterSolution maxWaterSolution = new MaxWaterSolution();
        int maxWater = maxWaterSolution.getMaxWater(new int[]{2,1,8,6,4,6,5,5});
        System.out.println("The max water that can be stored is "+maxWater);
    }

    public int getMaxWater(int[] arr){
        int max = 0;
        int length = arr.length;

        int left=0;
        int right = arr.length-1;

        int current = 0;

        while (left<right){

            int valueLeft = arr[left];
            int valueRight = arr[right];
            current = Math.min(valueRight,valueLeft)*(right-left);

            max = Math.max(current,max);

            if(valueLeft<valueRight){
                left++;
            }

            else{
                right--;
            }

        }



        return max;
    }
}
