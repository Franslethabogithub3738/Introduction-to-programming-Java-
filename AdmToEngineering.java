import java.util.Scanner; //Scanner class is imported from java.util package

public class AdmToEngineering
{//start class
	public static void main(String[] args)
	{//start main method
		
		//Instantiation of the object
		Scanner input = new Scanner(System.in);
		
		//Set flags
		boolean bFlag1 = false;
		boolean bFlag2 = false;
		boolean bFlag3 = false;
		boolean bFlag4 = false;
		
		//Declare variables
		char cPhysics,cMath;
		String sSubject1,sSubject2,sSubject3,sSubject4,sSubject5,sSubject6;
		int iSubject1,iSubject2,iSubject3,iSubject4,iSubject5,iSubject6,iCount = 0;
		double rAverage;
		
		//Input
		System.out.print("Does the learner have Mathematics on his/her subjects? <Y> or <N> : ");
		cMath = input.next().charAt(0);
		System.out.print("Does the learner have physical Science on his/her subjects? <Y> or <N> : ");
		cPhysics = input.next().charAt(0);
	    input.nextLine();
		
		
		if ( cPhysics == 'Y' && cMath == 'Y' )
		{
		    System.out.print("Enter the name of the first subject: ");
		    sSubject1 = input.nextLine();
		    System.out.print("Enter the percentage for "+sSubject1+" :");
		    iSubject1 = input.nextInt();
			input.nextLine();
		    System.out.print("Enter the name of the second subject: ");
		    sSubject2 = input.nextLine();
		    System.out.print("Enter the percentage for "+sSubject2+" :");
		    iSubject2 = input.nextInt();
			input.nextLine();
		    System.out.print("Enter the name of the third subject: ");
		    sSubject3 = input.nextLine();
            System.out.print("Enter the percentage for "+sSubject3+" :");
		    iSubject3 = input.nextInt();
			input.nextLine();
		    System.out.print("Enter the name of the fourth subject: ");
		    sSubject4 = input.nextLine();
            System.out.print("Enter the percentage for "+sSubject4+" :");
		    iSubject4 = input.nextInt();
			input.nextLine();
		    System.out.print("Enter the name of the fifth subject: ");
		    sSubject5 = input.nextLine();
		    System.out.print("Enter the percentage for "+sSubject5+" :");
		    iSubject5 = input.nextInt();
			input.nextLine();
		    System.out.print("Enter the name of the sixth subject: ");
		    sSubject6 = input.nextLine();
		    System.out.print("Enter percentage for "+sSubject6+" :");
		    iSubject6 = input.nextInt();
			input.nextLine();
			
			//Set flag 1
			if ( iSubject1 > 70 && iSubject2 > 70 && iSubject3 > 70 && iSubject4 > 70 && iSubject5 > 70 && iSubject6 > 70 )
				bFlag1 = true;
			
			//At least 4 subjects must be be above 80
			if ( iSubject1 > 80 )
				iCount++;
			if ( iSubject2 > 80 )
				iCount++;
			if ( iSubject3 > 80 )
				iCount++;
			if ( iSubject4 > 80 )
				iCount++;
			if ( iSubject5 > 80 )
				iCount++;
			if ( iSubject6 > 80 )
				iCount++;
			
			//set flag 2
			if ( iCount >= 4 )
				bFlag2 = true;
			
			if ( iSubject1 >= 60 && iSubject2 >= 60 && iSubject3 >= 60 && iSubject4 >= 60 && iSubject5 >= 60 && iSubject6 >= 60 )
				bFlag3 = true;
			
			//calculate average
			rAverage = ( iSubject1 + iSubject2 + iSubject3 + iSubject4 + iSubject5 + iSubject6 )/6.0 ;
			
			if ( rAverage >= 65 )
				bFlag4 = true;
			
			if ( bFlag1 == true && bFlag2 == true && bFlag3 == true && bFlag4 == true )
				System.out.println("The learner qualifies for engineering studies...!");
			else
				System.out.print("Do not qualify..!");
			
		}
		else
			System.out.println("The learner must have both Mathematics and Physical Science in order to qualify for engineering studies..!");
		
	}//end main method
}//end class