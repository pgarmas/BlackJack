/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author polina.garmas
 */
public class Deck {
    
    private ArrayList<Card> deck = new ArrayList();

    public Deck() {
         deck.add(new Card(Suit.Clubs, Values.Ace));
         deck.add(new Card(Suit.Clubs, Values.Two));
         deck.add(new Card(Suit.Clubs, Values.Three));
         deck.add(new Card(Suit.Clubs, Values.Four));
         deck.add(new Card(Suit.Clubs, Values.Five));
         deck.add(new Card(Suit.Clubs, Values.Six));
         deck.add(new Card(Suit.Clubs, Values.Seven));
         deck.add(new Card(Suit.Clubs, Values.Eight));
         deck.add(new Card(Suit.Clubs, Values.Nine));
         deck.add(new Card(Suit.Clubs, Values.Ten));
         deck.add(new Card(Suit.Clubs, Values.Jack));
         deck.add(new Card(Suit.Clubs, Values.Queen));
         deck.add(new Card(Suit.Clubs, Values.King));
         
         deck.add(new Card(Suit.Spades, Values.Ace));
         deck.add(new Card(Suit.Spades, Values.Two));
         deck.add(new Card(Suit.Spades, Values.Three));
         deck.add(new Card(Suit.Spades, Values.Four));
         deck.add(new Card(Suit.Spades, Values.Five));
         deck.add(new Card(Suit.Spades, Values.Six));
         deck.add(new Card(Suit.Spades, Values.Seven));
         deck.add(new Card(Suit.Spades, Values.Eight));
         deck.add(new Card(Suit.Spades, Values.Nine));
         deck.add(new Card(Suit.Spades, Values.Ten));
         deck.add(new Card(Suit.Spades, Values.Jack));
         deck.add(new Card(Suit.Spades, Values.Queen));
         deck.add(new Card(Suit.Spades, Values.King));
         
         deck.add(new Card(Suit.Hearts, Values.Ace));
         deck.add(new Card(Suit.Hearts, Values.Two));
         deck.add(new Card(Suit.Hearts, Values.Three));
         deck.add(new Card(Suit.Hearts, Values.Four));
         deck.add(new Card(Suit.Hearts, Values.Five));
         deck.add(new Card(Suit.Hearts, Values.Six));
         deck.add(new Card(Suit.Hearts, Values.Seven));
         deck.add(new Card(Suit.Hearts, Values.Eight));
         deck.add(new Card(Suit.Hearts, Values.Nine));
         deck.add(new Card(Suit.Hearts, Values.Ten));
         deck.add(new Card(Suit.Hearts, Values.Jack));
         deck.add(new Card(Suit.Hearts, Values.Queen));
         deck.add(new Card(Suit.Hearts, Values.King));
         
         deck.add(new Card(Suit.Diamonds, Values.Ace));
         deck.add(new Card(Suit.Diamonds, Values.Two));
         deck.add(new Card(Suit.Diamonds, Values.Three));
         deck.add(new Card(Suit.Diamonds, Values.Four));
         deck.add(new Card(Suit.Diamonds, Values.Five));
         deck.add(new Card(Suit.Diamonds, Values.Six));
         deck.add(new Card(Suit.Diamonds, Values.Seven));
         deck.add(new Card(Suit.Diamonds, Values.Eight));
         deck.add(new Card(Suit.Diamonds, Values.Nine));
         deck.add(new Card(Suit.Diamonds, Values.Ten));
         deck.add(new Card(Suit.Diamonds, Values.Jack));
         deck.add(new Card(Suit.Diamonds, Values.Queen));
         deck.add(new Card(Suit.Diamonds, Values.King));
    }
    
    void shuffleBackup()
    {
        ArrayList<Card> shuffledDeck = new ArrayList<>();
        
        Random random = new Random();
        int z=  deck.size();
        System.out.println(z);
        for (int j = 0; j < 10; j++) {
            for (int i = 1; i <= z; i++) {
                Card crd = deck.remove(random.nextInt(deck.size()));
                System.out.println(i+" "+ crd.name());
                shuffledDeck.add(crd);
            }
            System.out.println("Изходная колода после выдергивания всех карт");
            printDeck();
            deck.addAll(shuffledDeck);
            shuffledDeck.clear();
          }
        System.out.println("Изходная колода после добавления размешанной колоды");
        printDeck();
        
    }
    
    void shuffle ()
    {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            Card crd = deck.remove(random.nextInt(deck.size()));
            deck.add(crd);
        }
    }
    
    public Card getCard ()
    {
        return deck.remove(0);
    }
    
    public void printDeck()
    {
             for (Card deck1 : deck) System.out.println(deck1.name());
    }
}
