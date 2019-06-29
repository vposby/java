package ageConverter;
import java.util.Calendar;
import java.util.Scanner;

public class AgeConverter {
	public static void main(String[] args) {
		/* The user provides their date of birth
		 * and the program outputs their age in
		 * the units specified by the user. */
		Scanner userInput = new Scanner(System.in);
		int dateParts[] = new int[3];
		System.out.println("Welcome to the age converter!");
		
		System.out.println("Please enter your birth month: (mm)");
		dateParts[0] = userInput.nextInt();
		boolean validMonth = false;
		while(validMonth == false) {
			if(dateParts[0]<1||dateParts[0]>12) {
				System.out.println("Invalid month! Please enter your birth month (mm)");
				dateParts[0] = userInput.nextInt();
			} else {
				validMonth = true;
			}
		}
		
		System.out.println("Please enter your birth day: (dd)");
		dateParts[1] = userInput.nextInt();
		boolean validDay = false;
		while(validDay == false) {
			if(dateParts[1]<1||dateParts[1]>31) {
				System.out.println("Invalid day! Please enter your birth day (dd)");
				dateParts[1] = userInput.nextInt();
			} else if(dateParts[0]==2&&dateParts[1]>28){
				System.out.println("Invalid day! Please enter your birth day (dd)");
				dateParts[1] = userInput.nextInt();
			} else if((dateParts[0]==4||dateParts[0]==6
					||dateParts[0]==9||dateParts[0]==11)
					&&dateParts[1]>30){
				System.out.println("Invalid day! Please enter your birth day (dd)");
				dateParts[1] = userInput.nextInt();
			} else {
				validDay = true;
			}
				
		}
		
		System.out.println("Please enter your birth year: (yyyy)");
		dateParts[2] = userInput.nextInt();
		boolean validYear = false;
		while(validYear == false) {
			if(dateParts[2]<1||dateParts[2]>Calendar.getInstance().get(Calendar.YEAR)) {
				System.out.println("Invalid day! Please enter your birth year (yyyy)");
				dateParts[2] = userInput.nextInt();
			} else {
				validYear = true;
			}
		}
		
		System.out.println("What units would you like your age to be presented in?");
		System.out.println("1)Years, 2)Months, 3)Weeks, 4)Days, 5)Hours, 6)Minutes, or 7)Seconds?");
		int units = userInput.nextInt();
		boolean unitsChosen = false;
		int userAge = 0;
		String ageUnits = "";
		while(unitsChosen == false) {
			switch(units) {
			//year
			case 1:
				userAge = Calendar.getInstance().get(Calendar.YEAR) - dateParts[2];
				if(Calendar.getInstance().get(Calendar.MONTH)<dateParts[0]) {
					userAge-=1;
				}
				ageUnits = "years";
				unitsChosen = true;
				break;
			//month
			case 2:
				userAge = ((Calendar.getInstance().get(Calendar.YEAR) - dateParts[2])*12)+(12-dateParts[0])+Calendar.MONTH;
				ageUnits = "months";
				unitsChosen = true;
				break;
			//week
			/*
			case 3:
				userAge = Calendar.YEAR - dateParts[2];
				ageUnits = "weeks";
				unitsChosen = true;
				break;
			//day
			case 4:
				userAge = Calendar.YEAR - dateParts[2];
				ageUnits = "days";
				unitsChosen = true;
				break;
			//hour
			case 5:
				userAge = Calendar.YEAR - dateParts[2];
				ageUnits = "hours";
				unitsChosen = true;
				break;
			//minute
			case 6:
				userAge = Calendar.YEAR - dateParts[2];
				ageUnits = "minutes";
				unitsChosen = true;
				break;
			//second
			case 7:
				userAge = Calendar.YEAR - dateParts[2];
				ageUnits = "seconds";
				unitsChosen = true;
				break;
			 */
			default:
				break;
			}
		}
		
		System.out.println("You are " + userAge + " " + ageUnits + " old.");
		
		userInput.close();
	}
}
