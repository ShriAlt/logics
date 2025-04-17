package com.xworkz.logics.internal;

public class ArmstrongNumber {
    // Armstrong number is a number which the sum of power raised to the number of digits is equal to the number
    // that is 1^3+5^3+3^3=1+125+27=153

   public boolean isNumberIsArmstrong(int num){
        int original =num;
        int result=0;
        int digits=String.valueOf(num).length();
        while (num>0){
          int  digit = num%10;
            result +=Math.pow(digit,digits);
            num /=10;
        }
        return result==original;
    }
}
