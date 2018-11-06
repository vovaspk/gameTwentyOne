public class PlayerMe implements Player{
    Hand myHand;

    public PlayerMe(Hand myHand) {
        this.myHand = myHand;
    }

    @Override
    public int getMyCards() {
        myHand.toString();
        return myHand.getHandPoints();
    }


}
