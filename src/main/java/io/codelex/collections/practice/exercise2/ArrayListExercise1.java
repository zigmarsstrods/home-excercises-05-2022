package io.codelex.collections.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise1 {

    //TODO: Write a Java program to create a new array list, add some elements (string) and print out the collection.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        //TODO: Add 5 colors to list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");

        System.out.println(colors);
    }

}