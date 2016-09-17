	import java.util.Scanner;
		public class Lab09
		{
			public static void main(String[] args)
			{
				Scanner stdIn = new Scanner(System.in);
				double curBal = 45.32;
				double amount;
				
				System.out.print("Please enter a amount to update account by $");
					amount = stdIn.nextDouble();
					
				System.out.print("\n");
				System.out.print("Customer\'s balance (before transaction) = $");
				System.out.println(curBal + "\n");
				System.out.print("Requested update amount = $");
				System.out.println(amount + "\n");
					double actAmount;
					
				actAmount = transaction(curBal, amount);
				curBal += actAmount;
				
				System.out.print("Actual update amount = $");
				System.out.println(actAmount + "\n");
				System.out.print("Customer\'s balance (after transaction) = $");
				System.out.println(curBal + "\n");
				System.out.println("\nThank you and good-bye!\n");
			stdIn.close();
	}
	public static double transaction(double bal, double amount)
	{
	// Write your code here ...
		//if amt positive == deposit; else withdraw
		double n=0.0;
		if (amount >0.0){// deposit
			n= amount;
		}
		else{ //withdraw
			if(amount <=bal){ //ok withdraw
				n = - bal;
			}
			else{ //withdraw is greater than acct
				n = amount;
			}
		}
		return n; // actual return value here (NOT 0.0)
	}
	}