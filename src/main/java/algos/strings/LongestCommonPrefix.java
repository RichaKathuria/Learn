package algos.strings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int length=findShortestStringLength(strs);

        if(length==0){
            return "";
        }
        StringBuilder sb=new StringBuilder(length);

        outer:
        for(int i=0; i<length; i++){
            String str=strs[0];
            char ch=str.charAt(i);
            boolean flag=true;

            for(int j=1; j<strs.length; j++){
                if(ch!=strs[j].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }

    public int findShortestStringLength(String[] strs){

        int length = strs[0].length();

        for(String str:strs){
            length = Math.min(length, str.trim().length());
        }

        return length;
    }
}