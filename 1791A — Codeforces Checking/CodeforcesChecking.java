import java.util.Scanner;

public class CodeforcesChecking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        String codeforces = "codeforces";

        while (testCases-- > 0) {

            char ch = scanner.next().charAt(0);

            if (codeforces.indexOf(ch) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}