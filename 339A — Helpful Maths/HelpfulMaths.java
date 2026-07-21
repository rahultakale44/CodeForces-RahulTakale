import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String expression = scanner.next();

        String[] numbers = expression.split("\\+");

        Arrays.sort(numbers);

        System.out.println(String.join("+", numbers));

        scanner.close();
    }
}