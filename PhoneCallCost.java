/*The first three minutes of a phone call costs 50c per minute. The remaining minutes (everything more than 3 minutes), costs 15c 
per minute. Write pseudo code using valid variable names to calculate the total cost of a phone call when the duration of the call 
is provided.Assume the user will never enter a value less than 3.*/

import java.util.Scanner; //Scanner class is imported from java.util package
public class PhoneCallCost //New class PhoneCallCost is instantiated
{//Start class
	public static void main(String[] args) //Main method
	{//Start main method
		
		//instantiation of the new object
		Scanner input = new Scanner(System.in);
		
		//Constants
		final double FIRST_3_MINUTES_COST=0.50,REMAINING_MINUTES_COST=0.15;
		
		//Declaring variable
		int iDuration;
		double rFistCost,rRemainingMInutesCost,rCostRemaining,rTotalCost;
		
		//input
		System.out.print("Duration of call :");
		iDuration=input.nextInt();
		
		//Processing
		rFistCost=iDuration*FIRST_3_MINUTES_COST;
		rRemainingMInutesCost=iDuration*REMAINING_MINUTES_COST;
		rCostRemaining=rRemainingMInutesCost-rFistCost;
		rTotalCost=iDuration-CostRemaining;
		
		//Output
		System.out.print("The total cost is R:"+rTotalCost);
	}//End main method
}//End class	
