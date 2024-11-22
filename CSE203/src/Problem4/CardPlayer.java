package Problem4;

import java.util.ArrayList;
import java.util.List;

public class CardPlayer {
    private List<Card> hand;

    public CardPlayer() {
        hand = new ArrayList<>();
    }

    public void getCard(Card card) {
        if(card != null) {
            hand.add(card);
        }
    }

    public void showCard() {
        System.out.println("Player's hand has: ");
        for(Card card: hand) {
            System.out.println(card);
        }
    }
}