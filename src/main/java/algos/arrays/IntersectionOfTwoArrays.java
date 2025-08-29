package algos.arrays;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr = new IntersectionOfTwoArrays().intersect(new int[]{1,2,2,1}, new int[]{2,2});
        System.out.println("The array is ");

        for(int num: arr){
            System.out.print(num+" ");
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num:nums1){
         if(map1.containsKey(num)){
             map1.put(num, map1.get(num)+1);
         }
         else{
             map1.put(num,1);
         }
        }

        for(int num:nums2){
            if(map2.containsKey(num)){
                map2.put(num, map2.get(num)+1);
            }
            else{
                map2.put(num,1);
            }
        }


        for(Map.Entry<Integer,Integer> entry: map1.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(map2.containsKey(key)){
                int value2 = map2.get(key);
                int times = Math.min(value,value2);

                for(int i=0; i<times; i++){
                    list.add(key);
                }

            }
        }

        int[] arr = new int[list.size()];
        int i = 0;
        for(int num : list){
            arr[i]=num;
            i++;
        }

        return arr;
    }

}
