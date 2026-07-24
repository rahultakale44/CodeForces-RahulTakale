import java.util.Scanner;

public class Elephant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int minimumSteps = (x + 4) / 5;

        System.out.println(minimumSteps);

        scanner.close();
    }
}