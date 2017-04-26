package com.company;

/**
 * Created by ousma on 4/26/2017.
 */
public class ASum {

    public static long findNb(long m){
        int n=1;
        int counter = 0;
        while (m > 0){
            m = m - computeCubic(n);
            n++;
            counter++;
        }
        if(m == 0) return counter;
        else return -1L;
    }

    private static long computeCubic(long num){
        int i = 3;
        long coefficient = 1L;
        while(i > 0){
            coefficient *= num;
            i--;
        }

        return coefficient;
    }

    public static void main(String[] args) {
        System.out.println(ASum.findNb(4183059834009L));
        System.out.println(ASum.findNb(24723578342962L));
    }
}
