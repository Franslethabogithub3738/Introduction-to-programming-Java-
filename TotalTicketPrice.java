import java.util.Scanner;
import java.text.DecimalFormat;

public class TotalTicketPrice
{//start class
	public static void main(String[] args)
	{//start main method
		
		//instantiation of the new objects
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		//declare variables
		int iNumPeople;
		double rTicketPrice,rTotalAmount;
		
		//input
		System.out.print("Enter the number of people in the group: ");
		iNumPeople = input.nextInt();
		
		//decision and processing
		if ( iNumPeople > 35)
		{//start if-block
			rTicketPrice = 500;
			rTotalAmount = rTicketPrice*iNumPeople;
		}//end if-block
		else
		{//start else-block
			rTicketPrice = 550;
			rTotalAmount = rTicketPrice*iNumPeople;
		}//end else-block
		
		//output
		System.out.println("The total amount for all the tickets: R"+formatter.format(rTotalAmount));
		
	}//end main method
}//end class	
		