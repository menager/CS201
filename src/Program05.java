/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * This program acts as a 
	 * basic calculator and can multiply,
	 * divide, add and subtract using 
	 * user input.
	 * 
	 *
	 */

import java.util.Scanner;

public class Program05 {
   
    public static void main(String[] args){
       
        Scanner stdIn = new Scanner(System.in);
        double left;
        double right;
        String op;
       
        System.out.print("Enter the left operand : ");
            left = stdIn.nextDouble();
        System.out.print("Enter the right operand : ");
            right = stdIn.nextDouble();
           
        System.out.println("\n1 -> Multiplication\n2 -> Division\n3 -> Addition\n4 -> Subtraction");
        System.out.print("\nChoose an operator from the above menu:");
        op = stdIn.next();
       // validates user input as either a "1" "2" "3" or "4"
        while(!(op.charAt(0)=='1'||op.charAt(0)=='2'||op.charAt(0)=='3'||op.charAt(0)=='4')){
            System.out.print("Choose an operator from the above menu:");
                op = stdIn.next();
        }	// checks if user wants to use multiplication
            if(op.charAt(0) =='1'){
                System.out.print("\n"+left+ " * " +right+" = " +(left*right));
            }
            // checks if user wants to use division
            else if(op.charAt(0)=='2'){
            	System.out.print("\n"+left+ " / " +right+" = " +(left/right));;
            }
            // checks if user wants to use addition
            else if(op.charAt(0)=='3'){
            	System.out.print("\n"+left+ " + " +right+" = " +(left + right));;
            }
            // else user wants to use subtraction
            else{
            	System.out.print("\n"+left+ " - " +right+" = " +(left-right));;
            }
            
            
            stdIn.close();
    }
}