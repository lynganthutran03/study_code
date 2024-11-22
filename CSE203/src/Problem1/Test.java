package Problem1;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Word words = new Word();
        String input = sc.next();
        words.sortingChar(input);
        words.displayChar();
    }
}
