package com.company;

/**
 * Created by ousma on 4/26/2017.
 */
public class Persist {
    public static int persistence(long n){
        int counter = 0;
        while(n > 9){
            long newNum = 1L;
            while(n > 0){
                long r = n%10;
                n = n/10;
                newNum *= r;
            }
            n = newNum;
            counter++;
        }
        return counter;
    }
}
