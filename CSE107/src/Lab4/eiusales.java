package Lab4;

import java.io.*;
import java.util.StringTokenizer;

public class eiusales {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        int n = ir.nextInt();
        int[] level = {20, 50, 200, 500, 2000};
        double[] rate = {0.02, 0.03, 0.04, 0.05, 0.06, 0.07};
        double bonus = 0;
        int previousLevel = 0;
        for(int i = 0; i < level.length; i++) {
            if(n > level[i]) {
                bonus += (level[i] - previousLevel) * rate[i];
                previousLevel = level[i];
            }
            else {
                bonus += (n - previousLevel) * rate[i];
                break;
            }
        }
        if(n > 2000) {
            bonus += (n - previousLevel) * rate[rate.length - 1];
        }
        System.out.println(bonus);
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
