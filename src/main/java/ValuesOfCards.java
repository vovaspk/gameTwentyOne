public enum ValuesOfCards {
    JACK(1),QUEEN(2),KING(3),ACE(5),SEVEN(7),EIGHT(8),NINE(9),TENTH(10);
    private int value;
    ValuesOfCards(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
