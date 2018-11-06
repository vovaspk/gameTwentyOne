import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void initializeDeck() {
        System.out.println("Checking initializeDeck method... (case about repeating of cards)");
        Deck deck = new Deck();

        deck.initializeDeck();
        System.out.println();
    }

    @Test
    public void getCard() {
        System.out.println("Checking method getCard ");
        Deck deck = new Deck();
        deck.initializeDeck();
        deck.getCard();
        System.out.println();
    }

    @Test
    public void getDeckOfCards() {
        System.out.println("checking method getDeckOfCards ()");
        Deck deck = new Deck();
        deck.initializeDeck();
        deck.getDeckOfCards();
        assertNotNull(deck);
        System.out.println();
    }

    @Test
    public void shuffleDeckOfCards() {
        System.out.println("Checking method shuffleDeckOfCards ");
        Deck deck = new Deck();
        Deck deck1 = new Deck();
        deck1.initializeDeck();
        deck.initializeDeck();
        deck.shuffleDeckOfCards();
        assertNotEquals(deck,deck1);
        System.out.println();
    }


}