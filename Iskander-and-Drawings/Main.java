import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int currentLength = 0;
            int maximumLength = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    currentLength++;
                    maximumLength = Math.max(maximumLength, currentLength);
                } else {
                    currentLength = 0;
                }
            }

            int answer = (maximumLength + 1) / 2;
            System.out.println(answer);
        }
    }
}