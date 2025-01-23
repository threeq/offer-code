package com.uu2.book1.ch01;

public class Divide {
    // 题1
    public static int divide(int x, int y) {
        if (x==0x80000000 && y==-1) {
            return Integer.MAX_VALUE;
        }
        int negative = 2;
        if(x>0) {
            negative--;
            x = -x;
        }
        
        if(y>0){
            negative--;
            y = -y;
        }
        
        int result = divideCore(x, y);
        return negative==1?-result:result;
    }

    private static int divideCore(int x, int y) {
        int result = 0;
        while (x <= y){
            int value = y;
            int count = 1;
            while (x>=0xc0000000 && x <= (value + value)){
                value += value;
                count += count;
            }
            result += count;
            x -= value;
        }

        return result;
    }
}