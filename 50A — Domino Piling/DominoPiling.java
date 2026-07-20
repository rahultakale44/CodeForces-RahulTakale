import java.util.Scanner;

public class DominoPiling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int maximumDominoes = (m * n) / 2;

        System.out.println(maximumDominoes);

        scanner.close();
    }
}