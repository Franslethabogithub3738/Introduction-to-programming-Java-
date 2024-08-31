import java.util.Scanner; //Scanner class is imported from java.util package

public class MonthsSwitchStatement
{//Start class
	public static void main(String[] args)
	{//Start main method
		
		//Instantiation of the new object
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int iMonthNumber;
		String sMonthName;
		
		//Input
		System.out.print("Enter the month number: ");
		iMonthNumber = input.nextInt();
		
		switch ( iMonthNumber )
		{//Begin switch statement
			
			case 1 : sMonthName = "January"; break;
			case 2 : sMonthName = "February"; break;
			case 3 : sMonthName = "March"; break;
			case 4 : sMonthName = "April"; break;
			case 5 : sMonthName = "May"; break;
			case 6 : sMonthName = "June"; break;
			case 7 : sMonthName = "July"; break;
			case 8 : sMonthName = "August"; break;
			case 9 : sMonthName = "September"; break;
			case 10 : sMonthName = "October"; break;
			case 11 : sMonthName = "November"; break;
			case 12 : sMonthName = "December"; break;
			default : sMonthName = " "; break;
			
		}//End switch statement
		
		//Output
		System.out.println("Month number "+iMonthNumber+" on the calender is "+sMonthName);
		
	}//End main method
}//ENd class