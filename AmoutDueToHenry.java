import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat' class is imported from java.text package

public class AmoutDueToHenry
{//start class
	public static void main(String[] args)
	{//start main method
		
		//instantiation of the objects
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		//declare variables
		int iNumKm, iDays;
		double rKmCost,rAmount;
		
		//input
		System.out.print("Enter the number of kilometers: ");
		iNumKm = input.nextInt();
		System.out.print("Cost per kilometer?: ");
		rKmCost = input.nextDouble();
		System.out.print("Number of days?: ");
		iDays = input.nextInt();
		
		//decision-making and processing
		if ( iNumKm > 400 )
			rAmount = ( 300+iNumKm*rKmCost*0.95 )*iDays;
		else
			rAmount = ( 300+iNumKm*rKmCost )*iDays;
		
		//output
		System.out.println("You owe R"+formatter.format(rAmount));
		
	}//end main method
}//end class	
	
		