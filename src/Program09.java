/*
 * Morgan Nager
 * Computer Science 201-401
 * 
 * This program is a guess the
 * common phrase game. Basically
 * a nicer version of hang man
 * 
 */
import java.util.Scanner;

public class Program09 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String sPhrase, temp;
		//char guess;
		boolean tempEx = false;
		int numGuess = 0;
		System.out.print("Please enter the phrase to guess at: ");
			sPhrase = stdIn.nextLine();
		System.out.println("\n\n\n\n");
		temp = createTemplate(sPhrase);
		System.out.println("\nCommon Phrase\n-------------\n"+temp+"\n");
		while(tempEx == false){
			char guess = getGuess(stdIn);
			temp = updateTemplate(temp, sPhrase, guess);
			System.out.println("\nCommon Phrase\n-------------\n"+temp+"\n");
			tempEx = exposedTemplate(temp);
			numGuess++;
		}
		
		System.out.println("Was guessed in "+numGuess+" guesses");
		
	}
	

	public static String createTemplate(String sPhrase)
	{
		String template ="" ;
		for(int i=0; i <sPhrase.length(); ++i){
			if(sPhrase.charAt(i) ==' '){
				template += " ";
			}
			else
			{
				template +="?";
			}
		}
		return template;
	}
	public static char getGuess(Scanner stdIn)
	{
		String guess;
		do{
			System.out.print("Enter a lowercase letter guess : ");
			guess=stdIn.next();
			
		}while(Character.isDigit(guess.charAt(0))||guess.length()>1 || !Character.isLowerCase(guess.charAt(0)));
		
		return guess.charAt(0);
	}
	public static String changeCharAt(String str, int ind, char newChar)
	{
		return str.substring(0, ind) + newChar + str.substring(ind+1);
	}
	
	public static String updateTemplate(String template, String sPhrase, char guess)
	{
		
		for(int i =0; i < sPhrase.length(); i++)
		{
			if(guess == sPhrase.charAt(i))
			{
				template= changeCharAt(template, i, guess);
			
			}
			else if (Character.isLetter(template.charAt(i)))
			{
				template = changeCharAt(template, i, template.charAt(i));
				
			}
			else if(template.charAt(i) =='?')
			{
				template = changeCharAt(template, i, '?');
		
			}
			else //space 
			{
				template = changeCharAt(template, i, ' ');
			
			}
			
		}
		return template;
	}
	public static boolean exposedTemplate(String template)
	{
		boolean win =false;
		int i = 0;
			do{
				if(template.charAt(i) == '?')
				{
					win = false;
					i= template.length();
				}
				else{
					win = true;
				}
				i++;
			}while(i<template.length());
		return win;
	}
}
