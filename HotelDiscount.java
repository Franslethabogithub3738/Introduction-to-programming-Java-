import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat class is imported from java.text package

//@Author Lethabo Matsi

public class HotelDiscount
//Start class
	public static void main(String[] args)
	{//Start main method
		
		//Instantiation of objects
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("R,##0.00");
		
		//Declare variables
		double rHotelBill, rDiscount = 0, rTotalDiscount = 0;
		int iNumActivities;
		int iCounter = 0;
		int iOption = 0;
		
		//Declare constants
		final double ZIP_LINING = 0.1;
		final double HORSE_RIDING = 0.125;
		final double SITE_SEEING = 0.0;
		final double SPEED_BOAT = 0.1;
		
		//Input
		System.out.print("How much is your original hotel bill: R");
		rHotelBill = input.nextDouble();
		System.out.println("");
		System.out.print("");
		System.out.print("How many activities did you do?: ");
		iNumActivities = input.nextInt();
		while ( iNumActivities < 0 || iNumActivities > 4 )
		{
			System.out.println("You should only enter an integer from 0 to 4 ");
			System.out.print("Please re-enter the number of activities you did: ");
			iNumActivities = input.nextInt();
		}
		System.out.println("");
		
		while ( iNumActivities != iCounter )
		{//Begin while
			iCounter++;
			System.out.println("Activities		Discount");
			System.out.println(" ");
			System.out.println("1. Zip-lining		10%");
			System.out.println("2. Horse riding		12.5%");
			System.out.println("3. Site seeing		0%");
			System.out.println("4. Speedboat		10%");
			System.out.print("Pick your activity no "+iCounter+" < options 1 to 4>: ");
			iOption = input.nextInt();
		while ( iOption < 0 || iOption > 4 )
		{
			System.out.println("You should only enter an integer from 1 to 4 ");
			System.out.print("Please re-enter your activity number: ");
			iOption = input.nextInt();
		}
			
			switch ( iOption )
			{//Begin switch
				case 1:
					rDiscount = rHotelBill*ZIP_LINING;
					rTotalDiscount += rDiscount;
				break;
				
				case 2:
					rDiscount = rHotelBill*HORSE_RIDING;
					rTotalDiscount += rDiscount;
				break;
				
				case 3:
					rDiscount = rHotelBill*SITE_SEEING;
					rTotalDiscount += rDiscount;
				break;
				
				case 4:
					rDiscount = rHotelBill * SPEED_BOAT;
					rTotalDiscount += rDiscount;
				break;
			}//End switch
			
			//Output
			System.out.println("So far, your discount is :"+formatter.format(rTotalDiscount));
			System.out.println("");
		}//End while
		
		//Final Discount
		System.out.println("Your total discount is: "+formatter.format(rTotalDiscount));
		rHotelBill -= rTotalDiscount;
		System.out.println("After discount, your bill will be "+formatter.format(rHotelBill));
		
	}//End main method
}//End class
