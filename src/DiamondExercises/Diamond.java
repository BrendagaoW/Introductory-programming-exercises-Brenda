package DiamondExercises;

import java.util.Scanner;

public abstract class Diamond {

    private int number;

    public void setNumber() {
        System.out.println("Please input a number:");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
    }

    public abstract void draw();

    public int getNumber() {
        return number;
    }

    public static void main(String args[]) {
        Diamond diamond = new RealDiamond();
        diamond.setNumber();
        diamond.draw();
    }
}
