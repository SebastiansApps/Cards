package Cards;

public class Card {
	
	// //H: Hearts, D: Diamonds, C: Clover, S: Spades
	private String type;
	private int number;
	private String cardName;
	
	public Card(String type, int number) {
		this.type = type;
		this.number = number;
		setCardName();
	}
	public void setCardName() {
		this.cardName = (this.number + this.type);
	}
	
	public String getCard() {
		return this.cardName;
	}
	public String getType() {
		return this.type;
	}
	public String getNumber() {
		return this.cardName;
	}
}
