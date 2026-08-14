import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            int n = scanner.nextInt();
            String name = scanner.next();

            if (n != 5) {
                System.out.println("NO");
                continue;
            }

            char[] given = name.toCharArray();
            char[] correct = "Timur".toCharArray();

            Arrays.sort(given);
            Arrays.sort(correct);

            if (Arrays.equals(given, correct)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}