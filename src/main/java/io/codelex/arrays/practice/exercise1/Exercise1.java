package io.codelex.arrays.practice.exercise1;

import java.util.Arrays;

public class Exercise1 {

    //TODO: Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };


        System.out.println("Original numeric array : " + Arrays.toString(myArray1));

        Arrays.sort(myArray1); //Sort array
        System.out.println("Sorted numeric array : " + Arrays.toString(myArray1));

        System.out.println("Original string array : " + Arrays.toString(myArray2));

        Arrays.sort(myArray2); //Sort array
        System.out.println("Sorted string array : " + Arrays.toString(myArray2));

        int one = 2;

        for (int i=0;i<18;i++) {
            System.out.println(one);
            one+=Math.pow(2,i);
        }
    }
}
