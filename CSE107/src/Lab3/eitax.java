package Lab3;

import java.util.Scanner;

public class eitax {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int salary = sc.nextInt();
        double tax = 0;
        double[] levels = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
        double[] rates = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};
        for(int i = 0; i < levels.length; i++) {
            if(salary < 0) {
                break;
            }
            else {
                tax = (Math.min(levels[i + 1], salary) - levels[i]*rates[i]);
            }
        }
        System.out.println(tax);
    }
}
