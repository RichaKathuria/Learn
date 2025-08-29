package algos.strings;

public class RomanToInteger {

    int pointer=0;

    public static void main(String[] args) {
        int res = new RomanToInteger().romanToInt("III");
        System.out.println(res);
    }

    public int romanToInt(String s) {

        int length = s.length();
        int sum = 0;

        while(pointer<length-1){

            int i=pointer;
            char current = s.charAt(i);
            char next = s.charAt(i+1);

            System.out.println("current="+current);
            System.out.println("next="+next);
            sum = sum+getValue(current, next);
        }

        if(pointer!=length){
            sum+=getValue(s.charAt(length-1));
        }
        return sum;
    }

    public int getValue(char current){

        switch(current){
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;
        }
        return 0;
    }

    public int getValue(char current, char next){

        pointer=pointer+2;
        if(current=='I' && next=='V')
            return 4;

        else if(current=='I' && next=='X')
            return 9;

        else if(current=='X' && next=='L')
            return 40;

        else if(current=='X' && next=='C')
            return 90;

        else if(current=='C' && next=='D')
            return 400;

        else if(current=='C' && next=='M')
            return 900;

        else
        {   pointer--;
            return getValue(current);
        }


    }
}