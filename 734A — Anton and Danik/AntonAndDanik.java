import java.util.Scanner;

public class AntonAndDanik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String games = scanner.next();

        int antonWins = 0;
        int danikWins = 0;

        for (int i = 0; i < n; i++) {

            if (games.charAt(i) == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }

        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        scanner.close();
    }
}