package Lab3;

import java.util.Scanner;

public class eibankfee2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        double totalFee = 0;
        double all = 0;
        for(int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            all += b;
            double monthly = 0;
            double check = 0;
            if(a < 500) {
                monthly = 12.00;
                check = 0.20;
            }
            else if(a < 2000) {
                monthly = 7.5;
                check = 0.20;
            }
            else if(a < 5000) {
                monthly = 5.00;
                check = 0.10;
            }
            else {
                monthly = 0;
                check = 0;
            }
            double c = monthly + (b * check);
            totalFee += c;
        }
        double avg = (double)Math.round((totalFee / all)*1000)/1000;
        System.out.println(avg);
    }
}
