package com.xworkz.logics.runner;

import com.xworkz.logics.internal.ArmstrongNumber;

public class MainRunner {
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber=new ArmstrongNumber();
//        armstrongNumber.isNumberIsArmstrong(3);
        System.out.printf("number is armstrong :"+armstrongNumber.isNumberIsArmstrong(153));
    }
}
