package CardGameChallenge;

import CollectionsMethods.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
🃏 What is War?
A two-player game where:
    Each player is dealt half the deck (26 cards each).
    In each round, both players flip their top card.
    The player with the higher card wins the round and takes both cards to the bottom of their deck.
    If the cards are equal → it's WAR! (tie-breaker round).
    Game ends when one player has all the cards, or you stop after a number of rounds.
 */
public class Main {

    public static void main(String[] args) {

        // create deck
        List<CollectionsMethods.Card> deck = CollectionsMethods.Card.getStandardDeck(); // gives 52 cards in 4 suits
        Card.printDeck(deck);

        // shuffle the deck cards
        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled Deck", 4);

        // split deck into two and give it to players
        List<Card> p1 = new ArrayList<>(deck.subList(0, 26));  // first 26 cards for player 1
        List<Card> p2 = new ArrayList<>(deck.subList(26, 52)); // next 26 cards for player 2

        Card.printDeck(p1, "Player 1's Deck: ", 2);
        Card.printDeck(p2, "Player 2's Deck: ", 2);

        List<Card> warPile = new ArrayList<>(0); // imaginary separate deck to deal and add cards lost and use this card pile to add it to winner's deck
        int round = 0;
        // if any of the player has empty deck stop the game
        while (!p1.isEmpty() && !p2.isEmpty()) {
            // game begins here
            round++;
            // top cards of each player
            Card p1Card = p1.remove(0); // take + remove
            Card p2Card = p2.remove(0);
            warPile.add(p1Card);
            warPile.add(p2Card);

            System.out.println("Player 1: " + p1Card);
            System.out.println("Player 2: " + p2Card);

            // Winner gets card
            if (p1Card.rank() > p2Card.rank()) {
                System.out.println("Player 1 won this round!");
                p1.addAll(warPile); // adds card to the end of the deck, take away cards from the looser
                warPile.clear();
            } else if (p1Card.rank() < p2Card.rank()) {
                System.out.println("Player 2 won this round!");
                p2.addAll(warPile); // take away cards from the looser
                warPile.clear();
            } else {
                System.out.println("It's a WAR!!");
                if (p1.size() < 4 || p2.size() < 4) {
                    System.out.println("One player doesn't have enough cards to continue WAR!");
                    break; // or declare winner
                }

                // Draw 4 cards from each
                List<Card> p1War = new ArrayList<>(p1.subList(0, 4));
                List<Card> p2War = new ArrayList<>(p2.subList(0, 4));
                warPile.addAll(p1War);
                warPile.addAll(p2War);
                p1.subList(0, 4).clear();
                p2.subList(0, 4).clear();

                // Compare 4th card
                if (p1War.get(3).rank() > p2War.get(3).rank()) {
                    System.out.println("Player 1 wins the WAR!");
                    p1.addAll(warPile);
                } else if (p1War.get(3).rank() < p2War.get(3).rank()) {
                    System.out.println("Player 2 wins the WAR!");
                    p2.addAll(warPile);
                } else {
                    System.out.println("WAR again! But we're not supporting double WAR yet.");
                    // You can repeat logic recursively if you want to support it.
                }
                warPile.clear();
            }


        }
        if (p1.isEmpty() || p1.size() < 4) {
            Card.printDeck(p2, "🏁 Game Over! Player 2 wins the game in " + round + " rounds", 5);
        } else {
            Card.printDeck(p1, "🏁 Game Over! Player 1 wins the game in " + round + " rounds", 5);
        }


    }
}
