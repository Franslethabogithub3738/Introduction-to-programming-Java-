import java.util.Scanner; //Scanner class is imported from java.util.package

public class DecideBursary
{//start class
	public static void main(String[] args)
	{//start main method
		
		//Declare variables
		boolean bFlag1,bFlag2,bFlag3;
		int iMarks1,iMarks2,iMarks3,iMarks4;
		double rAverage;
		
		//Instantiation of the new object
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.print("Enter marks for first subject: ");
		iMarks1 = input.nextInt();
		System.out.print("Enter marks for second subject: ");
		iMarks2 = input.nextInt();
		System.out.print("Enter marks for third subject: ");
		iMarks3 = input.nextInt();
		System.out.print("Enter marks for fourth subject: ");
		iMarks4 = input.nextInt();
		
		//Calculating average
		rAverage = ( iMarks1+iMarks2+iMarks3+iMarks4 )/4;
		
		//Set the first flag-average must be 65 or higher
		if ( rAverage >= 65 )
			bFlag1 = true;
		else
			bFlag1 = false;
		
		//Set the second flag-all grades must be 50 or higher
		if ( iMarks1 >= 50 && iMarks2 >= 50 && iMarks3 >= 50 && iMarks4 >= 50 )
			bFlag2 = true;
		else
			bFlag2 = false;
		
		//Set the third flag-at leaset on the grades must be 70 or higher
		if ( iMarks1 >= 70 ||iMarks2 >= 70 || iMarks3 >= 70 || iMarks4 >= 70 )
			bFlag3 = true;
		else
			bFlag3 = false;
		
		//Test if all three flags has been set
		if ( bFlag1 && bFlag2 && bFlag3 )
			System.out.println("Bursary awarded..!");
		else
			System.out.println("No bursary");
	}//End main method
}//End class