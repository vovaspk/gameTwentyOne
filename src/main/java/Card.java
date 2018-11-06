public class Card {
    private Suits suit;
    private ValuesOfCards vof;
    private  int points;

    public Card( Suits suit, ValuesOfCards vof, int points) {
        this.suit = suit;
        this.vof = vof;
        this.points = points;
    }

    public  int getPoints() {
        return points;
    }


    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", vof=" + vof +
                ", points=" + points +
                '}';
    }
}
