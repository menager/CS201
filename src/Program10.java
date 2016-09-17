/*
 * Morgan Nager
 * Computer Science 201-401
 * 
 * This program is a 4 card poker game
 * Player starts with 100 chips and plays
 * until they quit or are out of chips.
 * Once game is done, program reports
 * number of hands, the number of wins and losses
 * and reports the net earnings or losings of the player.
 * 
 */

import java.util.Scanner;

public class Program10 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] deck = new int[36];
		int[] hand = new int[4];
		boolean play = false;
		int bankroll = 100;
		int winnings;
		int numHands=0;
		int numWin=0;
		int numLoss=0;
		String bet;
		String uIn;
		System.out.println("Welcome to 4 card poker\nYour initial bank roll is $100.00\n");
		
		do{
			System.out.println("Do you want to play a game?");
			uIn =stdIn.nextLine();
		}while(!(uIn.equalsIgnoreCase("y")||uIn.equalsIgnoreCase("n")));
		
		if(uIn.equalsIgnoreCase("y")){
			play = true;
		}
		else{
			play = false;
		}
			
		while(play == true && bankroll!=0){
			do{
			System.out.print("Place your bet [1, "+bankroll+"]:");
			 bet = stdIn.nextLine();
			}while(Integer.parseInt(bet) <1 || Integer.parseInt(bet)>bankroll);
			
			int numBet = Integer.parseInt(bet);
			dealHand(deck, hand);
			
			if(isQuad(hand)==true){
				winnings = numBet*6545;
				System.out.println("Congrats: you got 4 of a kind and have won $"+winnings);
				bankroll +=winnings;
				++numWin;
			}
			else if(isTrip(hand) == true){
				winnings = numBet*51;
				System.out.println("Congrats: you got 3 of a kind and have won $"+winnings);
				bankroll +=winnings;
				++numWin;
			}
			else if(isStraight(hand) == true){
				winnings = numBet*38;
				System.out.println("Congrats: you got a Straight and have won $"+winnings);
				bankroll +=winnings;
				++numWin;
			}
			else if(is2Pair(hand) == true){
				winnings = numBet*22;
				System.out.println("Congrats: you got 2 Pairs and have won $"+winnings);
				bankroll +=winnings;
				++numWin;
			}
			else if(isPair(hand)== true){
				winnings = numBet;
				System.out.println("Congrats: you got a Pair and have won $"+winnings);
				bankroll +=winnings;
				++numWin;
			}
			else{
				winnings = numBet;
				System.out.println("Sorry: you got a Bubkiss and have lost $"+winnings);
				bankroll -= winnings;
				++numLoss;
			}
			if(bankroll !=0){
				do{
					System.out.println("Do you want to play a game?");
					uIn =stdIn.nextLine();
				}while(!(uIn.equalsIgnoreCase("y")||uIn.equalsIgnoreCase("n")));
				
				if(uIn.equalsIgnoreCase("y")){
					play = true;
				}
				else{
					play = false;
				}
			}
			else{
				System.out.println("Party's Over: You're out of chips.");
				play = false;
			}
				
				++numHands;
		}
		
		System.out.println("Thanks for playing...\n\n");
		System.out.println("You played a total of "+numHands+" hands.");
		System.out.println("Of which you won "+numWin+"\nAnd you lost "+numLoss+"\n");
		if(bankroll ==0){
			System.out.println("But in the end you lost $100");
		}
		else if(bankroll>=100){
			System.out.println("But in the end you won $"+(bankroll -100));
		}
		else{
			System.out.println("But in the end you lost $"+(100-bankroll));
		}
			
		stdIn.close();
	}
	public static void initDeck(int[] deck){
		//Assign the elements of deck the values 1 to 9 four times, consecutively - lling the array.
		int num = 0;
		 for(int i = 0; i <4; i++)
		 {
			 for(int j = 1; j<10; j++)
			 {
				 deck[num] = j;
				 ++num;
			 }
		 }
	 }
	public static void sortHand(int[] hand)
	{
		for (int i = 0; i < hand.length; ++i)
		{
			int maxLoc = i;
			for (int j = i+1; j < hand.length; ++j)
				if (hand[j] > hand[maxLoc])
					maxLoc = j;
			int tmp = hand[i];
			hand[i] = hand[maxLoc];
			hand[maxLoc] = tmp;
		}
	}
	public static void shuffleDeck(int[] deck, int n){
			//The following is performed exactly n times:
			//Generate two random numbers (index1, index2) in the range 0 to 35 inclusive and then swap
//			the value of array element at index1 with the value of the array element at index2
		 int index1, index2;
		for(int i = 0; i<=n; i++){
		 index1 = (int) (Math.random()*36) ;
		 index2 = (int) (Math.random()*36) ; 
		 int temp = deck[index1];
		 deck[index1] = deck[index2];
		 deck[index2] = temp;
				 
		}
	 }
	public static void dealHand(int [] deck, int[] hand){

			/* Initialize deck - initDeck()
			 Shue deck - shuffleDeck() - use at least 128 for n
			 Uses the rst four values in deck to assign the four values of hand
			 Sort hand - sortHand()*/
		 initDeck(deck);
		 shuffleDeck(deck, 128);
		for(int i = 0; i<4; i++){
			hand[i] =deck [i];
		}
		System.out.println("Let the cards fall where they may...");
		displayHand(hand);
		sortHand(hand);
		System.out.println("Let's get things in order...");
		displayHand(hand);

		
	}
	public static void displayHand(int[] hand){
		//	Prints the cards of hand in some reasonable report format.
		for(int i = 0; i<hand.length; i++){
			 System.out.print(hand[i]+" ");
		 }
		 System.out.println();
		 System.out.println();
	}

	public static boolean isQuad(int[] hand){
		//Returns true if and only if the cards in hand qualify as 4 of a kind, returns false otherwise.
		boolean q = false;
		 if(hand[0]== hand[1]&& hand[1]== hand[2]&& hand[2] == hand[3])
		 {
			 q =true;
		 }
		 else{
			 q=false;
		 }
		 return q;
	}
	
	public static boolean isTrip(int[] hand){
		 boolean t = false;
		 if(hand[0]== hand[1] && hand[1] == hand[2]){
			 t = true;
		 }
		 else if(hand[0]==hand[2]&& hand[2] == hand[3])
		  {
			  t = true;
		  }
		 else if(hand[0]== hand[1] && hand[1] ==hand[3])
		 {
			  t = true;
		 }
		 else if(hand[1]==hand[2] && hand[2] == hand[3])
		 {
			 t = true;
		 }
		 else
		 {
			 t = false;
		 }
		  return t;
		  //Returns true if and only if the cards in hand qualify as 3 of a kind, returns false otherwise.
	}
	
	public static boolean isStraight(int[] hand){
		boolean straight = false;
		if(hand[1] == hand[0]-1 && hand[2] == hand[1]-1 && hand[3]== hand[2] - 1){
			straight = true;
		}
		else
		{
			straight = false;
		}
		  return straight;//Returns true if and only if the cards in hand qualify as a straight, returns false otherwise.
	}
	
	public static boolean is2Pair(int[] hand){
		  boolean is2 = false;
		if(hand[0]==hand[1])
		{
			if(hand[2]==hand[3]){
				is2 = true;
			}
			else
				is2 = false;
		}
		else
		{
			is2 = false;
		}
			return is2;//Returns true if and only if the cards in hand qualify as two pair, returns false otherwise.
	}
	
	public static boolean isPair(int[] hand){
		  boolean pair = false;
		  if(hand[0]==hand[1]||hand[1]==hand[2]||hand[2]==hand[3])
		  {
			  pair = true;
		  }
		  else
			  pair = false;
		  return pair;//	Returns true if and only if the cards in hand qualify as a pair, returns false otherwise.
	}


}
