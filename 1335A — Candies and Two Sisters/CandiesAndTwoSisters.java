import java.util.Scanner;

public class CandiesAndTwoSisters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            int n = scanner.nextInt();

            int answer = (n - 1) / 2;

            System.out.println(answer);
        }

        scanner.close();
    }
}