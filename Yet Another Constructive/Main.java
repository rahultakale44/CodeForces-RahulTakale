import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder output = new StringBuilder();

        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            long m = fs.nextLong();

            if (m < k) {
                output.append("NO\n");
                continue;
            }

            output.append("YES\n");

            for (int i = 1; i <= n; i++) {

                if (i % k == 0) {
                    output.append(m - k + 1);
                } else {
                    output.append(1);
                }

                if (i < n) {
                    output.append(" ");
                }
            }

            output.append("\n");
        }

        System.out.print(output);
    }

    private static class FastScanner {

        private final InputStream input;
        private final byte[] buffer = new byte[1 << 16];

        private int pointer = 0;
        private int length = 0;

        FastScanner(InputStream input) {
            this.input = input;
        }

        private int read() throws IOException {
            if (pointer >= length) {
                length = input.read(buffer);
                pointer = 0;

                if (length == -1) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        long nextLong() throws IOException {
            int character;

            do {
                character = read();
            } while (character <= ' ' && character != -1);

            long number = 0;
            int sign = 1;

            if (character == '-') {
                sign = -1;
                character = read();
            }

            while (character > ' ') {
                number = number * 10 + (character - '0');
                character = read();
            }

            return number * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}