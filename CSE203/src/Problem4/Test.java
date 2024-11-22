package Problem4;

public class Test {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        CardPlayer player = new CardPlayer();
        for(int i = 0; i < 5; i++) {
            Card deal = deck.deal();
            player.getCard(deal);
        }
        player.showCard();
    }
}
