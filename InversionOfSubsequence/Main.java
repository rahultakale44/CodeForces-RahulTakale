import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder output = new StringBuilder();

        int testCases = fs.nextInt();

        while (testCases-- > 0) {
            int n = fs.nextInt();

            int[] a = new int[n];
            int onesInA = 0;

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();

                if (a[i] == 1) {
                    onesInA++;
                }
            }

            int mismatches = 0;
            int oneToZero = 0;
            int sameZero = 0;

            for (int i = 0; i < n; i++) {
                int b = fs.nextInt();

                if (a[i] != b) {
                    mismatches++;

                    if (a[i] == 1 && b == 0) {
                        oneToZero++;
                    }
                } else if (a[i] == 0) {
                    sameZero++;
                }
            }

            int answer;

            if (mismatches == 0) {
                answer = 0;
            } else if (oneToZero % 2 == 1) {
                answer = 1;
            } else if (oneToZero > 0) {
                answer = 2;
            } else if (onesInA > 0 && sameZero > 0) {
                answer = 2;
            } else {
                answer = -1;
            }

            output.append(answer).append('\n');
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

                if (length <= 0) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        int nextInt() throws IOException {
            int character;

            do {
                character = read();
            } while (character <= ' ' && character != -1);

            int number = 0;

            while (character > ' ') {
                number = number * 10 + character - '0';
                character = read();
            }

            return number;
        }
    }
}