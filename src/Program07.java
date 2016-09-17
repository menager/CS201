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


public class Program07 
{
	public static void main(String[] args){
		Scanner stdIn  = new Scanner(System.in);
		
	
		int pd1, pd2, pd3, od1, od2, od3;
		int win =0;
		int lose= 0;
		int round = 0;
		String play = "y";
		
		System.out.println("\tWelcome to Computer Dice"+
		"\n\nYou will be playing dice against the computer"
				+"\nyou can only win with a Triple or a Pair"
				+"\nany Triple beats any Pair"
				+"\nany Triple beats any Junker"
				+"\nany Pair beats any Junker"
				+"\nin case of two Triple - high Triple wins"
				+"\nin case of two Pairs - high Pair wins"
				+"\nin the case of a tie, you lose");
	do
	{
		pd1 = (int)(Math.random() * 6) + 1;
		pd2 = (int)(Math.random() * 6) + 1;
		pd3 = (int)(Math.random() * 6) + 1;
		od1 = (int)(Math.random() * 6) + 1;
		od2 = (int)(Math.random() * 6) + 1;
		od3 = (int)(Math.random() * 6) + 1;
		
		System.out.println("\nPlayer\n--------\n"+pd1+" "+pd2+" "+pd3+"\n");
		System.out.println("Opponent\n--------\n"+od1+" "+od2+" "+od3+"\n");
		
		if(pd1 == pd2 && pd2==pd3)// checks if player has triple
		{ 
			if(od1 == od2 && od2==od3) // checks if opponent has triple
			{
				if(pd1 > od1)//player's triple is greater than opponent
				{ 
					System.out.println("Congrats, you win!\n");
					++win; 
				}
				else //player's triple is tied or less than opponent
				{ 
					System.out.println("Sorry, you lose!\n");
					++lose;
				}
						
			}
			else
			{
				System.out.println("Congrats, you win!\n");
				++win; 
			}

		}
		
		else if(pd1==pd2|| pd2==pd3 || pd1==pd3)// checks for player pair
		{
			if(od1 == od2 && od2==od3)//opponent has triple, player loses
			{
				System.out.println("Sorry, you lose!\n");
				++lose;
			}
			else if(od1==od2|| od2==od3 || od1==od3) //checks for opponent pair
			{
				int valueP;
				int valueO;
					if(pd1==pd2) //checks if the value of player pair is dice 1
					{
						valueP = pd1;
					}
					else //value is dice 3
					{
						valueP= pd3;
					}
					
					if(od1==od2) //checks if the value of opponent pair is dice 1
					{
						valueO = od1;
					}
					else // value is dice 3
					{
						valueO = od3;
					}
				
				if(valueP > valueO) //checks if player pair value higher than opponent pair value
				{
					System.out.println("Congrats, you win!\n");
					++win; 
				}
				else // player pair is less than or equal to opponent pair -- loss
				{
					System.out.println("Sorry, you lose!\n");
					++lose;
				}
			}
			else // opponent has junker
			{
				System.out.println("Congrats, you win!\n");
				++win; 
			}
		}

		
		else //player junker -- automatic loss
		{
			System.out.println("Sorry, you lose!\n");
			++lose;
		}
		
		++round;
		
		do// validates user input and asks if the player wishes to play again
		{
			System.out.print("Do you wish to play again [y,n] :");
			play = stdIn.next();
		}while(play.indexOf("y") !=0 && play.indexOf("n") != 0);
		
		
	}while(play.indexOf("y") == 0);
	
	System.out.println("\nComputer Dice results\n---------------------\nYou played "+round+" rounds"
			+"\n\nRounds won : "+win+"\nRounds lost : "+lose);
		
		stdIn.close();
	}


}
