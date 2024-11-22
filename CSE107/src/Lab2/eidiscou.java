package Lab2;

import java.io.*;
import java.util.StringTokenizer;

public class eidiscou {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long n = ir.nextLong();
        long discount = 0;
        long[] arr = {2_000_000, 10_000_000, 50_000_000, 100_000_000,
                    200_000_000, 500_000_000};
        double[] rates = {0.03, 0.05, 0.07, 0.1, 0.12, 0.15};
    }

    static class InputReader {
        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
