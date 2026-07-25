import java.util.Scanner;

public class SoldierAndBananas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long k = scanner.nextLong();
        long n = scanner.nextLong();
        long w = scanner.nextLong();

        long totalCost = k * w * (w + 1) / 2;

        long amountToBorrow = Math.max(0, totalCost - n);

        System.out.println(amountToBorrow);

        scanner.close();
    }
}