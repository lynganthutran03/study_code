package Lab4;

import java.io.*;
import java.util.StringTokenizer;

public class eiudiscount3 {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long n = ir.nextLong();
        int a = ir.nextInt();
        int b = ir.nextInt();
        int c = ir.nextInt();
        long discount = 0;
        long[] amount = {5_000_000, 20_000_000, 100_000_000, 300_000_000, 600_000_000, 900_000_000};
        double[] rate = {0.03, 0.05, 0.07, 0.1, 0.12, 0.15};
        for(int i = amount.length - 1; i >= 0; i--) {
            if(n > amount[i]) {
                discount += Math.round((n - amount[i]) * (1 - rate[i]));
                n = amount[i];
            }
        }
        discount += n;
        if(a == 1) {
            discount = (long) (discount * (1 - 0.02));
        }
        if(b == 1) {
            discount = (long) (discount * (1 - 0.02));
        }
        if(c == 1) {
            discount = (long) (discount * (1 - 0.02));
        }
        System.out.println(discount);
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
