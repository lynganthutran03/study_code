package Lab5;

import java.io.*;
import java.util.StringTokenizer;

public class eibankloan2 {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long x = ir.nextLong();
        long y = ir.nextLong();
        double r = ir.nextDouble();
        double monthRate = r / (12 * 100);
        double balance = x;
        int months = 0;
        while(balance > 0) {
            months++;
            double interest = balance * monthRate;
            double principal = y - interest;
            if(principal <= 0) {
                return;
            }
            balance -= principal;
            if(balance < 0) {
                balance = 0;
            }
        }
        System.out.println(months);
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
