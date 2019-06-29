package guessNumber;
import java.util.Scanner;
import java.util.Random;

public class GuessNum {
	public static void main(String[] args) {
		/* This is a random number guessing game.
		 * First, the program chooses a random number.
		 * Then, the user guesses a number. If their
		 * guess is correct, the program prints a
		 * success message. If not, the program tells
		 * the user if their guess was too high or too
		 * low and prompts them to guess again. The
		 * process continues until the user guesses the
		 * correct number. */
		
		//variable declarations
		int lower = 1; //default lower bound
		int upper = 10; //default upper bound
		int changeBounds = 2;
		boolean guessRight = false;
		boolean modeChoice = false;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("The lowest number I can guess is 1.");
		System.out.println("The highest number I can guess is 10.");
		System.out.println("Would you like to change the bounds?");
		System.out.println("Type 1 for Yes and 2 for No. ");
		changeBounds = userInput.nextInt();
		
		//change default bounds?
		while(modeChoice == false) {
			if (changeBounds == 1) {
				System.out.println("What is the lowest number I can choose? ");
				lower = userInput.nextInt();
				System.out.println("What is the highest number I can choose? ");
				upper = userInput.nextInt();
				modeChoice = true;
			} else if(changeBounds == 2) {
				//do nothing
				modeChoice = true;
			} else {
				System.out.println("That number is not one of the choices!");
				System.out.println("Would you like to change the bounds?");
				System.out.println("Type 1 for Yes and 2 for No. ");
				changeBounds = userInput.nextInt();
			}
		}
 
		//game start
		int answer = randInt(lower, upper);
		//System.out.println("The answer is " + answer);
		System.out.println("Guess a number: ");
		int guess = userInput.nextInt();
		while(guessRight == false) {
			if(guess < answer) {
				System.out.println("Too low! Guess again: ");
				guess = userInput.nextInt();
			} else if(guess > answer) {
				System.out.println("Too high! Guess again: ");
				guess = userInput.nextInt();
			} else {
				System.out.println("You got it!");
				guessRight = true;
				userInput.close();
			}
		}
	}
	
	public static int randInt(int min, int max) {
		/* return a random number between min and max,
		 * inclusive, using Java's Random class */
		//variable declarations
		Random rand = new Random();
		int randomInt = rand.nextInt((max-min)+1) + min;
		
		return randomInt;
	}
}
