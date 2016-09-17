import java.util.Scanner;

public class Lab08 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int dice;
		int rolls;
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;
		
		do{
			System.out.print("Enter number of rolls [100-1000]: ");
				rolls = stdIn.nextInt();
			
		}while(rolls < 100 || rolls >1000);
		
		for(int i =1; i <=rolls; i++){
			dice = (int)(Math.random()*4)+1;
			if(dice ==1){
				++v1;
			}
			else if(dice ==2){
				++v2;
			}
			else if(dice ==3){
				++v3;
			}
			else
				++v4;
		}
		
		System.out.println("v1: "+v1+"\nv2: "+v2+"\nv3: "+v3+"\nv4: "+v4);
		
		stdIn.close();
	}
	
}