package com.xworkz.logics.runner;

import com.xworkz.logics.internal.ArmstrongNumber;
import com.xworkz.logics.internal.PrimeNumber;

public class MainRunner {
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber=new ArmstrongNumber();
//        armstrongNumber.isNumberIsArmstrong(3);
        System.out.printf("number is armstrong :"+armstrongNumber.isNumberIsArmstrong(153));
        PrimeNumber primeNumber=new PrimeNumber();
        System.out.println("is prime"+primeNumber.isPrimeNumber(3));
    }
}
