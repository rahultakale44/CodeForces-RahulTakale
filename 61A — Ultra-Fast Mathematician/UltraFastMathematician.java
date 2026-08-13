import java.util.Scanner;

public class UltraFastMathematician {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {

            if (first.charAt(i) == second.charAt(i)) {
                result.append('0');
            } else {
                result.append('1');
            }
        }

        System.out.println(result);

        scanner.close();
    }
}