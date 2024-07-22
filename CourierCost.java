import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat class is imported from java.text package

public class CourierCost
{//start class
	public static void main(String[] args)
	{//Main method
		
		//Instantiation of the new object
		Scanner input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		//Constants
		final int VAT = 15, INSURE_PER = 11;
		final double PER_KG = 5.5, ROAD = 0.8, TRAIN = 0.5, AIR = 1.5;
		
		//Declare variables
		double rMass, rKM, rTotal, rTransp = 0;
		char cTrans , cInsure;
		
		//Input
		System.out.print("Number of KG to transport:\t\t\t                 ");
		rMass = input.nextDouble();
		System.out.print("Number of KM:\t\t\t                                 ");
		rKM = input.nextDouble();
		System.out.print("Is the transport by <R>oad, <T>rain or <A>air?\t\t\t ");
		cTrans = input.next().charAt(0);
		System.out.print("Insurance <Y>es or <N>o\t\t\t                         ");
		cInsure = input.next().charAt(0);
		
		//Set the transport cost based on the mode of travel
		if ( cTrans=='R' )
			rTransp = ROAD;
		if ( cTrans == 'T' )
			rTransp = TRAIN;
		if ( cTrans == 'A' )
			rTransp = AIR;
		
		//Calculate the cost based mass and the distance
		rTotal = rMass*PER_KG+rTransp*rKM;
		
		//Add insurance cost if chosen
		if ( cInsure == 'Y')
			rTotal = rTotal+INSURE_PER*rTotal;
		
		//Add VAT to the total
		rTotal = rTotal+ VAT/100.0*rTotal;
		
		//Output
		System.out.println("You need to pay:\t\t\t                         R"+fmt.format(rTotal));
	
	}//End main method
}//End class	
	