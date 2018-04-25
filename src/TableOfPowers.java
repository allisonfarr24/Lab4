//Alli Farr 4-25-18 Lab 4

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		int userNum;
		int i;
		String cont;

		Scanner scan = new Scanner(System.in);

		cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please enter a number: ");
			userNum = scan.nextInt();
			scan.nextLine();

			System.out.printf("%-10s %-10s %-10s", "Number", "Squared", "Cubed");
			System.out.println();
			System.out.printf("%-10s %-10s %-10s", "=======", "=======", "======");
			System.out.println();

			for (i = 1; i <= userNum; ++i) {

				int squared = (int) Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);

				System.out.printf("%-10d %-10d %-10d", i, squared, cubed);
				System.out.println();

			}
			System.out.println();
			System.out.println("Would you like to continue?");
			cont = scan.nextLine();
		}

		scan.close();

	}

}
