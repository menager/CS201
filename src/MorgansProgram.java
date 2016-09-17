import java.util.*;

public class MorgansProgram {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		int num = -1; 
		while (num < 0 || num > 9) {
		System.out.print("Enter a number (0-9): ");
		num = stdIn.nextInt();
		}
		
		if (num == 0) {
			System.out.println("Why the hell are you running this program if you entered 0?\n");
		}
		// Skip 0 and start at 1, i keeps track of the line number being printed
		for (int i = 1; i <= num; i++) {
			
			/********************************************************
			 * # of stars + # of numbers being printed in the line = entered number
			 * To get number of stars, subtract the number of numbers being printed 
			 * i.e. If 6 was input, first line you want to print 5 stars and 1 number
			 * 		5 stars + 1 number = 6
			 * 		Second line, print 4 stars and 2 numbers, 4 + 2 = 6
			 * 		etc...
			 *********************************************************/
			
			for (int j = (num - i); j > 0; j--) {
				System.out.print("*");
			}
			
			// Print out the number of numbers for each line
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			
			// Line break after each line
			System.out.println();
		}
		
		/******************************************************************
		 * You can modify this to print 2 stars for each number greater than 9
		 * to print some giant ass pyramids, 3 stars for numbers over 100, etc...
		 ******************************************************************/
		System.out.println("\n8==========D 8==========D 8==========D ");
		System.out.println("( . ) ( . )     ( . ) ( . )        ( . ) ( . )\n");
		
		num = -1; 
		while (num < 0 || num > 100) {
		System.out.print("Enter a number (1-100): ");
		num = stdIn.nextInt();
		}
		
		int numOverTen = num - 9;

		for (int i = 1; i <= num; i++) {
			for (int j = (num - i); j > 0; j--) {
				System.out.print("*");
			}
			if (i  > 9) {
				for (int x = 1; x <= num - i; x++) {
					System.out.print("*");
				}
			}
			else {
				for (int x = 1; x <= numOverTen; x++) {
					System.out.print("*");
				}
			}
			
		for (int k = 1; k <= i; k++) {
			System.out.print(k);
		}
			System.out.println();
		}
		
		stdIn.close();
	}
}
