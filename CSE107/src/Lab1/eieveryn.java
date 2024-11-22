package Lab1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class eieveryn {
    static InputReader ir = new InputReader(System.in);

    public static void main(String[] args) {
        int t = ir.nextInt();
        for (int i = 0; i < t; i++) {
            int m = ir.nextInt();
            int n = ir.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = ir.nextInt();
            }
            Arrays.sort(arr);
            if (m < n) {
                System.out.println("No");
                continue;
            }
            if (arr[0] > 1) {
                System.out.println("No");
                continue;
            }
            boolean containAll = true;
            boolean checkN = false;
            for (int k = 0; k < arr.length; k++) {
                if (k > 0 && arr[k] > arr[k - 1] + 1) {
                    containAll = false;
                    break;
                }
                if (arr[k] == n) {
                    checkN = true;
                    break;
                }
            }
            if (containAll == true && checkN == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
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
