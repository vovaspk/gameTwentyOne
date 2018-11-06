import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Deck {
    private ArrayList<Card> deckOfCards;
    private Hand PHand;
    private Hand CHand;


    public Deck() {
        this.deckOfCards = new ArrayList<>();
        // initializeDeck();

    }
    //сделать через getValue method in enum
    public void initializeDeck() {
        deckOfCards = new ArrayList<>(32);
//        Card c1 = new Card(Suits.HEART,ValuesOfCards.SEVEN,7);
//        Card c2 = new Card(Suits.HEART,ValuesOfCards.EIGHT,8);
//        Card c3 = new Card(Suits.HEART,ValuesOfCards.NINE,9);
//        Card c4 = new Card(Suits.HEART,ValuesOfCards.TENTH,10);
//        Card c5 = new Card(Suits.HEART,ValuesOfCards.JACK,1);
//        Card c6 = new Card(Suits.HEART,ValuesOfCards.QUEEN,2);
//        Card c7 = new Card(Suits.HEART,ValuesOfCards.KING,3);
//        Card c8 = new Card(Suits.HEART,ValuesOfCards.ACE,5);
//        Card c9 = new Card(Suits.DIAMOND,ValuesOfCards.SEVEN,7);
//        Card c10 = new Card(Suits.DIAMOND,ValuesOfCards.EIGHT,8);
//        Card c11 = new Card(Suits.DIAMOND,ValuesOfCards.NINE,9);
//        Card c12 = new Card(Suits.DIAMOND,ValuesOfCards.TENTH,10);
//        Card c13 = new Card(Suits.DIAMOND,ValuesOfCards.JACK,1);
//        Card c14 = new Card(Suits.DIAMOND,ValuesOfCards.QUEEN,2);
//        Card c15 = new Card(Suits.DIAMOND,ValuesOfCards.KING,3);
//        Card c16 = new Card(Suits.DIAMOND,ValuesOfCards.ACE,5);
//        Card c17 = new Card(Suits.CLUB,ValuesOfCards.SEVEN,7);
//        Card c18 = new Card(Suits.CLUB,ValuesOfCards.EIGHT,8);
//        Card c19 = new Card(Suits.CLUB,ValuesOfCards.NINE,9);
//        Card c20 = new Card(Suits.CLUB,ValuesOfCards.TENTH,10);
//        Card c21 = new Card(Suits.CLUB,ValuesOfCards.JACK,1);
//        Card c22 = new Card(Suits.CLUB,ValuesOfCards.QUEEN,2);
//        Card c23 = new Card(Suits.CLUB,ValuesOfCards.KING,3);
//        Card c24= new Card(Suits.CLUB,ValuesOfCards.ACE,5);
//        Card c25 = new Card(Suits.SPADE,ValuesOfCards.SEVEN,7);
//        Card c26 = new Card(Suits.SPADE,ValuesOfCards.EIGHT,8);
//        Card c27 = new Card(Suits.SPADE,ValuesOfCards.NINE,9);
//        Card c28= new Card(Suits.SPADE,ValuesOfCards.TENTH,10);
//        Card c29= new Card(Suits.SPADE,ValuesOfCards.JACK,1);
//        Card c30= new Card(Suits.SPADE,ValuesOfCards.QUEEN,2);
//        Card c31= new Card(Suits.SPADE,ValuesOfCards.KING,3);
//        Card c32= new Card(Suits.SPADE,ValuesOfCards.ACE,5);

//        deckOfCards.add(c1);
//        deckOfCards.add(c2);
//        deckOfCards.add(c3);
//        deckOfCards.add(c4);
//        deckOfCards.add(c5);
//        deckOfCards.add(c6);
//        deckOfCards.add(c7);
//        deckOfCards.add(c8);
//        deckOfCards.add(c9);
//        deckOfCards.add(c10);
//        deckOfCards.add(c11);
//        deckOfCards.add(c12);
//        deckOfCards.add(c13);
//        deckOfCards.add(c14);
//        deckOfCards.add(c15);
//        deckOfCards.add(c16);
//        deckOfCards.add(c17);
//        deckOfCards.add(c18);
//        deckOfCards.add(c19);
//        deckOfCards.add(c20);
//        deckOfCards.add(c21);
//        deckOfCards.add(c22);
//        deckOfCards.add(c23);
//        deckOfCards.add(c24);
//        deckOfCards.add(c25);
//        deckOfCards.add(c26);
//        deckOfCards.add(c27);
//        deckOfCards.add(c28);
//        deckOfCards.add(c29);
//        deckOfCards.add(c30);
//        deckOfCards.add(c31);
//        deckOfCards.add(c32);
//        System.out.println(deckOfCards.toString());
        for (ValuesOfCards v : ValuesOfCards.values()){
            for (Suits s : Suits.values()){
                deckOfCards.add(new Card(s,v, v.getValue()));
            }
        }
        System.out.println(deckOfCards.toString()); // TEMPORARY SOUT

    }


    public Card getCard(){
        return deckOfCards.get(0);
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public ArrayList<Card> shuffleDeckOfCards() {
        Collections.shuffle(deckOfCards);
        System.out.println("after shuffle" + deckOfCards.toString()); // TEMPORARY SOUT
        return deckOfCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckOfCards=" + deckOfCards +
                '}';
    }
}

//    public void initializeDeck() {
//        deckOfCards = new ArrayList<>(32);
//        //  int i = 0;
//        for (ValuesOfCards v : ValuesOfCards.values()){
////            i++;
////            if(i == 5){
////                i += 2;
////            }
//            //   System.out.println("here is i " + i);
//            for (Suits s : Suits.values()){
//                // deckOfCards.add(new Card(s, v, i));
//                deckOfCards.add(new Card(s,v, v.getValue()));
//            }
//        }
//        System.out.println(deckOfCards.toString()); // TEMPORARY SOUT
//
//    }



