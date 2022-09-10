package io.codelex.loops.practice;

import java.util.Scanner;

public class BookIndex {
    public static void main(String[] args) {
        System.out.println("Please enter the paragraph name: ");
        Scanner input = new Scanner(System.in);
        String pgraph = input.nextLine();
        System.out.println("Please enter the starting page: ");
        String index = input.nextLine();
        if (pgraph.length() + index.length() > 30) {
            System.out.println("Your input can not be displayed in one line! Please try again!");
        } else {
            System.out.print(pgraph);
            for (int i = 0; i < (30 - pgraph.length() - index.length()); i++) {
                System.out.print(".");
            }
            System.out.print(index);
        }
    }
}
