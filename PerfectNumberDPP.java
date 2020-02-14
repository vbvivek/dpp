package dpp;

/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Microsoft.

A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer n, return the n-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.
 */

public class PerfectNumberDPP {

    static final int PERFECT=10;

    public static void main(String[] args){

        int perfectNumber=findPerfectNumber(123);
        if(perfectNumber==0)
            System.out.println("Already a Perfect Number");
        else if (perfectNumber<0)
            System.out.println("Perfect Number is not availabe");
        else
        System.out.println("Perfect Number is "+perfectNumber);

    }

    public static int findPerfectNumber(int n){
        String inputNumber = Integer.toString(n);
        int perfectNumber;
        int intermediate=PERFECT ;
        for (char c : inputNumber.toCharArray()){
            intermediate=intermediate-Integer.parseInt(String.valueOf(c));
        }

        if(intermediate==0)
            return 0;
        else if(intermediate<0)
            return -1;

        perfectNumber=Integer.parseInt(inputNumber+Integer.toString(intermediate));
        return perfectNumber;
    }
}
