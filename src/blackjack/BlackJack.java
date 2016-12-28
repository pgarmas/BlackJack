/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author polina.garmas
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        
        Deck koloda = new Deck();
        koloda.shuffle();
        
        ArrayList<Card> playerHand = new ArrayList<>();
        ArrayList<Card> dealerHand = new ArrayList<>();
        
        playerHand.add(koloda.getCard());
        dealerHand.add(koloda.getCard());
        playerHand.add(koloda.getCard());
        dealerHand.add(koloda.getCard());

        //пора решать
        showOutcome(playerHand, dealerHand);
        //System.out.println(koloda.getCard().name());
        Scanner sn = new Scanner(System.in);
        System.out.println("Сдать еще карту?");
        String answer= sn.next();
        if (answer.contains("y")) {
            playerHand.add(koloda.getCard());
        }
        showOutcome(playerHand, dealerHand);
    }
    
    static void showOutcome(ArrayList<Card> playerHand,ArrayList<Card> dealerHand)
    {
        System.out.println("У вас на руках:");
         for (Card deck1 : playerHand) {
             System.out.println(deck1.name());
        }
        System.out.println("Сумма карт: "+ handMinValue(playerHand)); 
        System.out.println("У дилера на руках:");
             for (Card deck1 : dealerHand) {
             System.out.println(deck1.name());
        }
        System.out.println("Сумма карт: "+ handMinValue(dealerHand));    

    }
    
    
    public static ArrayList<Integer> handMinValue (ArrayList<Card> hand)
    {
        int sum=0;
        for (Card crd : hand) {
            //add card value to the sum
            if (crd.getValue()==Values.Ace) sum+=1;
            if (crd.getValue()==Values.Two) sum+=2;
            if (crd.getValue()==Values.Three) sum+=3;
            if (crd.getValue()==Values.Four) sum+=4;
            if (crd.getValue()==Values.Five) sum+=5;
            if (crd.getValue()==Values.Six) sum+=6;
            if (crd.getValue()==Values.Seven) sum+=7;
            if (crd.getValue()==Values.Eight) sum+=8;
            if (crd.getValue()==Values.Nine) sum+=9;
            if (crd.getValue()==Values.Ten) sum+=10;
            if (crd.getValue()==Values.Jack) sum+=10;
            if (crd.getValue()==Values.Queen) sum+=10;
            if (crd.getValue()==Values.King) sum+=10;
            }
        int aces =handAceCount(hand);
        ArrayList<Integer> handValues = new ArrayList<>();
        handValues.add(sum);
        for (int i = 0; i < aces; i++) {
            sum+=10;
            handValues.add(sum);
        }
        
        return handValues;
    }
    
        public static int handAceCount (ArrayList<Card> hand)
    {
        int numOfAces=0;
        for (Card crd : hand) {
            //add card value to the sum
            if (crd.getValue()==Values.Ace) numOfAces+=1;
            }
        return numOfAces;
    }
    
}
