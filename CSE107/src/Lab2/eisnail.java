package Lab2;

import java.io.*;
import java.util.StringTokenizer;

public class eisnail {
	static InputReader ir = new InputReader(System.in);

	public static void main(String[] args) {
		int a = ir.nextInt();
		int b = ir.nextInt();
		int v = ir.nextInt();
		int c = (v - b - 1)/(a - b) + 1;
		System.out.println(c);
		/*int count = 0;
		int curHeight = 0;
		while(curHeight < v) {
			count++;
			curHeight += a;
			if(curHeight >= v) {
				break;
			}
			curHeight -= b;
		}
		System.out.println(count);*/
		
		/*
		float c = Math.ceil((float)((v - b - 1)/(a - b) + 1));
		System.out.println(c);
		*/
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
