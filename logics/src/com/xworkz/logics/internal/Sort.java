package com.xworkz.logics.internal;

public class Sort {
    int[] numbers={1,2,3,4,5,6,7,8,9,10};
    public int[] decendingArray(int[] numbers){
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] < numbers[j]) {
                    // Swap
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }return numbers;
    }

}
