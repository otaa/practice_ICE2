/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice2;

/**
 *
 * @author amika - pull action from github
 */


public class Card {
        
        //enum declaration for constant values
        public enum Color {RED, GREEN, YELLOW, BLUE};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,ZERO};
        private final Color color;
        private final Value value;
   
     
        //parametered constructor
        public Card(Color c, Value gVal)
        {
           color =c;
           value= gVal;
        }
        
        //get value for a card 
	public Value getValue() {
		return this.value;
	}

	//get a color for a card
	public Color getColor() {
		return this.color;
        }
}
