package Lab5;

import java.io.*;
import java.util.StringTokenizer;

public class eiubhouse {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long n = ir.nextLong();
        long m = ir.nextLong();
        int k = ir.nextInt();
        double x = ir.nextDouble() / 100;
        double debt = n - m;
        double remain = debt;
        for(int i = 0; i < k; i++) {
            double principal = debt / k;
            double interest = remain * x;
            double monthlyPay = principal + interest;
            remain -= principal;
            /*monthlyDebt = (debt / k) + ((debt - (i * debt / k)) * x);*/
            System.out.println(i + 1 + " " + Math.round(monthlyPay));
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
