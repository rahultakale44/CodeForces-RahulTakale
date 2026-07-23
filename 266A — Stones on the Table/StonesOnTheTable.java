import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String stones = scanner.next();

        int removedStones = 0;

        for (int i = 1; i < n; i++) {
            if (stones.charAt(i) == stones.charAt(i - 1)) {
                removedStones++;
            }
        }

        System.out.println(removedStones);

        scanner.close();
    }
}