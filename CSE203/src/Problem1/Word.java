package Problem1;

import java.util.Set;
import java.util.TreeSet;

public class Word {
    private Set<Character> word;

    public Word() {
        word = new TreeSet<>();
    }

    public void addCharacter(char a) {
        word.add(a);
    }

    public void sortingChar(String arr) {
        for(char a: arr.toCharArray()) {
            addCharacter(a);
        }
    }

    public void displayChar() {
        for(Character a: word) {
            System.out.print(a + " ");
        }
    }
}
