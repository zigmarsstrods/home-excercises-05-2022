package io.codelex.arrays.practice.exercise3;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};


        //fixme - calculate sum of all array elements
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        //fixme - calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);

    }
}
