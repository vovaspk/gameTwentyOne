public class Computer implements Player {

    Hand compHand;

    public Computer(Hand compHand) {
        this.compHand = compHand;
    }

    @Override
    public int getMyCards() {
        return compHand.getHandPoints();
    }


}
