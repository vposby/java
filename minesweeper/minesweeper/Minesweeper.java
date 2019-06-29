package minesweeper;
import java.util.Scanner;

public class Minesweeper {
	public static void main(String[] args) {
		
	}
	
	public static int[] gameSize(char choice) {
		int fieldWidth;
		int fieldHeight;
		Scanner fieldInput = new Scanner(System.in);
		switch(choice) {
		//small
		case 's':
			fieldWidth = 7;
			fieldHeight = 7;
			break;
		//medium
		case 'm':
			fieldWidth = 10;
			fieldHeight = 10;
			break;
		//large
		case 'l':
			fieldWidth = 15;
			fieldHeight = 15;
			break;
		//custom
		case 'c':
			System.out.println("How wide should the game field be? ");
			fieldWidth = fieldInput.nextInt();
			System.out.println("How tall should the game field be? ");
			fieldHeight = fieldInput.nextInt();
			break;
		default:
			fieldWidth = 7;
			fieldHeight = 7;
			break;
		}
		int[] fieldSize = new int[1];
		fieldSize[0] = fieldWidth;
		fieldSize[1] = fieldHeight;
		fieldInput.close();
		return fieldSize;
	}
	
	public static int[][][][] fieldGen(int fieldWidth, int fieldHeight) {
		//coordinate pair (x,y), has mine?, user selected?
		int[][][][] field = new int[fieldWidth-1][fieldHeight-1][0][0];
		for(int x=0;x==fieldWidth-1;x++) {
			for(int y=0;y==fieldHeight-1;y++) {
			}
		}
		return field;
	}
}
