import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void checkIfWinTest() {
        System.out.println("Checking checkIfWin method...");
        PlayerMe plOne = new PlayerMe(new Hand());
        Computer plTwo = new Computer(new Hand());
        Game game1 = new Game(plOne,plTwo);
        Deck deck = new Deck();
        deck.initializeDeck();
        deck.shuffleDeckOfCards();

        plOne.myHand.addCardtoHand(deck);
        plTwo.compHand.addCardtoHand(deck);

        double pl1points = plOne.myHand.getHandPoints();
        double pl2points = plTwo.compHand.getHandPoints();
        pl1points = 21;
        pl2points = 15;


       boolean b = game1.checkIfWin();
        assertFalse(b);
    }
}