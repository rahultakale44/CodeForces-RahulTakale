import java.util.Scanner;

public class VasyaTheHipster {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int differentColorDays = Math.min(a, b);
        int sameColorDays = Math.abs(a - b) / 2;

        System.out.println(differentColorDays + " " + sameColorDays);

        scanner.close();
    }
}