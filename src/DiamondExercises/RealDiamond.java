package DiamondExercises;

public class RealDiamond extends Diamond {
    @Override
    public void draw() {
        int number = getNumber();

        int i = 0;

        for (; i < number; i += 2) {
            for (int j = number/2-i/2; j > 0; --j) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        i -= 4;
        for (; i >= 0; i -= 2) {
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
