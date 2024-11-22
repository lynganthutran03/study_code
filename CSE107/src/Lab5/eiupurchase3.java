package Lab5;

import java.io.*;
import java.util.StringTokenizer;

public class eiupurchase3 {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long p = ir.nextLong();
        long m = ir.nextLong();
        int n = ir.nextInt();
        double r = ir.nextDouble();
        double x = p - m;
        double monthlyPay = (x * (Math.pow(r + 1, n))) / ((Math.pow(r + 1, n) - 1) / r);
        System.out.println((long) monthlyPay);
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
