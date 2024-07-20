import java.util.Scanner;
import java.text.DecimalFormat;

public class FinanceCalculat
{//Start class
	public static void main(String[] args)
	{//Start main method
		
		//Instantiation of objects
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat();
		
		//Constants
		final double ANNUAL_INTEREST_RATE = 0.0525;
		
		//Declare variables
		double rSimpleInterest,rCompoundinterest,rCompoundInterestQuart,rInitialAmt;
		int iNumYrs;
		
		//Inputs
		System.out.print("Please enter the amount to invest: R");
		rInitialAmt = input.nextDouble();
		System.out.print("How many years do you wish to invest for:  ");
		iNumYrs = input.nextInt();
		
		//processing
		rSimpleInterest =Math.round((((rInitialAmt*ANNUAL_INTEREST_RATE*iNumYrs)*10)/10.0));
		rCompoundinterest = Math.round((rInitialAmt*Math.pow(1+ANNUAL_INTEREST_RATE,iNumYrs)-rInitialAmt*10)/10.0);
		rCompoundInterestQuart = Math.round(((rInitialAmt*Math.pow(1+(ANNUAL_INTEREST_RATE/4),4*iNumYrs)-rInitialAmt)*10)/10.0);
		
		//Output
		System.out.println("Investmenent results @5.25% Interest:");
		System.out.println("--------------------------------------------------");
		System.out.println("Option                          |Interest earned");
		System.out.println("Simple interest                 |R"+rSimpleInterest);
		System.out.println("Compound Interest(Yearly)\t|R"+rCompoundinterest);
		System.out.println("Compound Interest(Quarterly)\t|R"+rCompoundInterestQuart);
		System.out.println("--------------------------------------------------");
		System.out.println("                                                ");
		System.out.println(">>>The best performing option yields: R"+rCompoundInterestQuart);
		
		
	}//End main method
}//End class	
		