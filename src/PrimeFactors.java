import java.util.Scanner;

public class PrimeFactors {
    public static void main(String args[]) {
        System.out.println("Please input a number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 2; i < Math.sqrt(number); ++i) {
            if (number%i == 0) {
                stringBuilder.append(i);
                stringBuilder.append(",");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append(".");
        System.out.println(stringBuilder.toString());
    }
}
