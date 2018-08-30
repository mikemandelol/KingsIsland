import cs1.Keyboard;
import java.util.Scanner;

public class KingsIsland
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int people;
		double park;
		double food;
		double total;
		double cost;
		double ticket=32.99;

		System.out.println("Enter the number of people: ");
		people = input.nextInt();

		System.out.println("Enter the cost of parking:$ ");
		park = input.nextDouble();

		System.out.println("Enter the amount spent on food:$");
		food = input.nextDouble();
		total= park + food + people * ticket;



		cost = total / people;


		System.out.println("King's Island Cost Report");
		System.out.println("Total Cost: " +total);
		System.out.println("Cost Per Person: " +cost);


	}
}