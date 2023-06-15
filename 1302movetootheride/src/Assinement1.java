import java.util.*;
import java.util.Scanner;

public class Assinement1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] list = new double[100];
		//new array list
		list[0] = 4758.806;
		list[1] = 5795.711;
		list[2] = 5014.683;
		list[3] = 7701.312;
		list[4] = 3246.816;
		list[5] = 6989.659;
		list[6] = 5027.265;
		list[7] = 7440.575;
		list[8] = 3019.995;
		list[9] = 7241.105;
		list[10] = 7696.65;
		list[11] = 7098.486;
		list[12] = 4367.961;
		list[13] = 5519.468;
		list[14] = 2894.973;
		list[15] = 7202.648;
		list[16] = 6443.892;
		list[17] = 3033.452;
		list[18] = 3223.899;
		list[19] = 6697.127;
		list[20] = 4898.63;
		list[21] = 2467.281;
		list[22] = 2487.543;
		list[23] = 5172.012;
		list[24] = 3455.382;
		list[25] = 7849.135;
		list[26] = 3166.272;
		list[27] = 4926.252;
		list[28] = 7524.989;
		list[29] = 7755.748;
		list[30] = 6438.85;
		list[31] = 5302.584;
		list[32] = 5458.334;
		list[33] = 5804.818;
		list[34] = 3185.936;
		list[35] = 5759.344;
		list[36] = 7182.593;
		list[37] = 7735.632;
		list[38] = 6649.255;
		list[39] = 6619.317;
		list[40] = 5909.641;
		list[41] = 6634.304;
		list[42] = 7318.31;
		list[43] = 2923.583;
		list[44] = 5803.122;
		list[45] = 6958.059;
		list[46] = 5218.86;
		list[47] = 6094.804;
		list[48] = 3096.456;
		list[49] = 4922.01;
		list[50] = 7275.775;
		list[51] = 3607.358;
//list of variables used
		int i = 0;
		//int i as counter
		while (list[i] != 0) {
			i++;
			//loop for the ammount of numbers in the array
		}
		System.out.println(i + " of 100 in use");
		//to output the amount of numbers in use
		System.out.println("\n" + "Original");
		System.out.print(Arrays.toString(list));
		//lable and array that is in use

		double[] listrev = reverse(list);
		//to hold the reversed list
		
		//method to reverse the array
		System.out.println("\n" + "Reversed");
		System.out.println(Arrays.toString(listrev));
//lable and reversed array out put
		System.out.println("\n" + "Would you like to replaice a number (yes/no)");
		String answer = input.next();
		//prpmpt user if they whant to replace a number
		if (answer.equals("yes")) {
			System.out.println("\n" + "Whitch number would you like to replace.(from 1-100)");
			int location = input.nextInt();
//to prompt the user for input
			if (location > 100 || location < 1) {
				while (location < 1 || location > 100) {
//loop to check if the number is able to be used
					System.out.println("\n" + "Please put a number from 1 -100)");
					location = input.nextInt();
					//to prompt the user to put in an usable location to replace
				}
			}
			System.out.println("\n" + "And wich number would you like to replace that number");
			double hold =0;
			//to hold the replaced number
			double numberr = input.nextDouble();
//prompt user to put in a number that will replace current number in array and take input
		hold=list[location-1];
		//replaced number
			double[] rep = replace(list, location - 1.0, numberr);
			//use method to replace the number
			System.out.println("Insertion Succsesful");
			System.out.println(hold + " Has been changed to " + numberr);
//promp the user that the replacement was succesful and to output the original number and the replacer number
		}
		System.out.println("\n" + "Would you like to remove a number (yes/no)");
		String in = input.next();
		//prompt the user if they would like to remove a number
		if (in.equals("yes")) {
			System.out.println("\n" + "Whitch number would you like to remove.(from 1-100)");
			int lot = input.nextInt();
			//to take the user input if they answer yes

			if (lot > 100 || lot < 1 || list[lot - 1] == 0) {
				while (lot < 1 || lot > 100 || list[lot - 1] == 0) {

					System.out.println("\n" + "Removal failed please choose another area (1 -100)");
					lot = input.nextInt();
				}
			}
//to check wether the number they chose is valid
			double[] rom = remove(list, lot - 1);
			System.out.println("\n" + "Removal Succsesful");
			System.out.println("\n" + rom[lot - 1] + " Has been removed");
//to prompt the user that the removal was succesful witht the original out put
		}

	}

	public static double[] remove(double[] z, int loc) {
		if (loc == 1) {
			z[0] = 0.0;
		} else if (loc == 100) {
			z[99] = 0.0;
		} else {
			z[loc - 1] = 0.0;
		}
		return z;
	}
//method to remove a number
	public static double[] replace(double[] z, double d, double cha) {

		z[(int) d] = cha;

		return z;
	}
//method to replace a number
	public static double[] reverse(double[] x) {

		int up = 0;
		double[] rev = new double[x.length];
		for (int z = 99; z >= 0; z--) {
			rev[z] = x[up];
			up++;
		}

		return rev;
	};

}
//method to revers an array