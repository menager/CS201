/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * This program is another
	 * 3 dice game. This time
	 * the user is against the computer.
	 * Triple beats pair and junker.
	 * Pair beats junker.
	 * Junker is a loss.
	 * In the result of a 
	 * tie with each player having either a triple
	 * or a pair the highest number wins.
	 * In the result of an actual tie,
	 * player loses.
	 * 
	 */


import java.util.Scanner;


public class Prog07adv {
	
	private static int getDice(int d){
		
		return d = (int)(Math.random() * 6) + 1;
	}
	
	public static void main(String[] args){
		Scanner stdIn  = new Scanner(System.in);
		
	
		int pd1 = 0, pd2 =0, pd3 = 0, od1 =0, od2 =0, od3=0;
		
		System.out.print("\tWelcome to Computer Dice"+
		"\n\nYou will be playing dice against the computer"
				+"\nyou can only win with a Triple or a Pair"
				+"\nany Triple beats any Pair"
				+"\nany Triple beats any Junker"
				+"\nany Pair beats any Junker"
				+"\nin case of two Triple - high Triple wins"
				+"\nin case of two Pairs - high Pair wins"
				+"\nin the case of a tie, you lose");
		pd1 = getDice(pd1);
		pd2 = getDice(pd2);
		pd3 = getDice(pd3);
		od1 = getDice(od1);
		od2 = getDice(od2);
		od3 = getDice(od3);
		
		
		stdIn.close();
	}


}