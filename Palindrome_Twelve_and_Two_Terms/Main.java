import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder output = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            long n = fs.nextLong();

            if (n == 10) {
                output.append("-1\n");
                continue;
            }

            long remainder = n % 12;
            long a = (remainder == 10) ? 22 : remainder;
            long b = n - a;

            output.append(a).append(" ").append(b).append("\n");
        }

        System.out.print(output);
    }

    static class FastScanner {
        private final BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        private StringTokenizer st;

        String next() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws Exception {
            return Integer.parseInt(next());
        }

        long nextLong() throws Exception {
            return Long.parseLong(next());
        }
    }
}