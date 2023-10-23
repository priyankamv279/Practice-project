package practice_project;

import java.util.Scanner;

public class Arithemetic_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		

		while (true) {
			System.out.println("Arithemetic Calculator");
			System.out.println("Select an operation to Perform:");
			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");
			System.out.println("5. Exit");

			System.out.println("\nEnter the choice 1/2/3/4/5? ");
			choice = sc.nextInt();

			if(choice == 1) {
				System.out.print("Enter the first number: ");
				double num1 = sc.nextDouble();

				System.out.print("Enter the second number: ");
				double num2 = sc.nextDouble();
				
				double Result = num1 + num2;
				System.out.println("Result = " +Result);
				break;
			}

			else if(choice == 2) {
				System.out.print("Enter the first number: ");
				double num1 = sc.nextDouble();

				System.out.print("Enter the second number: ");
				double num2 = sc.nextDouble();
				
				double Result = num1 - num2;
				System.out.println("Result = " +Result);
				break;
			}

			else if(choice == 3) {
				System.out.print("Enter the first number: ");
				double num1 = sc.nextDouble();

				System.out.print("Enter the second number: ");
				double num2 = sc.nextDouble();
				
				double Result = num1 * num2;
				System.out.println("Result = " +Result);
				break;
			}

			else if(choice ==4) {
				System.out.print("Enter the first number: ");
				double num1 = sc.nextDouble();

				System.out.print("Enter the second number: ");
				double num2 = sc.nextDouble();
				
				double Result = num1 / num2;
				System.out.println("Result = " +Result);
				break;
			}
			
			else if(choice == 5) {
				System.out.println("Exit\n");
				break;
			}
			
			else{
				System.out.println("Incorrect. Enter the choice again\n");
				
			}
			
		}

	}
}