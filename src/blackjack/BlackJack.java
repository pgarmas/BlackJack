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
        Scanner sn = new Scanner(System.in);
        Deck koloda = new Deck();
        koloda.shuffle();
        
        ArrayList<Card> playerHand = new ArrayList<>();
        ArrayList<Card> dealerHand = new ArrayList<>();
        
        playerHand.add(koloda.getCard());
        dealerHand.add(koloda.getCard());
        playerHand.add(koloda.getCard());
        dealerHand.add(koloda.getCard());
        
        boolean gameOver = false;
        boolean playerIsDone = false;
       
        while(!gameOver)
        {
            showOutcome(playerHand, dealerHand);

            //пора решать
            //проверка не перебор
            //проверяем игрока
            if (handValue(playerHand).get(0)>21) 
            {
                if (handValue(dealerHand).get(0)>21) {
                   System.out.println("У обоих перебор, никто не выиграл!"); 
                } else System.out.println("У игрока перебор, выиграл дилер!");
                gameOver=true;
            }else if (handValue(dealerHand).get(0)>21) 
            {
                System.out.println("У дилера перебор, выиграл игрок!");
                gameOver=true;
            }else if (has21(handValue(dealerHand)))
            {
                System.out.println("У дилера 21. Дилер выиграл!");
                gameOver=true;
            } else if (has21(handValue(playerHand)))
            {
                if (dealerNeedMoreCard(handValue(dealerHand))) {
                    dealerHand.add(koloda.getCard());
                    System.out.println("Дилер берет себе карту");
                } else {
                    System.out.println("У игрока 21. Игрок выиграл!");
                    gameOver=true;
                }
            } else //ни у кого нет 21 и перебора
            {
                System.out.println("Сдать еще карту?");
                String answer= sn.next();
                if (answer.contains("y")) {
                    playerHand.add(koloda.getCard());
                    System.out.println("Дилер сдает игроку карту");
                }else {
                    playerIsDone=true;
                }
                if (dealerNeedMoreCard(handValue(dealerHand))) {
                    dealerHand.add(koloda.getCard());
                    System.out.println("Дилер берет себе карту");
                } else if (playerIsDone){
                    //все не хотят больше брать карт
                    int playerBest = BestValue(handValue(playerHand));
                    int dealerBest = BestValue(handValue(dealerHand));
                    System.out.println("У игрока "+playerBest+" очков, у дилера "+dealerBest+" очков.");
                    if (playerBest>dealerBest) {
                        System.out.println("Игрок выиграл!");
                    } else  if (dealerBest>playerBest){
                        System.out.println("Дилер выиграл!");
                    } else System.out.println("Ничья!");
                    gameOver=true;
                }
            }
        }
        System.out.println("Игра окончена.");
    }
    
    
    private static int BestValue (ArrayList<Integer> currentPoints) 
    {
        int bestValue=0;
        for (Integer currentPoint : currentPoints) {
            if (currentPoint>bestValue&&currentPoint<=21) {
                bestValue=currentPoint;
            }
        }
        return bestValue;
    }
   
    private static boolean has21 (ArrayList<Integer> currentPoints){
        return currentPoints.contains(21);
    }
    
    private static boolean dealerNeedMoreCard (ArrayList<Integer> currentPoints){
        return !(currentPoints.contains(17)||
                currentPoints.contains(18)||
                currentPoints.contains(19)||
                currentPoints.contains(20)||
                currentPoints.contains(21));
    }
    
    static void showOutcome(ArrayList<Card> playerHand,ArrayList<Card> dealerHand)
    {
        System.out.println("У вас на руках:");
         for (Card deck1 : playerHand) {
             System.out.println(deck1.name());
        }
        System.out.println("Сумма карт: "+ handValue(playerHand)); 
        System.out.println("У дилера на руках:");
             for (Card deck1 : dealerHand) {
             System.out.println(deck1.name());
        }
        System.out.println("Сумма карт: "+ handValue(dealerHand));    

    }
    
    
    public static ArrayList<Integer> handValue (ArrayList<Card> hand)
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
        
       // модификаторДоступа типВозращаемогоЗначения имяМетода(список_параметров) - параметры - это получаемые значения 



    
}
