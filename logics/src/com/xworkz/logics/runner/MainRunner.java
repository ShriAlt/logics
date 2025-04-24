package com.xworkz.logics.runner;

import com.xworkz.logics.internal.ArmstrongNumber;
import com.xworkz.logics.internal.PrimeNumber;
import com.xworkz.logics.internal.Sort;
import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class MainRunner {
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber=new ArmstrongNumber();;
     armstrongNumber.isNumberIsArmstrong(3);
        System.out.printf("number is armstrong :"+armstrongNumber.isNumberIsArmstrong(153));
        PrimeNumber primeNumber=new PrimeNumber();
        System.out.println("is prime"+primeNumber.isPrimeNumber(4));
        Sort sort=new Sort();
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int[] result=sort.decendingArray(num);
        System.out.println("array"+ Arrays.toString(result));
    }
}
