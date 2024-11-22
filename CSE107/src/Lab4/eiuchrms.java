package Lab4;

import java.io.*;
import java.util.StringTokenizer;

public class eiuchrms {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        int n = ir.nextInt();
        long[] level = {2_000_000, 5_000_000, 10_000_000, 20_000_000, 50_000_000, 100_000_000, 200_000_000};
        double[] rate = {0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1};
        double total = 0;
        for(int i = 0; i < n; i++) {
            long bill = ir.nextInt();
            double setRate = 0;
            for(int j = 0; j < level.length; j++) {
                if(bill <= level[j]) {
                    setRate = rate[j];
                    break;
                }
            }
            total += bill * (1 - setRate);
        }
        System.out.println(Math.round(total));
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
