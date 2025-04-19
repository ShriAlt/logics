package com.xworkz.logics.internal;

public class PrimeNumber {

   public boolean isPrimeNumber(int num){
        if (num==0){
            return false;
        }
        else if (num%2==0 | num%3==0){
            return false;
        }
        else return true;
    }
}
