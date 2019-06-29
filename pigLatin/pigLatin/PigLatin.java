package pigLatin;
import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		//Convert user input to pig Latin, print result
		
		//welcome user
		System.out.println("Welcome to the Pig Latin converter!");
		
		//ask for input
		System.out.println("Enter the phrase that you'd like to convert: ");
		Scanner userInput = new Scanner(System.in);
		String oldPhrase = userInput.nextLine();
		
		//separate oldPhrase into string array oldWords
		String oldWords[] = oldPhrase.split(" ");
		String newWords[] = new String[oldWords.length];
		String newPhrase = "";
		
		//populate string array newWords with converted oldWords
		for(int x = 0;x < newWords.length;x++) {
			int y = findVowel(oldWords[x]);
			if(y==0) {
				newWords[x] = oldWords[x] + "way";
			} else {
				newWords[x] = oldWords[x].substring(y) + oldWords[x].substring(0,y) + "ay";
			}
			newPhrase = newPhrase + newWords[x] + " ";
		}
		
		System.out.println("Your phrase in Pig Latin:");
		System.out.println(newPhrase);
		
		
		userInput.close();
	}
	
	public static int findVowel(String word) {
		word = word.toLowerCase();
		int y = 0;
		for(int x = 0; x < word.length(); x++) {
			switch (word.charAt(x)){
			case 'a':
				y = x;
				x = word.length() + 1;
				break;
			case 'e':
				y = x;
				x = word.length() + 1;
				break;
			case 'i':
				y = x;
				x = word.length() + 1;
				break;
			case 'o':
				y = x;
				x = word.length() + 1;
				break;
			case 'u':
				y = x;
				x = word.length() + 1;
				break;
			case 'y':
				if(x>0) {
					y = x;
					x = word.length() + 1;
				}
				break;
			default:
				break;	
			}
		}
		return y;
	}
}
