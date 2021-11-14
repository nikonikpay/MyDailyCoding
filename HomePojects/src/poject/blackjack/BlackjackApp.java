package poject.blackjack;

import java.util.Scanner;

public class BlackjackApp {
    public static void main(String[] args) {


        System.out.println("Welcome to Black jack");
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();

        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();

        double playerMoney = 100.00;
        Scanner userInput = new Scanner(System.in);

        while (playerMoney > 0) {

            System.out.println("You have $ " + playerMoney + " euro. how much you wanna bet");
            double playerBet = userInput.nextDouble();
            if (playerBet > playerMoney) {
                System.out.println("Your money is not enough for that bet");
                break;
            }
            boolean endRound = false;

            //Start Dealing
            //Player get 2 cards

            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            //Dealer get 2 card
            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            while (true) {
                System.out.println("Your hand is :");
                System.out.print(playerDeck.toString());
                System.out.println("\nYour hand is valued At " + playerDeck.cardsValue());


                //Display dealers hands
                System.out.println("The Dealer hand is " + dealerDeck.getCard(0).toString() + " and [Hidden]");

                //what does the player want to do
                System.out.println("what would you like? (1)Hit or (2)Stop");
                int response = userInput.nextInt();

                //They hit
                if (response == 1) {
                    playerDeck.draw(playingDeck);
                    System.out.println("You draw " + playerDeck.getCard(playerDeck.deckSize() - 1).toString());
                    //Bust is >21
                    if (playerDeck.cardsValue() > 21) {
                        System.out.println("Bust currently valued at " + playerDeck.cardsValue());
                        playerMoney -= playerBet;
                        endRound = true;
                        break;
                    }
                }
                if (response == 2) {
                    break;
                }
            }

            //Dealer  hand
            System.out.println("Dealer cards are "+dealerDeck.toString());

            // See if dealer has more point than player
            if ((dealerDeck.cardsValue()>playerDeck.cardsValue())&& endRound==false){
                System.out.println("Dealer beats you");
                playerMoney -= playerBet;
                endRound =true;

            }

            //Dealer draws at 16 stand at 17
            while ((dealerDeck.cardsValue()<17)&& endRound == false){
                dealerDeck.draw(playingDeck);
                System.out.println("Dealer draws "+ dealerDeck.getCard(dealerDeck.deckSize()-1).toString());

            }
            // Display total value for dealer
            System.out.println("Dealer hand is valued at "+dealerDeck.cardsValue());

            // Determine if dealer busted
            if ((dealerDeck.cardsValue()>21)&& endRound==false){
                System.out.println("Dealer bust, you Win !!!");
                playerMoney += playerBet;
                endRound = true;
            }
            //Determine if push
            if ((playerDeck.cardsValue() == dealerDeck.cardsValue()) && endRound ==false){
                System.out.println("Push");
                endRound =true;
            }

            if ((playerDeck.cardsValue()> dealerDeck.cardsValue()) && endRound == false){
                System.out.println("You win this hand");
                playerMoney +=playerBet;
                endRound = true;
            }
            else if (endRound == false){
                System.out.println("You lost the hand");
                playerMoney -= playerBet;
                endRound =true;

            }

            playerDeck.moveAllToDeck(playingDeck);
            dealerDeck.moveAllToDeck(playingDeck);
            System.out.println("End of Hand");

        }
        System.out.println("Game over you are out of money");


    }

}
