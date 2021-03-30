//package game_of_WAR;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class WarApp {
//	
//	static Scanner scanner = new Scanner(System.in);
//	static List<String> Players = new ArrayList<String>();
//
//	public static void main(String[] args) {
//		
//		int choice = 0;
//		
//		while (choice != -1) {
//			
//			showMenu();
//			
//			choice = getUserChoice();
//			if (choice == 1) {
//				addNewPlayer1();
//			} else if (choice == 2) {
//				addNewPlayer2();
//			} else {
//				System.out.println("Please add at least TWO players to the game");
//		}
//	}
//
//	}
//	
//	public static void showMenu() {
//		System.out.println("1) Name of Player 1: ");
//		System.out.println("2) Name of Player 2: ");
//		System.out.println("-----------------------------------------------------");
//	}
//	
//	public static int getUserChoice() {
//		return scanner.nextInt();
//	}
//	
//	public static void addNewPlayer1() {
//		System.out.println("Enter the name of Player 1: ");
//		String player1Name = scanner.next();
//		Players.add(player1Name);
//	}
//	
//	public static void addNewPlayer2() {
//		System.out.println("Enter the name of Player 2: ");
//		String player2Name = scanner.next();
//		Players.add(player2Name);
//	}


//}
