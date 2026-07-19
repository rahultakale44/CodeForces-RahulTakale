import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        
        int qualifyingScore = scores[k - 1];

        int qualifiedParticipants = 0;

        for (int score : scores) {
            if (score >= qualifyingScore && score > 0) {
                qualifiedParticipants++;
            }
        }

        System.out.println(qualifiedParticipants);

        scanner.close();
    }
}