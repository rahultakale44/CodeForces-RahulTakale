import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();

        int luckyDigitCount = 0;

        for (int i = 0; i < number.length(); i++) {

            char digit = number.charAt(i);

            if (digit == '4' || digit == '7') {
                luckyDigitCount++;
            }
        }

        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}