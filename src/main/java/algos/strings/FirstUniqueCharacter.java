package algos.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        int length = s.trim().length();

        if(length==0){
            return -1;
        }
        if(length==1){
            return 0;
        }

        Map<Character, Integer> map = buildMap(s);

        char uniqueChar = getUniqFromMap(map);

        if(uniqueChar==' '){
            return -1;
        }

        return s.indexOf(uniqueChar);
    }

    public char getUniqFromMap(Map<Character, Integer> map){

        char ch=' ';

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();

            if(val==1){
                ch = key;
                break;
            }
        }

        return ch;
    }

    public Map<Character, Integer> buildMap(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

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
