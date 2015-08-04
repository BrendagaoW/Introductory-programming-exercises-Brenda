package DiamondExercises;

import java.util.Scanner;

public class IsoscelesTriangle extends Diamond{

    @Override
    public void draw() {
        int number = getNumber();

        int count = 1;
        for (int i = 0; i < number; ++i) {
            for (int j = 1; j < number-i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
            count += 2;
        }
    }
}
