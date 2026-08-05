import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.next();

        Set<Character> distinctCharacters = new HashSet<>();

        for (int i = 0; i < username.length(); i++) {
            distinctCharacters.add(username.charAt(i));
        }

        int distinctCount = distinctCharacters.size();

        if (distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        scanner.close();
    }
}