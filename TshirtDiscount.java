import java.util.Scanner; //Scanner class is imported from java.util package

public class TshirtDiscount //new class TshirtDiscount  is instantiated
{//start class
	public static void main(String[] args)
	{//start main method
		
		//instatiating input object based on the Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declaration
		int iNumTshirts;
		double rPrice1Tshirt,rAmoutDue;
		
		//input
		System.out.print("Enter the number of T-Shirts: ");
		iNumTshirts = input.nextInt();
		System.out.print("Cost of one T-Shirt: R");
		rPrice1Tshirt = input.nextDouble();
		
		//processing
		rAmoutDue = iNumTshirts*rPrice1Tshirt;
		
		System.out.println("Cost is R: "+rAmoutDue);
		
		if ( rAmoutDue > 200)
		{//begin of the if-block-statement to execute if the condition is trus
			rAmoutDue = rAmoutDue*0.9; //Give 10% discount - keep 90% of the price
		}//end if-block
		System.out.println("You need to pay R"+rAmoutDue);
	}//end main method
}//end class	