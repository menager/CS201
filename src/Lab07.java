import java.util.Scanner;

public class Lab07 {
   
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
       
        int n;
   
        do{
            System.out.print("Choose value for n [1-9]");
            n = stdIn.nextInt();
        }    while(!(n >=1 && n <=9));
   
        for(int line = 1; line <=n; ++line){
           
           
            for(int star = n; star >line; star--){
                System.out.print("*");
            }
         for(int dig= 1 ; dig <=line; dig++){
                System.out.print(dig);
            }
       
            System.out.println();
        }
        stdIn.close();
    }

}