import org.junit.Test;

import java.util.Scanner;

public class Game {
    PlayerMe plOne;
    Computer plTwo;
    boolean quit = false;
    Scanner scan;

    public Game(PlayerMe plOne, Computer plTwo) {
        this.plOne = plOne;
        this.plTwo = plTwo;

    }

    public static void main(String[] args) {
        PlayerMe plOne = new PlayerMe(new Hand());
        Computer plTwo = new Computer(new Hand());
        Game game = new Game(plOne,plTwo);
        game.startGame();
    }

    public void startGame(){
        scan = new Scanner(System.in);
        int answer = 0;
        Deck deck = new Deck();
        deck.initializeDeck();
        deck.shuffleDeckOfCards();
        deck.getDeckOfCards().toString();
        plOne.myHand.addCardtoHand(deck);
        plTwo.compHand.addCardtoHand(deck);
        printMenu();
        while(!quit){

            System.out.println("you cards: " + plOne.myHand.handOfCards.toString() + plOne.getMyCards() + " ,Your points: " + plOne.myHand.getHandPoints()/*plOne.myHand.getPoints()*/);
            System.out.println("Computer has " + plTwo.compHand.getHandPoints() + " points");
            System.out.println("Do you want a one more card?");
            answer = scan.nextInt();
            switch (answer){
                case 1:
                    plOne.myHand.addCardtoHand(deck);
                    plTwo.compHand.addCardtoHand(deck);
                    if(checkIfWin()){
                        quit=true;
                    }
                    break;
                case 2:
                    if(plTwo.compHand.getHandPoints()<16){
                        plTwo.compHand.addCardtoHand(deck);
                    }
                    checkIfWin();
                    if(checkIfWin()){
                        quit=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                case 4:
                    plOne.myHand.toString();
                    break;
                case 5:
                    quit=true;
                    break;
                default:
                    break;

            }


        }
    }

    public boolean checkIfWin(){
        if(plOne.myHand.getHandPoints()>21){
            System.out.println("Sorry. You lose, you have too many points: " + plOne.myHand.getHandPoints());
            System.out.println("Computer wins");
            return true;
        }
        if(plTwo.compHand.getHandPoints()>21){
            System.out.println("Computer lose, it has too many points: " + plTwo.compHand.getHandPoints());
            System.out.println("You win");
            return true;
        }
        if(plOne.myHand.getHandPoints()==21){
            System.out.println("Congratulations, You win with: " + plOne.myHand.getHandPoints() + " points");
            return true;
        }else if(plTwo.compHand.getHandPoints()==21){
            System.out.println("Sorry, Computer wins with: " + plTwo.compHand.getHandPoints() + " points");
            return true;
        }

        return false;
    }
    private void printMenu(){
        System.out.println("Enter 1 to pick a card");
        System.out.println("Enter 2 to stay on your cards");
        System.out.println("Enter 3 to print menu of actions");
        System.out.println("Enter 4 to show your cards");
        System.out.println("Enter 5 to quit the game");
    }

}
