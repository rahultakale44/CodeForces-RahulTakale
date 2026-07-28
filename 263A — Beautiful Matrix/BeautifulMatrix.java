import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowOfOne = 0;
        int columnOfOne = 0;

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {

                int value = scanner.nextInt();

                if (value == 1) {
                    rowOfOne = row;
                    columnOfOne = column;
                }
            }
        }

        int moves = Math.abs(rowOfOne - 2)
                  + Math.abs(columnOfOne - 2);

        System.out.println(moves);

        scanner.close();
    }
}