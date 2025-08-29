package algos.arrays;

public class SingleNumber {

    public static void main(String[] args) {
        int singleNum = new SingleNumber().singleNumber(new int[]{2,2,1});
        System.out.println(singleNum);
    }

    public int singleNumber(int[] nums) {

        int res = 0;

        for(int num : nums){
            res = res^num;
        }

        return res;
    }
}
