package game_of_WAR;

public class App {
	
	public static void main(String[] args) {
		
		Deck deckOfCards = new Deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deckOfCards.shuffle();

		
	for (int i = 0; i < 52; i++) {
		if (i % 2 == 0) {
			player1.draw(deckOfCards);
		} else {
			player2.draw(deckOfCards);
		}
	}
	
	for (int i = 0; i < 26; i++) {
		
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
		
		if (player1Card.getValue() > player2Card.getValue()) {
			player1.incrementScore();
		} else if (player1Card.getValue() < player2Card.getValue()) {
			player2.incrementScore();
		}
	}
	
	System.out.printf("Player 1 score = %d\n", player1.getScore());
	System.out.printf("Player 2 score = %d\n", player2.getScore());
	
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 Wins!!!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 Wins!!!");
		} else {
			System.out.println("Draw");
		}
	

	}

}
