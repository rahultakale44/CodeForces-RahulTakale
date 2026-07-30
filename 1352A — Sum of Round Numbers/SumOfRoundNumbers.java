import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            int n = scanner.nextInt();

            ArrayList<Integer> roundNumbers = new ArrayList<>();

            int placeValue = 1;

            while (n > 0) {

                int lastDigit = n % 10;

                if (lastDigit != 0) {
                    roundNumbers.add(lastDigit * placeValue);
                }

                n = n / 10;
                placeValue = placeValue * 10;
            }

            System.out.println(roundNumbers.size());

            for (int number : roundNumbers) {
                System.out.print(number + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}