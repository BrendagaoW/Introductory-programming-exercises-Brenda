package DiamondExercises;

import java.util.Scanner;

public class IsoscelesTriangle extends Diamond{

    @Override
    public void draw() {
        int number = getNumber();

        for (int i = 0; i < number; i += 2) {
            for (int j = number/2-i/2; j > 0; --j) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
