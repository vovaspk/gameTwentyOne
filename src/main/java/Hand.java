import java.util.ArrayList;
import java.util.Random;

public class Hand {
    public ArrayList<Card> handOfCards;

    public Hand() {
        this.handOfCards = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handOfCards=" + handOfCards +
                '}';
    }

    public boolean addCardtoHand(Deck deck) {
        handOfCards.add(deck.getCard());
        //  handOfCards.add(deck.getCard(deck.getDeckOfCards().size()-12));
        deck.getDeckOfCards().remove(deck.getCard());
        System.out.println("Card added to hand");
        return true;


    }

    public ArrayList<Card> getHandOfCards() {
        return handOfCards;
    }

    public int getHandPoints() {
        int points = 0;

        for (Card c : handOfCards) {
            points+= c.getPoints();
        }
        return points;
    }



}

