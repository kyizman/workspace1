//Kyson Manis



package moveToIntelegy;

public class RollDice {

	public static void main(String[] args) {
		
		int random;
		int[] ammount = new int[11];
		double[] percent = new double[11];
		
		
		for(int x =0;x < 36000; x++)
		{
			random = (int) ((int) (1 + Math.random() * 6) + (1 + Math.random() * 6));

			
			//ammount[random-2]++;
			
			switch (random) {
			case 1:
				break;
			case 2:
				ammount[0] = (ammount[0] + 1);
				break;
			case 3:
				ammount[1] = (ammount[1] + 1);
				break;
			case 4:
				ammount[2] = (ammount[2] + 1);
				break;
			case 5:
				ammount[3] = (ammount[3] + 1);
				break;
			case 6:
				ammount[4] = (ammount[4] + 1);
				break;
			case 7:
				ammount[5] = (ammount[5] + 1);
				break;
			case 8:
				ammount[6] = (ammount[6] + 1);
				break;
			case 9:
				ammount[7] = (ammount[7] + 1);
				break;
			case 10:
				ammount[8] = (ammount[8] + 1);
				break;
			case 11:
				ammount[9] = (ammount[9] + 1);
				break;
			case 12:
				ammount[10] = (ammount[10] + 1);
				break;
			}
		}
			System.out.println("Sum"+"\t"+"Frequency"+"\t" + "Percentage");
			for (int y = 0; y < 11; y++) {
				percent[y] = ((double)ammount[y] / 36000) * 100;
				System.out.println((2 + y)+"\t" + ammount[y] +"\t"+ "\t"+ percent[y]);
			}

		}

	}
