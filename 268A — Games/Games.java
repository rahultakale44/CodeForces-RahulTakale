import java.util.Scanner;

public class Games {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] home = new int[n];
        int[] away = new int[n];

        for (int i = 0; i < n; i++) {
            home[i] = scanner.nextInt();
            away[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (home[i] == away[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);

        scanner.close();
    }
}