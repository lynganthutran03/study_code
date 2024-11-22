package Lab4;

import java.io.*;
import java.util.StringTokenizer;

public class eigross2 {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long n = ir.nextLong();
        long[] taxable = {0, 11_000_000, 16_000_000, 21_000_000, 29_000_000, 43_000_000, 63_000_000, 91_000_000, Long.MAX_VALUE / 2};
        double[] rate = {0, 0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35};
        double currentNet = 0, currentGross = 0;
        for(int i = 1; i < taxable.length; i++) {
            double x = currentNet + (taxable[i] - taxable[i - 1]) * (1 - rate[i - 1]);
            if(x < n) {
                currentGross = taxable[i];
                currentNet = x;
            }
            else {
                currentGross += (n - currentNet) / (1 - rate[i - 1]);
                break;
            }
        }
        System.out.println((Math.round(currentGross)*100)/100);
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
