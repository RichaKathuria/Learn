package algos.arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int secondLargest=new SecondLargest().getSecondLarget(new int[]{1});
        System.out.println(secondLargest);
    }

    public int getSecondLarget(int[] arr){

        int length=arr.length;

        if(length<2){
            return -1;
        }

        int largest = Math.max(arr[0], arr[1]);
        int second = Math.min(arr[0], arr[1]);

        for(int i=2; i<length; i++){

            int current = arr[i];

            if(current>largest){
                int temp=largest;
                largest=current;
                second=temp;
            }

            else if(current>second){
                second=current;
            }

        }


        return second;
    }
}
