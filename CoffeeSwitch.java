import java.util.Scanner; //Scanner class is imported from java.util package

public class CoffeeSwitch
{//Start class
	public static void main(String[] args)
	{//Start main method
		
		//Instantiation of object
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int iNumber;
		String sChoice,sMessage;
		double rPrice = 0;
		
		//Input
		System.out.println("Coffee sizes: 1=small 2=medium 3=large 4=extra-large");
		System.out.println("Please enter your selection <1>,<2>,<3> or <4>");
		iNumber = input.nextInt();
		
		switch ( iNumber )
		{//Start switch-block
			
			case 1 : 
			sChoice = "small";
			rPrice = 10;
			sMessage = "You chose:"+sChoice+". You must pay R" + rPrice;
			break;
			
			case 2 :
			sChoice = "medium";
			rPrice = 12.5;
			sMessage = "You chose:"+sChoice+". You must pay R" + rPrice;
			break;
			
			case 3 :
			sChoice = "Large";
			rPrice = 18;
			sMessage = "You chose:"+sChoice+". You must pay R" + rPrice;
			break;
			
			case 4 :
			sChoice = "extra-Large";
			rPrice = 20;
			sMessage = "You chose:"+sChoice+". You must pay R" + rPrice;
			break;
			
			default :
			sMessage ="An invalid selection. Please select 1, 2, 3 or 4";
			break;
			
		}//End switch-block
		
		//Output
		System.out.println(sMessage);
		
	}//End main method
}//End class
			
