package dpp;

import java.util.HashSet;

/*
    Method one to find smallest and largest number and loop to check Strobogrammatic number
    ndigit= Number of digit
    Complexity O(n*ndigit)
     */

public class StrobogrammaticNumber {

    public static void main(String[] str){

        findStrobogrammaticNumbers(4);

    }


    public static void findStrobogrammaticNumbers(int ndigit){

        int smallest=(int)Math.pow(Double.parseDouble(String.valueOf(10)),Double.parseDouble(String.valueOf(ndigit-1)));
        int largest=(int)Math.pow(Double.parseDouble(String.valueOf(10)),Double.parseDouble(String.valueOf(ndigit)))-1;

        for (int i=smallest;i<=largest;i++){

            if(checkStrobogrammatic(i)){
                System.out.println(i);
            }

        }

    }

    public static boolean checkStrobogrammatic(int inputNumber){

        int strLength=Integer.toString(inputNumber).length();
        String strNumber=Integer.toString(inputNumber);
        StringBuilder newstring=new StringBuilder();
        HashSet<Character> set180numbers=new HashSet<>();
        set180numbers.add('1');
        set180numbers.add('6');
        set180numbers.add('9');
        set180numbers.add('8');

        for(int i=strLength-1;i>=0;i--)
        {

            if(set180numbers.contains(strNumber.charAt(i))) {
                if (strNumber.charAt(i) == '6')
                    newstring.append('9');
                else if (strNumber.charAt(i) == '9')
                    newstring.append('6');
                else
                    newstring.append(strNumber.charAt(i));
            }
            else{

                return false;
            }

        }


        if (newstring.toString().equals(strNumber))
            return true;
        else
            return false;


    }
}
