package TriangleExercises;

import java.util.Scanner;

public class DrawVerticalLine {

    public static void main(String args[]) {
        System.out.println("Please input a number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; ++i) {
            System.out.println("*");
        }

    }
}
