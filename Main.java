package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=2;i<100;i++) {
            System.out.println(Arrays.toString(countBits(i)) + " " + i);
            System.out.println(Integer.toBinaryString(i)+" "+i);
        }
    }

    private static int[] countBits(int num) {
        int [] array = new int[num+1];
        array[0] =0;
        if(num==0)
            return array;
        array[1] = 1;
        if(num==1)
            return array;
        int space = 1;
        for (int i=2;i<=num;i++){
            //if n is a power of two increase space
           if(Math.pow(2,space)==i) {
               array[i] = 1;
               space++;
           }
           else
           {
               //System.out.println(Math.pow(space,2));
               int differnce = i-(int)Math.pow(2,space-1);
              // System.out.println(differnce);
               array[i] = array[differnce]+1;
           }

        }
        return array;
    }
    private static String something(int [] array){
        return null;
    }
}
