import java.util.Scanner;
public class display
	{
	public static void numberOfGroups()
		{
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Would you like to sort by group size or group number?");
		System.out.println("\t (1) Group Size");
		System.out.println("\t (2) Group Number");
		System.out.println("\t (3) Print Roster");
		int sizeOrNumber = userIntInput.nextInt();
	
		
		if(sizeOrNumber==1)
			{
			// group size
			System.out.println("What group size do you want?");
			int groupSize = userIntInput.nextInt();
			}
		else if(sizeOrNumber == 2)
			{
			//group Number
			System.out.println("How many groups do you want?");
			int groupNumber = userIntInput.nextInt();
			}
		else if(sizeOrNumber == 3)
			{
			//print roster
			}
		else
			{
			System.out.println("That is not an option. Please restart the program and try again");
			}

		}
	}
