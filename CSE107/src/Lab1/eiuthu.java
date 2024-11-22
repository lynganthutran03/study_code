package Lab1;

import java.util.Scanner;

public class eiuthu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.next().trim();
        String secondLine = sc.next().trim();
        int length = findShortestCombinedLetter(firstLine, secondLine);
        System.out.println(length);
        sc.close();
    }

    public static int findShortestCombinedLetter(String firstLine, String secondLine) {
        int length1 = firstLine.length();
        int length2 = secondLine.length();
        int combinedLength = length1 + length2;
        for (int overLap = Math.min(length1, length2); overLap >= 0; overLap--) {
            if (firstLine.substring(length1 - overLap).equals(secondLine.substring(0, overLap))) {
                combinedLength = length1 + length2 - overLap;
                break;
            }
        }
        return combinedLength;
    }
}
