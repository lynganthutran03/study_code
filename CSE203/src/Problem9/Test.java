package Problem9;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Enter the number of scores: ");
            int n = sc.nextInt();
            double[] scores = new double[n];
            System.out.println("Enter test score: ");
            for(int i = 0; i < n; i++) {
                System.out.print("Score " + (i + 1) + ": ");
                scores[i] = sc.nextDouble();
            }
            TestScores score = new TestScores(scores);
            System.out.printf("Average test score: %.2f%n", score.getAverage());
        }
        catch(InvalidTestScore e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
