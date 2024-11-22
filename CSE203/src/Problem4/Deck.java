package Problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for(String suit: suits) {
            for(String faceValue: faceValues) {
                cards.add(new Card(suit, faceValue));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if(cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
