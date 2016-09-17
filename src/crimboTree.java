
public class crimboTree {
	
	public static void main(String[] args){
		int n =4;
		
		for(int line =1; line <= n; line++){
		
			for(int sp = n; sp >= line; sp--){
				System.out.print(" ");
			}
		
			for(int dig = line; dig >=1; dig--){
				System.out.print(dig);
				
			}
			
			for(int dig = 1; dig <= line; dig++){
				System.out.print(dig);
			}
					
		
			System.out.println();
			
		
		}
		
		
		
	}
}
