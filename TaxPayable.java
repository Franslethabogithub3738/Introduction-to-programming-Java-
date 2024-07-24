import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat is imported from java.text package

public class TaxPayable
{//start class 
	public static void main(String[] args)
	{//start main method
		
		//instantiation of the new objects
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		//declare variables
		double rSalary,rPercTax,rTaxToPay;
		
		//input
		System.out.print("Enter salary: R");
        rSalary = input.nextDouble();
		
        //Decision making and processing
        if ( rSalary < 20000 )
            rPercTax = 0.18;
        else
            rPercTax = 0.27;

        rTaxToPay = rSalary*rPercTax;
   
        //output
		System.out.println("Your tax is R"+formatter.format(rTaxToPay));
		
	}//end main method
}//end class	