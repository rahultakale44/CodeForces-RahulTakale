import java.util.Scanner;

public class ThresholdMovement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            int n = scanner.nextInt();

            long minOdd = Long.MAX_VALUE;
            long maxEven = Long.MIN_VALUE;

            for (int i = 1; i <= n; i++) {

                long weight = scanner.nextLong();

                if (i % 2 == 1) {
                    minOdd = Math.min(minOdd, weight);
                } else {
                    maxEven = Math.max(maxEven, weight);
                }
            }

            if (n % 2 == 1) {
                System.out.println("NO");
            } else if (maxEven + 1 < minOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}