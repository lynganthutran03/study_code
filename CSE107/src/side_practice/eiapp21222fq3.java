package side_practice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class eiapp21222fq3 {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long n = ir.nextLong();
        int m = ir.nextInt();
        Map<Integer, Double> rate = new HashMap<>();
            rate.put(1, 3.90);
            rate.put(2, 3.92);
            rate.put(3, 3.95);
            rate.put(4, 3.99);
            rate.put(5, 4.04);
            rate.put(6, 5.54);
            rate.put(7, 5.72);
            rate.put(8, 5.92);
            rate.put(9, 6.14);
            rate.put(10, 6.38);
            rate.put(11, 6.64);
            rate.put(12, 6.92);
        double annualRate = rate.getOrDefault(Math.min(m, 12), 0.0);
        double monthlyRate = annualRate / 100 / 12;
        double total = Math.pow(1 + monthlyRate, m) - 1;
        double p = n * monthlyRate / total;
        System.out.printf("%.4f\n", p);
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
