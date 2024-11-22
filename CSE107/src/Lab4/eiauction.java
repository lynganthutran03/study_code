package Lab4;

import java.io.*;
import java.util.StringTokenizer;

public class eiauction {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        int n = ir.nextInt();
        int[] roll = new int[n];
        int[] count = new int[7];
        int[] index = new int[7];
        for(int i = 0; i < n; i++) {
            roll[i] = ir.nextInt();
            count[roll[i]]++;
            index[roll[i]] = i + 1;
        }
        int max = 0;
        for(int j = 1; j < count.length; j++) {
            if(count[j] == 1) {
                max = index[j];
            }
        }
        if(max == 0) {
            System.out.println("none");
        }
        else {
            System.out.println(max);
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
