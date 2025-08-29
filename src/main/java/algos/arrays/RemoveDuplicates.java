package algos.arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int result = new RemoveDuplicates().removeDuplicates(new int[]{0,0,0,0,0});
        System.out.println("The result is "+result);
    }

    public int removeDuplicates(int[] arr){

        int length = arr.length;

        if(length<2){
            return length;
        }

        int pointer=1;
        int last = arr[0];

        for(int i=1; i<length; i++){
            int current = arr[i];
            if(current!=last){
                arr[pointer] = current;
                pointer++;
            }
            last = current;
        }

        return pointer;
    }
}
