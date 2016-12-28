/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author polina.garmas
 */
enum Suit {Spades , Hearts, Clubs, Diamonds};
enum Values {Ace , Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King };

public class Card {
    private Suit suit;
    private Values value;

    public Card(Suit suit, Values value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Values getValue() {
        return value;
    }
    
    
    
    public String name()
    {
        return value.toString()+" of "+suit.toString();
    }
}
