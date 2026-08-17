import java.util.Scanner;

public class CipherShifer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            int n = scanner.nextInt();
            String encoded = scanner.next();

            StringBuilder decoded = new StringBuilder();

            int i = 0;

            while (i < n) {

                char current = encoded.charAt(i);
                decoded.append(current);

                i++;

                while (i < n && encoded.charAt(i) != current) {
                    i++;
                }

                i++;
            }

            System.out.println(decoded);
        }

        scanner.close();
    }
}