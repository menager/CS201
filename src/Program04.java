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

public class Program04 {
	public static void main(String[] args){
		Scanner scnIn = new Scanner(System.in);
		String code;
	
		System.out.println("Please enter a lock combination ( RddLddRdd ):");
			code = scnIn.nextLine();
			
			if(code.length()==9){
			// checks to make sure subscripts 0,3,6 are 'R' 'L' 'R'
			if (code.substring(0,1).equals("R") && code.substring(6,7).equals("R") && code.substring(3,4).equals("L")){
				
				// checks to make sure subscripts 1,2,4,5,7,8 are digits	
				if(code.charAt(1)>= '0' && code.charAt(1)<= '9' && code.charAt(2)>= '0' && code.charAt(2)<= '9' && code.charAt(4)>= '0' 
							&& code.charAt(4)<= '9' && code.charAt(5)>= '0' && code.charAt(5)<= '9' && code.charAt(7)>= '0' && code.charAt(7)<= '9' 
							&& code.charAt(8)>= '0' && code.charAt(8)<= '9'){
						
						System.out.print(code+" is a valid lock combination!");
						
					}
					else{
						System.out.print(code+" is not a valid lock combination!");
					}
	
			}
			else{
				System.out.print(code+" is not a valid lock combination!");
			}
				
			}
			else{
				System.out.print(code+" is not a valid lock combination!");
			}
				scnIn.close();
			
	}
}
