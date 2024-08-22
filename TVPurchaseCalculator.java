import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat class is imported from java.text package

public class TVPurchaseCalculator
{//start class 
	public static void main(String[] args)
	{//start main method
		
		//Instantiation of the new object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("R0,000.00");
		
		//Constants
		final double PRICE_A =2499.00, PRICE_B = 3999.00, PRICE_C = 5799.00, INT_CHARGE= 1.7415;
		
		//Declare variables
		double rCredit = 0, rInstalment = 0;
		char cAnswer;
		
		//Input
		System.out.println("\n\tSelect a TV:");
		System.out.println("A - 32-inch TV	Price: "+formatter.format(PRICE_A));
		System.out.println("B - 40-inch TV	Price: "+formatter.format(PRICE_B));
		System.out.println("C - 55-inch TV	Price: "+formatter.format(PRICE_C));
		System.out.print("\nEnter your choice: ");
		cAnswer = input.next().charAt(0);
		
		//Processing installment based on the user's choice
		if ( cAnswer == 'A' )
	    {
			rInstalment = ( PRICE_A * INT_CHARGE )/24.0;
			rCredit = PRICE_A * INT_CHARGE;
		}
		
		if ( cAnswer == 'B' )
		{
			rInstalment = ( PRICE_B * INT_CHARGE )/24.0;
		    rCredit = PRICE_B * INT_CHARGE;
		}
		
		if ( cAnswer == 'C' )
		{
			rInstalment = ( PRICE_C * INT_CHARGE )/24.0;
			rCredit = PRICE_C * INT_CHARGE;
		}
		
		if ( cAnswer != 'A' && cAnswer != 'B' && cAnswer != 'C' )
			System.out.println("Invalid choice! Option "+cAnswer+" does not exist");
		else
		{
			System.out.println("\nPay as little as: "+formatter.format(rInstalment)+" pm x 24 months");
		    System.out.println("=========================================");
			System.out.println("\n***Credit: "+formatter.format(rCredit));
		}	
		
	}//end main method
}//end class