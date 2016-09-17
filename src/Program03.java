	/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * Purpose: This program computes and outputs the ERA of 
	 * a baseball pitcher based on user input.
	 * 
	 *
	 */

import java.util.Scanner;

public class Program03 {
	
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		String firstName; // first name of pitcher
		String lastName; // last name of pitcher
		int earnedRuns; // runs earned against the pitcher
		int inningsPitched; // number of innings pitched
		double ERA; // pitcher's ERA
		
		System.out.print("Pitcher's first name: ");
		firstName = stdIn.next();
		System.out.print("Pitcher's last name: ");
		lastName = stdIn.next();
		System.out.print("Number of earned runs: ");
		earnedRuns = stdIn.nextInt();
		System.out.print("Number of inngings pitched: ");
		inningsPitched = stdIn.nextInt();
		
		ERA =  earnedRuns*9.0 /inningsPitched;
		System.out.print(firstName+" "+lastName+" has an ERA of "+ERA); 
		stdIn.close();
	}
}
