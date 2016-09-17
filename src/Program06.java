/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * This program is a simple
	 * three dice game of chance.
	 * It is ridiculously easy to play
	 * but ridiculously hard to win
	 * 
	 *
	 */

import java.util.Scanner;

public class Program06 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int d1, d2, d3;
		int win =0;
		int lose= 0;
		int round = 0;
		String play = "y";
		
		System.out.println("\tWelcome to Computer Dice");
		System.out.println("\nYou will first roll your dice\n\nNext the outcome of your roll will\nbe determined:\n\nany Triple and you Win"
				+ "\nany Pair and you just roll again\nanything else and you Lose\n");
		// loops the game until user wants to stop
		do{
			d1=(int)(Math.random() * 6) + 1;
			d2 =(int)(Math.random() * 6) + 1;
			d3 =(int)(Math.random() * 6) + 1;
			
			System.out.println("\n\tPlayer\n"+d1+" "+d2+" "+d3+"\n");
			// checks if any of the dice are the same value
			if(d1 == d2 || d2==d3 || d1 == d3){ 
				// checks if all of the dice are the same value (win)
				if(d1 == d2 && d2==d3){
					System.out.println("Congrats, you win!\n");
					++win; 
				}
				// else push
				else
					System.out.println("Its a push\n");
			}
			// none of the dice are the same (lose)
			else{
				System.out.println("Sorry, you lose!\n");
				++lose;
			}
			
			++round;
			// validates user input and asks if the player wishes to play again
			do{
				System.out.print("Do you wish to play again [y,n] :");
				play = stdIn.next();
			}while(play.charAt(0) != 'y' && play.charAt(0) != 'n');
			
			
			
		}while(play.charAt(0) == 'y');
		
		System.out.println("\n\tComputer Dice results\n\nYou played "+round+" rounds"
				+"\n\nRounds won : "+win+"\nRounds lost : "+lose);
		
		stdIn.close();
	}
}
