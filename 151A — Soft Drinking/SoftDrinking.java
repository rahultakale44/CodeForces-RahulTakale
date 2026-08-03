import java.util.Scanner;

public class SoftDrinking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int drinkToasts = (k * l) / nl;
        int limeToasts = c * d;
        int saltToasts = p / np;

        int totalToasts = Math.min(
                drinkToasts,
                Math.min(limeToasts, saltToasts)
        );

        int toastsPerFriend = totalToasts / n;

        System.out.println(toastsPerFriend);

        scanner.close();
    }
}