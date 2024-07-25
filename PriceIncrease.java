import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat class is imported from java.text package

public class PriceIncrease
{//start class
	public static void main(String[] args)
	{//start main method
		
		//instantiation of the new object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		//declare variables
		double rPriceItem,rNewPrice;
		int iDepartmentNumber;
		
		//input
		System.out.print("Enter the price of an item: ");
		rPriceItem= input.nextDouble();
		System.out.print("Enter the department number between dartment<1> and department<3>: ");
		iDepartmentNumber = input.nextInt();
		
		//decision and processing
		if ( iDepartmentNumber == 1 )
			rNewPrice = rPriceItem+(rPriceItem*0.5);
		else
			rNewPrice = rPriceItem+(rPriceItem*1.07);
		//output
		System.out.println("The new price: R"+formatter.format(rNewPrice));
		
	}//end main method
}//end class	