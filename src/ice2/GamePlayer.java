/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice2;

/**
 *
 * @author amika
 */

public class GamePlayer extends CardHand{
        
        //draw a card for a player
        //create more objects of CardHand for addditional players
	public static void main(String[] args) {
		CardHand ch = new CardHand(5);
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getColor());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
	}

}