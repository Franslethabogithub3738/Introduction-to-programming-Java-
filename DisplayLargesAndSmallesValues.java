import java.util.Scanner; //Scanner class is imported from java.util package

public class DisplayLargesAndSmallesValues
{//start class
	public static void main(String[] args)
	{//main method
		
		//instantiation of the new object
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int iValue1,iValue2,iFirst,iSecond,iFirstValue,iSecondValue;
		
		//input
		System.out.print("Enter first value: ");
		iValue1 = input.nextInt();
		System.out.print("Enter second value: ");
		iValue2 = input.nextInt();
		
		//decision
		if ( iValue1> iValue2 )
		{//start if-block
			iFirst = iValue1;
			iSecond = iValue2;
		}//end if-block
		else
		{//start else-block
			iFirst = iValue2;
			iSecond = iValue1;
		}//end else-block
		
		//output
		System.out.println("Largest value is "+iFirst+" and smallest value is "+iSecond);
		
	}//end main method
}//end class
	
		