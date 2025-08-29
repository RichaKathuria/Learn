package algos;

import java.util.HashSet;
import java.util.Set;

/**
 * This program is to solve the problem - Given an array, return true if at least 1 element is duplicate else return false.
 */
public class DuplicateInArray {

    public static void main(String[] args) {
        DuplicateInArray duplicateInArray=new DuplicateInArray();
        boolean res = duplicateInArray.checkDuplicateUsingHashSet(new int[]{1,90,100,78,67,8,9,6767,5656,10});
        System.out.println(res);
    }

    //Using HashSet
    public boolean checkDuplicateUsingHashSet(int[] arr){
        boolean res = false;

        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                return true;
            }
        }
        return res;
    }


    //Using sorting and then checking.
    public boolean checkDuplicate(int[] arr){

        boolean res = false;

        if(arr.length<=1){
            return false;
        }

        MergeSortArray mergeSortArray=new MergeSortArray();
        mergeSortArray.mergeSort(arr);

        for(int i=0; i<arr.length ; i++){

            int current = arr[i];
            int next = arr[i+1];

            if(current==next)
                return true;

        }

        return res;
    }
}
