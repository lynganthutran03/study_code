package Lab2;

import java.io.*;
import java.util.StringTokenizer;

public class eiubirth {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        int t = ir.nextInt();
        for(int i = 0; i < t; i++) {
            long b= ir.nextLong();
            long r= ir.nextLong();
            long x= ir.nextLong();
            long y= ir.nextLong();
            long z= ir.nextLong();

            long cost = b * x + r * y;
            long costChangeRed = (b + r) * x + r * z;
            long costChangeBlue = (b + r) * y + b * z;
            
            long minCost = Math.min(cost, Math.min(costChangeRed, costChangeBlue));
            System.out.println(minCost);
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
