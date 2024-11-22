package Lab2;

import java.util.Scanner;

public class eiumadis {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long min = arr[0];
        long maxDiff = Long.MIN_VALUE;
        for(int j = 0; j < n; j++) {
            maxDiff = Math.max(maxDiff, arr[j] - min);
            min = Math.min(min, arr[j]);
        }
        System.out.println(maxDiff);
    }
}
