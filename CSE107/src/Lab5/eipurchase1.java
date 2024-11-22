package Lab5;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class eipurchase1 {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        long v = ir.nextLong();
        int t = ir.nextInt();
        long n = ir.nextLong();
        long m = ir.nextLong();
        double rMin = 0.0;
        double rMax = 1.0;
        double mid = 0;
        double tolerance = 1e-9;
        double x = v - n;
        while(rMax - rMin > tolerance) {
            mid = (rMin + rMax) / 2;
            double debt = x * Math.pow(mid + 1, t) - m * ((Math.pow(mid + 1, t) - 1) / ((mid + 1) - 1));
            if(debt < 0) {
                rMin = mid;
            }
            else {
                rMax = mid;
            }
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(rMin));
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
