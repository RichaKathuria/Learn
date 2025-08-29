package interview;

import java.util.*;

public class SumTarget {

    //{1,2,3,4,2,3,2,0} -4 - 0,1,2,2
    //1,3 2,2, 4,0


    public static void main(String[] args) {
        List<List<Integer>> ret = new SumTarget().getSumTargetNums(4, new int[]{1,2,3,4,2,3,2,0,2} );
        System.out.println(ret);
    }

    public Map<Integer, Integer> getMap(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }

        }


        return map;
    }

    public List<List<Integer>> getSumTargetNums(int n, int[] arr){

        List<List<Integer>> ret=new ArrayList<>();

        Map<Integer,Integer> map = getMap(arr);

        for(int i=0; i< arr.length; i++){
            List<Integer> list = new ArrayList<>();
            int current = arr[i];
            int target = n-current;
            if(map.containsKey(current) && map.get(current)>0){
            for(int j=1; j<arr.length;j++){
                int jNum = arr[j];
                if(jNum==target && map.containsKey(jNum) && map.get(jNum)>0){
                    list.add(current);
                    list.add(jNum);
                    ret.add(list);
                    map.put(jNum, map.get(jNum)-1);
                    map.put(current, map.get(current)-1);
                    break;
                }
            }}
        }

        return ret;
    }
}
