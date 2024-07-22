import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat is imported from java.text package 

public class BuyTicket
{//start class
	public static void main(String[] args)
	{//Main method
		
		//Instantiation of the objects
		Scanner input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		//Declare variables
		int iAge;
		double rCostTicket;
		
		//inputt
		System.out.print("Enter age: ");
		iAge = input.nextInt();
		
		//decision and output
		if ( iAge <= 18 )
		{//begin of if-block
			rCostTicket = 45.50;
		}//end if-block
        else
		{//begin else-block
	        rCostTicket = 60.00;
		}//end else-block
		System.out.println("You need to pay R:"+fmt.format(rCostTicket));
		
	}//End main method
}//End class	
			