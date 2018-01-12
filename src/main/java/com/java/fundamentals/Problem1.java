package com.java.fundamentals;

public class Problem1 {
    public int getMultiples(int multiple1, int multiple2, int limit) {
        int value = 0;

        for (int i = 0; i < limit; i++){
            if (i % multiple1 == 0 || i % multiple2 == 0){
                value += i;
            }
        }
        return value;
    }
}
