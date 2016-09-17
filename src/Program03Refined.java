
	/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * Purpose: This program computes and outputs the ERA of 
	 * a baseball pitcher based on user input.
	 * 
	 *Trying to refine to catch bad user input
	 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program03Refined {
	
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		String firstName; // first name of pitcher
		String lastName; // last name of pitcher
		int earnedRuns; // runs earned against the pitcher
		int inningsPitched; // number of innings pitched
		double ERA; // pitcher's ERA

		
		System.out.println("Please enter data as prompted.\n");
		System.out.print("Pitcher's first name: ");
		firstName = stdIn.next();
		System.out.print("Pitcher's last name: ");
		lastName = stdIn.next();
	
		try{
			System.out.print("Number of earned runs: ");
			earnedRuns = stdIn.nextInt();
		}
		catch(InputMismatchException exception){
			System.out.println("Please input a number dummy, a whole number!");
			
		}
		finally{
			System.out.print("Number of earned runs: ");
			earnedRuns = stdIn.nextInt();
		}
			
		try{
		System.out.print("Number of inngings pitched: ");
		inningsPitched = stdIn.nextInt();
		}
		catch(InputMismatchException exception2){
			System.out.println("Please input a number dummy, a whole number");
		}
		finally{
			System.out.print("Number of inngings pitched: ");
			inningsPitched = stdIn.nextInt();
		}
		ERA =  earnedRuns*9.0 /inningsPitched;
		System.out.print(firstName+" "+lastName+" has an ERA of "+ERA); 
		stdIn.close();
	}
		
	}
