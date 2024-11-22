package Lab4;

import java.io.*;
import java.util.StringTokenizer;

public class eimemcard {
    static InputReader ir = new InputReader(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = ir.nextInt();
        long[] value = {1_000_000, 20_000_000, 50_000_000, 200_000_000};
        double[] rate = {0.02, 0.03, 0.05, 0.07};
        long total = 0;
        long[] prices = new long[n];
        for(int i = 0; i < n; i++) {
            prices[i] = ir.nextLong();
            double discount = 0;
            for(int j = value.length - 1; j >= 0; j--) {
                if(total >= value[j]) {
                    discount = rate[j];
                    break;
                }
            }
            total += prices[i];
            double disAmount = discount * prices[i];
            sb.append(disAmount).append(" ");
        }
        System.out.println(sb.toString().trim());
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
