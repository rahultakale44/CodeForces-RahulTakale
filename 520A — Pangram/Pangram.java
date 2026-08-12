import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String text = scanner.next();

        text = text.toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < n; i++) {
            letters.add(text.charAt(i));
        }

        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}