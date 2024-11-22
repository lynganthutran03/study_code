package Lab2;

import java.io.*;
import java.util.StringTokenizer;

public class eiucubes2 {
    static InputReader ir = new InputReader(System.in);

    public static void main(String[] args) {
        int k = ir.nextInt();
        long[] bricks = new long[k];
        for (int i = 0; i < k; i++) {
            bricks[i] = ir.nextLong();
            long n = (long) Math.cbrt(bricks[i] * 6);
            long a = (n * (n + 1) * (n + 2)) / 6;
            if (a > bricks[i]) {
                n--;
            }
            System.out.print(n + " ");
        }
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
