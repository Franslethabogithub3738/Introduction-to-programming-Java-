import java.util.Scanner; //Scanner class is imported from java.util package

public class GuessGame
{//Start class
	public static void main(String[] args)
	{//Start main method
		
		//Instantiation of the object
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int iGuess, iComputerGenerate;
		
		//Generating a number
		iComputerGenerate = (int)(Math.random()*100+1);
		
		System.out.print("Guess a number between  1 and 100: ");
		iGuess = input.nextInt();
		
		while ( iGuess != iComputerGenerate )
		{
			if ( iGuess > iComputerGenerate )
			{
				System.out.print("Your number is too high!\nTry-again - guess a number between 1 and 100: ");
				iGuess = input.nextInt();
			}
			else 
			{
				System.out.print("Your number is too low!\nTry-again - guess a number between 1 and 100: ");
				iGuess = input.nextInt();
			}
		}
		
		//When the user guess the correct amswer
		System.out.println("Yes - the number is "+iGuess);
		
	}//End main method
}//End class