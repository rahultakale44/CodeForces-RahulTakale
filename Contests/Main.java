import java.io.*;

public class Main {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer = 0;
        private int length = 0;

        private int read() throws IOException {
            if (pointer >= length) {
                length = in.read(buffer);
                pointer = 0;

                if (length <= 0) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int number = 0;

            while (c > ' ') {
                number = number * 10 + (c - '0');
                c = read();
            }

            return number * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder output = new StringBuilder();

        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();

            int[] leftStart = new int[n];
            int[] leftEnd = new int[n];
            int[] rightStart = new int[n];
            int[] rightEnd = new int[n];

            for (int i = 0; i < n; i++) {
                leftStart[i] = fs.nextInt();
                leftEnd[i] = fs.nextInt();
                rightStart[i] = fs.nextInt();
                rightEnd[i] = fs.nextInt();
            }

            int answer = 0;

            // Try every possible final subsequence length.
            for (int m = 1; m <= n; m++) {
                int rank = 1;

                for (int i = 0; i < n && rank <= m; i++) {
                    int leftRank = rank;
                    int rightRank = m - rank + 1;

                    boolean leftAllowed =
                            leftRank < leftStart[i] ||
                            leftRank > leftEnd[i];

                    boolean rightAllowed =
                            rightRank < rightStart[i] ||
                            rightRank > rightEnd[i];

                    if (leftAllowed && rightAllowed) {
                        rank++;
                    }
                }

                if (rank == m + 1) {
                    answer = m;
                }
            }

            output.append(answer).append('\n');
        }

        System.out.print(output);
    }
}