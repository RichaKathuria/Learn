package algos.strings;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        System.out.println(new Anagrams().isAnagram("a", "ab"));
    }

    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        //Build maps
        sMap = buildMap(s);
        tMap = buildMap(t);

        if(sMap.size()!=tMap.size()){
            return false;
        }

        return compareMaps(sMap, tMap);

    }

    public boolean compareMaps(Map<Character, Integer> map1, Map<Character, Integer> map2){

        for(Map.Entry<Character, Integer> entry : map1.entrySet()){

            char ch = entry.getKey();
            int value = entry.getValue();

            if(map2.containsKey(ch)){
                if(map2.get(ch)!=value){
                    return false;
                }
            }
            else{
                return false;
            }
        }

        return true;
    }


    public Map<Character, Integer> buildMap(String str){

        Map<Character, Integer> map = new HashMap<>();

        int length = str.length();
        for(int i=0; i<length; i++){

            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);

            }

        }

        return map;
    }
}