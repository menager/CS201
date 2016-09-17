import java.util.Scanner;
public class addz {
 
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int ans;
		
		System.out.println("Enter value for a: ");
		  a=stdIn.nextInt();
		System.out.println("Enter value for b: ");
	      b= stdIn.nextInt();
	 ans = a/b;
	 
	 
	 System.out.println(ans);
	      
	 stdIn.close();
	
	}
	
	
}
