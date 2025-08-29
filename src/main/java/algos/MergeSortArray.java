package algos;

public class MergeSortArray {

    public static void main(String[] args) {
        MergeSortArray mergeSortArray=new MergeSortArray();
        int[] arr = new int[]{2,1,3,5,3,6,-1};
        System.out.println("The array originally is: ");
        mergeSortArray.displayArray(arr);
        mergeSortArray.mergeSort(arr);
        System.out.println("The array after sorting is: ");
        mergeSortArray.displayArray(arr);
    }

    public void displayArray(int[] arr){
        for(int n: arr){
            System.out.println(n);
        }
    }
    public void mergeSort(int[] arr){

        int length = arr.length;

        if(length<2){
            return;
        }

        int mid = length/2;//3

        int[] leftHalf = new int[mid];//3
        int[] rightHalf = new int[length-mid];//4

        for(int i=0; i<mid; i++){
            leftHalf[i] = arr[i];
        }

        for(int i=mid; i<length; i++){
            rightHalf[i-mid] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);

    }

    public void merge(int[] arr , int[] leftHalf, int[] rightHalf){

        int i=0;
        int j=0;
        int k=0;

        int lengthLeftHalf = leftHalf.length;
        int lengthRightHalf = rightHalf.length;

        while(i<lengthLeftHalf && j<lengthRightHalf){

            if(leftHalf[i]<rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }
            else{
                arr[k] = rightHalf[j];
                j++;
            }

            k++;
        }

        while(i<lengthLeftHalf){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j<lengthRightHalf){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }

    }
}
