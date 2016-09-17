

	/*
	 * Morgan Nager
	 * Computer Science  201- 401
	 *
	 * Purpose: This program computes the volume of a shipping box
	 *
	 */

	public class Program02 {

	    public static void main(String[] args){
	       
	        double l = 22.5; // l is the length of the box in inches
	   
	        double h = 5.25; // h is the height of the box in inches
	       
	        double w = 4.0; // w is the width of the box in inches
	       
	        double v;
	        v = l * h * w; // v is the volume of the box
	       
	        // Display box dimensions and the calculated volume
	        System.out.println("Given a length of "+l+" inches");
	        System.out.println("a width of "+w+" inches");
	        System.out.println("and a height of "+h+" inches");
	        System.out.print("\n");
	        System.out.print("The box's volume is : "+v+" inches cubed");
	    }
	   
	}
