package cipherGame;
import java.util.Scanner;

public class CipherGame {
	public static void main(String[] args){
		/* This game requires two teams of two.
		 * One team chooses and encrypts a phrase,
		 * and the other team must decrypt the phrase
		 * within the time limit to score a point.
		 * The team with the most points wins. */
		
		Scanner playerInput = new Scanner(System.in);
		
		//player allocation: how many people?
		System.out.println("Welcome to the game! Up to four people can play.");
		System.out.println("How many people are playing? ");
		int playerCount = playerInput.nextInt();
		boolean playerSet = false;
		String p1 = "YOU";
		String p2 = "COMP1";
		String p3 = "COMP2";
		String p4 = "COMP3";
		
		while (playerSet == false) {
			switch (playerCount) {
			//one player
			case 1:
				System.out.println("What is your name? ");
				p1 = playerInput.nextLine();
				playerSet = true;
				break;
			//two players
			case 2:
				System.out.println("What is the first player's name? ");
				p1 = playerInput.nextLine();
				System.out.println("What is the second player's name? ");
				p2 = playerInput.nextLine();
				playerSet = true;
				break;
			//three players
			case 3:
				System.out.println("What is the first player's name? ");
				p1 = playerInput.nextLine();
				System.out.println("What is the second player's name? ");
				p2 = playerInput.nextLine();
				System.out.println("What is the third player's name? ");
				p3 = playerInput.nextLine();
				playerSet = true;
				break;
			//four players
			case 4:
				System.out.println("What is the first player's name? ");
				p1 = playerInput.nextLine();
				System.out.println("What is the second player's name? ");
				p2 = playerInput.nextLine();
				System.out.println("What is the third player's name? ");
				p3 = playerInput.nextLine();
				System.out.println("What is the fourth player's name? ");
				p4 = playerInput.nextLine();
				playerSet = true;
				break;
			//invalid number
			default:
				System.out.println("That is an invalid number! Please choose a number between 1 and 4. ");
				playerCount = playerInput.nextInt();
				break;
			}
		}
		
		//team allocation
		System.out.println("Team 1: " + p1 + " and " + p2);
		System.out.println("Team 2: " + p3 + " and " + p4);
		
		//how many rounds? 3, 5, or 7
		System.out.println("How many rounds would you like to play? ");
		int roundCount = playerInput.nextInt();
		int roundsPlayed = 0;
		boolean roundSet = false;
		
		while (roundSet == false) {
			switch (roundCount) {
			//3: must win 2 rounds
			case 3:
				System.out.println("In order to win, a team must win 2 rounds.");
				roundSet = true;
				break;
			//5: must win 3 rounds
			case 5:
				System.out.println("In order to win, a team must win 3 rounds.");
				roundSet = true;
				break;
			//7: must win 4 rounds
			case 7:
				System.out.println("In order to win, a team must win 4 rounds.");
				roundSet = true;
				break;
			//invalid number
			default:
				roundCount = playerInput.nextInt();
				break;
			}
		}
		
		//game start
		/* each player on team has 30 seconds to:
		 * A) create a string of length 5<=20 per player
		 * and B) choose one transformation each */
		for(roundsPlayed=0;roundsPlayed<roundCount*2;roundsPlayed++){
			System.out.println("Please choose a word with 5 to 20 letters.");
			
			//show 30-second timer for p1 or p3
			if(roundsPlayed%2==0){
				System.out.println(p1 + ", what is your word? ");
			} else {
				System.out.println(p3 + ", what is your word? ");
			}
			
			String word1 = playerInput.nextLine();
			
			//show 30-second timer for p2 or p4
			if(roundsPlayed%2==0){
				System.out.println(p2 + ", what is your word? ");
			} else {
				System.out.println(p4 + ", what is your word? ");
			}
			
			String word2 = playerInput.nextLine();
			
			//validate team input
			boolean validPhrase = false;
			while(validPhrase == false){
				//length
				if(word1.length()<5 || word1.length()>20) {
					System.out.println(p1 + ", your word is too short. Please choose another: ");
					word1 = playerInput.nextLine();
				} else if(word2.length()<5 || word2.length()>20) {
					System.out.println(p2 + ", your word is too short. Please choose another: ");
					word2 = playerInput.nextLine();
				} else {
					//alphanumeric only
					validPhrase=true;
				}
			}
			
			String teamPhrase = word1 + word2;
			System.out.println("teamPhrase = " + teamPhrase);
			System.out.println("teamPhrase.length = " + teamPhrase.length());
			
			//display cipher choices
			/*1: caesar cipher (user's choice of letter, number)
			 * 
			 */
			
			//phraseChange(teamPhrase);
			
			/* 10 to 20 characters: 60 seconds
			 * 21 to 30 characters: 90 seconds
			 * 31 to 40 characters: 120 seconds 
			 * display phraseChange to opposing team
			 * along with cipher choices*/
			
			//team 2 gets 3 guesses (not case sensitive)
		}
		
		playerInput.close();
	}
	
	public static String phraseChange(String oldPhrase){
		/* convert oldPhrase to newPhrase using cipher
		 * chosen by players */
		//variable declarations
		String[] snippet = oldPhrase.split("");
		String newPhrase = "";
		/* non-working for loop
		*for(int x = 0; x = oldPhrase.length(); x++){
		*	newPhrase = newPhrase + snippet[x];
		*} */
		//return
		return newPhrase;
	}
	
}
