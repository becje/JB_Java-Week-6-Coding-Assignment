package game_of_WAR;


public class Card {

private int value;
private String name;

public Card(int newValue, String suit) {
	value = newValue;
	
	switch (newValue) {
		case 2 : name = "2";
			break;
		case 3 : name = "3";
			break;
		case 4 : name = "4";
			break;
		case 5 : name = "5";
			break;
		case 6 : name = "6";
			break;
		case 7 : name = "7";
			break;
		case 8 : name = "8";
			break;
		case 9 : name = "9";
			break;
		case 10 : name = "10";
			break;
		case 11 : name = "Jack";
			break;
		case 12 : name = "Queen";
			break;
		case 13 : name = "King";
			break;
		case 14 : name = "Ace";
			break;				
	}
	
	name += " of " + suit;
}

public void describe() {
	System.out.printf("Card: %s with value of %d ", name, value);
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
