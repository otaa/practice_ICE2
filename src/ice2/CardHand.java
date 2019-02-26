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


public class CardHand extends Card{

        private int handSize = 60;
	public Card[] cards = new Card[handSize];
        
        CardHand(int handsize){
        super(color, value);
        this.handSize= handsize;
        }
	
        /**
         * This method generates 60 unique cards -  each card is set with  
         * different color and rank combination. 
         */
        public void generateHand()
        {
                int countCards = 0;
                //loop for 4 times
		for(Card.Color c: Card.Color.values())
                {
                    //loop for 15 times
                    for(Card.Value v: Card.Value.values())
                    {
                        cards[countCards] = (new Card(c,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}
