package Cards;

import java.util.ArrayList;

public class Deck {
	private static String[] types = {"H","D","C","S"};
	private static int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	public ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		//Set up cards
		setUpCards();
	}
	public void setUpCards() {
		for (int i=0; i<4; i++) {
			for (int j=0; j<13; j++) {
				Card card = new Card(types[i], values[j]);
				cards.add(card);
				System.out.println(card.getCard());
			}
		}
	}
}
