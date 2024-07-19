import java.util.Scanner; //Importing Scanner class from java.util package

public class ChooseClothes //The class name ChooseClothes is instantiated
{//Start class
	public static void main(String[] args)
	{//Start main method
		
		//Instantiating an input object based on the Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declarations
		double rTemp;
		
		//Input
		System.out.print("What is the temperature? ");
		rTemp = input.nextDouble();
		
		//Decisions
		if ( rTemp < 20) //Test the condition
		{//begin the if-block-statement to execute if the condition is true
			
			System.out.println("Take a warm jacket.");
		}//end the if-block
		System.out.println("Go to class.");
	
	}//end main method
}//End class	