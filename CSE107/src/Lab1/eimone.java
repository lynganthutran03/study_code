package Lab1;

import java.util.Scanner;

public class eimone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] cur = { 20, 10, 5, 1 };
        for (int i = 0; i < 4; i++) {
            int quantity = b / cur[i];
            b = b % cur[i];
            if (quantity > 0) {
                System.out.println(cur[i] + " " + quantity);
            }
        }
        sc.close();
    }
}
