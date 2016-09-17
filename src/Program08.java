/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * This program converts user
	 * inputed binary numbers into decimals
	 * 
	 */

import java.util.Scanner;

public class Program08 {

	public static void main(String[] args){ 
		Scanner stdIn = new Scanner(System.in);
			
		System.out.println("Welcome to BinaryCalc 3000!\n");
		String l = "a";
		while(!l.equals("quit")){
			l = getBinary(stdIn);
			if(l =="quit"){
				System.out.print( "There are 10 kinds of people in this world,"
							+ "\nThose who understand binary, and those who don't."
							+"\n\nThank you for using BinaryCalc 3000!");
			}
			else
			System.out.println(l+" in decimal");
		}
	
	}
	public static boolean isBinary(String num)
	{
	
		int i = 0;
		boolean binary = false;
		do
		{
			if(num.charAt(i) == '1' || num.charAt(i) == '0'){
				binary = true;
			}
			else
			{
				binary = false;
				i = num.length()+1;
			}
			
			i++;
		}while(i <num.length());
		
		return binary;
	}
	
	public static String getBinary(Scanner stdIn)
	{
		String input;
		String output;
		
		do{
			System.out.println("Please input a binary number or 'q' to quit:");
			input = stdIn.next();
			
		}while(!input.equalsIgnoreCase("q")&& isBinary(input) == false);
		
		if(input.equalsIgnoreCase("q"))
		{
			output = "quit";/* "There are 10 kinds of people in this world,"
					+ "\nThose who understand binary, and those who don't."
					+"\n\nThank you for using BinaryCalc 3000!";*/
		}
		else {
			output = input+" in binary is "+Integer.toString(toDecimal(input));
			
		}
		

		return output;
		
		
	}
	
	public static int toDecimal(String num)
	{
		int output = 0;

		for(int i=0;i<num.length();i++){

		   if(num.charAt(i)== '1')
		  output=(int) (output + Math.pow(2,num.length()-1-i));
		}   
		return output;  
		
	}
}
