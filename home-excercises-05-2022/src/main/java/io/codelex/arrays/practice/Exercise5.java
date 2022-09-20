package io.codelex.arrays.practice;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexOfElement36 = -1;
        int indexOfElement29 = -1;


        for (int i = 0; i < myArray.length; i++) {
            int currentEl = myArray[i];
            if (currentEl == 36) {
                indexOfElement36 = i;
            } else if (currentEl == 29) {
                indexOfElement29 = i;
            }
        }


        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8


        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);

    }
}
