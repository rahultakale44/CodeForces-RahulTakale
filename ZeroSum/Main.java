import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder answer = new StringBuilder();

        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            int negativeCount = 0;

            for (int i = 0; i < n; i++) {
                int value = fs.nextInt();

                if (value == -1) {
                    negativeCount++;
                }
            }

            
            if (n % 2 != 0) {
                answer.append("NO\n");
                continue;
            }

            int requiredNegativeCount = n / 2;

           
            if (negativeCount % 2 == requiredNegativeCount % 2) {
                answer.append("YES\n");
            } else {
                answer.append("NO\n");
            }
        }

        System.out.print(answer);
    }

    private static class FastScanner {
        private final InputStream input;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer = 0;
        private int length = 0;

        FastScanner(InputStream input) {
            this.input = input;
        }

        private int read() {
            if (pointer >= length) {
                try {
                    length = input.read(buffer);
                    pointer = 0;
                } catch (IOException e) {
                    return -1;
                }

                if (length <= 0) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        int nextInt() {
            int character;
            int sign = 1;
            int number = 0;

            do {
                character = read();
            } while (character <= ' ' && character != -1);

            if (character == '-') {
                sign = -1;
                character = read();
            }

            while (character > ' ') {
                number = number * 10 + character - '0';
                character = read();
            }

            return number * sign;
        }
    }
}