import java.util.Scanner;
import java.util.*;

public class testing2
{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		int num1, num2, sum;
		char choice;

		do{

			System.out.print("Enter a number: ");
			num1 = input.nextInt();
			System.out.print("Enter another number: ");
			num2 = input.nextInt();
			sum = num1 + num2;
			System.out.print("Sum is: " + sum);
			System.out.println("\n");

			System.out.println("Another process? (Y-Yes , N-No)";
			choice = input.next().charAt(0);
			while(choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N'){
			System.out.println("Invalid choice. Please enter 'y' for yes or 'n' for no:");
			choice = input.next().charAt(0);
		}
		System.out.println();
	} while(choice == 'y' || choice == 'Y');
}
}