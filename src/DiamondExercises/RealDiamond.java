package DiamondExercises;

public class RealDiamond extends Diamond {
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

        count -= 4;
        for (int i = number; i > 0; --i) {
            for (int j = 0; j <= number-i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
            count -= 2;
        }
    }
}
