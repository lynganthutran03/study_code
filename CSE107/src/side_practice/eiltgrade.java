package side_practice;

import java.util.Scanner;

public class eiltgrade {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int p = sc.nextInt();
        int[] scores = {49, 51, 52, 54, 59, 64, 69, 74, 79, 84, 89, 100};
        String[] letter = {"F", "D-", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
        for(int i = 0; i < scores.length; i++) {
            if(p <= scores[i]) {
                System.out.println(letter[i]);
                break;
            }
        }
    }
}
