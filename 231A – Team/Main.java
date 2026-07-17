import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int solvedProblems = 0;

        for (int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();

            int totalSure = petya + vasya + tonya;

            if (totalSure >= 2) {
                solvedProblems++;
            }
        }

        System.out.println(solvedProblems);

        sc.close();
    }
}