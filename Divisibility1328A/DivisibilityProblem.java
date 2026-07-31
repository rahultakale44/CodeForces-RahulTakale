import java.util.Scanner;

public class DivisibilityProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long answer = (b - (a % b)) % b;

            System.out.println(answer);
        }

        scanner.close();
    }
}