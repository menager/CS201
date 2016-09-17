/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * This program prompts and accepts user 
	 * input of nine characters which 
	 * constitute a lock combination and
	 * determines whether or not it is
	 * and acceptable combination.
	 * 
	 *
	 */

import java.util.Scanner;

public class Program04_whileLoop {
	public static void main(String[] args){
		Scanner scnIn = new Scanner(System.in);
		String code;
	
		System.out.println("Please enter a lock combination ( RddLddRdd ):");
			code = scnIn.nextLine();
			
			if (code.substring(0,1).equals("R") && code.substring(6,7).equals("R") && code.substring(3,4).equals("L")){
				int n = 1;
				boolean valid = false;
				while(n>0 && n<9){
				if (n != 0 && n!= 3 && n!=6){
					if(code.charAt(n)>= '0' && code.charAt(n)<= '9'){
						//System.out.print(code+" is a valid lock combination");
						
						System.out.println("yah "+code.charAt(n));
						n = n+1;
						
					}
					else{
						System.out.print(code+" is not a valid lock combination!");
					}
				}
				else{
					n = n+1;
					}
				}
			}
			else{
				System.out.print(code+" is not a valid lock combination!");
			}
				
				
				scnIn.close();
	}
}
