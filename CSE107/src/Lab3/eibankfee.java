package Lab3;

import java.util.Scanner;

public class eibankfee {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c;
        if(a < 500) {
            c = 12.00 + (b * 0.20);
        }
        else if(a < 2000) {
            c = 7.5 + (b * 0.20);
        }
        else if(a < 5000) {
            c = 5.00 + (b * 0.10);
        }
        else {
            c = 0;
        }
        System.out.println(c);
    }
}
