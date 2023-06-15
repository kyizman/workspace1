
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 6

import java.util.Scanner;

public class TaxTable {
	public static void main(String[] args) {
		// new scanner
		Scanner input = new Scanner(System.in);
		// alot of this code is revised from the book 3.5 and eddited
		// Prompt the user to enter filing your status and taking input
		System.out.print(
				"(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately,\n 3-head of "
						+ "household) Enter the filing yourstatus: ");

		int answer = input.nextInt();
		// declair i as 50000

		double i = 50000;
		// if single filer
		if (answer == 0) {
			// outut the lables and top line
			System.out.println("\t" + "Taxable");
			System.out.println("\t" + "Income" + "\t" + "\t" + "Single");
			System.out.println("_________________________________");
			// to loop till 60000 at 50s
			for (; i <= 60000; i += 50)
				// output the ammount being taxed and the tax itself
				System.out.print("\t" + i + "\t" + "\t" + (Math.round(computeTax(answer, i)) + "\n"));

		}
		// if the filer is married or a qualifying widow(er)
		else if (answer == 1) {
			// lables for the taxed and taxed income
			System.out.println("\t" + "Taxable" + "\t" + "\t" + "married jointly");
			System.out.println("\t" + "Income" + "\t" + "\t" + "or qualifying widow(er)");
			System.out.println("___________________________________________________");
			// to loop till 60000 by 50s
			for (; i <= 60000; i += 50)

				// output the ammount being taxed and the tax itself
				System.out.print("\t" + i + "\t" + "\t" + (Math.round(computeTax(answer, i)) + "\n"));

		}
		// if married sepratly
		else if (answer == 2) {
			// lables for the chart
			System.out.println("\t" + "Taxable" + "\t" + "\t" + "married");
			System.out.println("\t" + "Income" + "\t" + "\t" + " seprately");
			System.out.println("_________________________________");
			// loop until i = 60000 by 50s
			for (; i <= 60000; i += 50)

				// output the ammount taxed and the tax
				System.out.print("\t" + i + "\t" + "\t" + (Math.round(computeTax(answer, i)) + "\n"));

		}
		// if the user is filing head of household
		else if (answer == 3)
			// lables for the graph
			System.out.println("\t" + "Taxable Income" + "\t" + "\t" + "Head of Household");

		System.out.println("___________________________________________________________");
		// loop till 60000 by 50s
		for (; i <= 60000; i += 50)

			// output the tax and taxable income
			System.out.print("\t" + i + "\t" + "\t" + "\t" + "\t" + (Math.round(computeTax(answer, i)) + "\n"));

	}

	// get the tax ammount
	public static double computeTax(int status, double taxableincome) {
		// declair variables
		int yourstatus = status;
		double income = taxableincome;

		// Compute tax
		double tax = 0;

		if (yourstatus == 0) { // Compute tax for single filers
			// get tax if taxable ammount is less than 8350
			if (income <= 8350) {
				tax = income * 0.10;

			}
			// if taxable ammount is less than 33950 get tax
			else if (income <= 33950) {
				tax = 8350 * 0.10 + (income - 8350) * 0.15;

			}
			// if taxable is less than 82250 get tax
			else if (income <= 82250) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

			}
			// if taxable ammount is less than 171550 get tax
			else if (income <= 171550) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

			}
			// if income is less than 372950 get tax
			else if (income <= 372950) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (income - 171550) * 0.33;

			} // if not valid to the others
			else {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;

			}
		} else if (yourstatus == 1) { //
			// Compute tax for married file jointly or qualifying widow(er)
			// if income is less than or equal too 16700
			if (income <= 16700) {
				tax = income * 0.10;

			}
			// if income is lessthan or equal too 67900
			else if (income <= 67900) {
				tax = 16700 * 0.10 + (income - 16700) * 0.15;

			}
			// if income is less than or equal too 137050
			else if (income <= 137050) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;

			}
			// if income is less than or equal too 208850
			else if (income <= 208850) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;

			}
			// if income is lessthan or equal too 372950
			else if (income <= 372950) {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (income - 208850) * 0.33;

			}
			// if income is greater than 372950
			else {
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (372950 - 208850) * 0.33 + (income - 372950) * 0.35;

			}
		} else if (yourstatus == 2) { // Compute tax for married separately
			// if income is lessthan or equal too 8350
			if (income <= 8350) {
				tax = income * 0.10;

			}
			// if income is less than or equal too 33950
			else if (income <= 33950) {

				tax = 8350 * 0.10 + (income - 8350) * 0.15;

			}
			// if income is less than or equal too 68525
			else if (income <= 68525) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

			}
			// if income is less than or equal too 104425
			else if (income <= 104425) {
				tax = 8350 * 0.10 + (68525 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
				;
			}
			// if taxable incoume is lessthan or equal too 186475
			else if (income <= 186475) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (income - 104425) * 0.33;

			}
			// if the taxable income is bigger than 186475
			else {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68526 - 33950) * 0.25 + (104425 - 68526) * 0.28
						+ (186475 - 104425) * 0.33 + (income - 186475) * 0.35;

			}
		} else if (yourstatus == 3) { // Compute tax for head of household

			// if taxable ammount is less than or equal too 11950
			if (income <= 11950) {
				tax = income * 0.10;

			}
			// if taxable ammount is lessthan or equal too 45500
			else if (income <= 45500) {
				tax = 11950 * 0.10 + (income - 11950) * 0.15;

			}
			// if taxable ammmount is less than or equal too 117450 get tax
			else if (income <= 117450) {
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;

			} else if (income <= 190200) {
				// if taxable ammount is less than or equal to 190200
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;

			}
			// if taxable ammount is lessthan or equal to 372950
			else if (income <= 372950) {
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (income - 190200) * 0.33;

			} else
			// if taxable ammount is biger than the other ammounts
			{
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (372950 - 190200) * 0.33 + (income - 372950) * 0.35;

			}
		}
		// to return the tax
		return tax;

	}
}
