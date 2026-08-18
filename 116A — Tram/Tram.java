import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int currentPassengers = 0;
        int maximumPassengers = 0;

        for (int i = 0; i < n; i++) {

            int exit = scanner.nextInt();
            int enter = scanner.nextInt();

            currentPassengers = currentPassengers - exit + enter;

            if (currentPassengers > maximumPassengers) {
                maximumPassengers = currentPassengers;
            }
        }

        System.out.println(maximumPassengers);

        scanner.close();
    }
}