// Adit Sharma
// 8-27-24 per2
// Schedule.java
/* This program prints out my formatted course schedule using print f and the format class
 * Working on: using the print f and the cutom format class
 */ 
public class Schedule
{
	public static void main(String[] args)
	{
		// Variables on last line
		String bill = new String("Outstanding bill:");
		double amount = 34.56789;
		
		// Variables for first period
		String courseName = new String("Business");
		int periodNumber = 1;
		
		// 3 blank lines
		System.out.println("\n\n\n");
		
		// Header
		System.out.println(Format.center("Course Schedule for:",50));
		System.out.println(Format.center("Adit Sharma",50));
		
		System.out.print("\n");
		
		System.out.println(Format.left("Period",25)+Format.right("Course",25));
		
		// Period Number and Name with Variable
		System.out.printf("%-25d%25s\n",periodNumber,courseName);
		
		System.out.printf("%-25d%25s\n",2,"Java");
		System.out.printf("%-25d%25s\n",3,"Biology");
		System.out.printf("%-25d%25s\n",4,"French 2");
		
		
		System.out.printf(Format.left("5",25)+Format.right("Alg2/Trig",25)+"\n");
		System.out.printf(Format.left("6",25)+Format.right("Lit/Writing",25)+"\n");
		System.out.printf(Format.left("7",25)+Format.right("Physical Education",25)+"\n");
		
		System.out.printf("%-18s$%-6.2f",bill,amount);
		
		System.out.println("\n\n\n");
	}
}
