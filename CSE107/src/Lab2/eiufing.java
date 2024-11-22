package Lab2;

import java.io.*;
import java.util.StringTokenizer;

public class eiufing {
    static InputReader ir = new InputReader(System.in);
    public static void main(String[] args) {
        int n = ir.nextInt();
        n %= 18;
        String fingers[] = {"",
                            "Ngon cai cua ban tay trai",
                            "Ngon tro cua ban tay trai",
                            "Ngon giua cua ban tay trai",
                            "Ngon ap ut cua ban tay trai",
                            "Ngon ut cua ban tay trai",
                            "Ngon ut cua ban tay phai",
                            "Ngon ap ut cua ban tay phai",
                            "Ngon giua cua ban tay phai",
                            "Ngon tro cua ban tay phai",
                            "Ngon cai cua ban tay paai"
                        };
        System.out.println(fingers[n > 10 ? 20 - n : n]);
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
