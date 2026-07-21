import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        first = first.toLowerCase();
        second = second.toLowerCase();

        int result = first.compareTo(second);

        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}