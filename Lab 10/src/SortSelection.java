import java.util.*;
public class SortSelection {

	public static void main (String[] args)
	{
		
	boolean cont = false;
		do{
		Scanner input = new Scanner(System.in);
		//prompt the user to input the ammount of inputs and take input
	System.out.println("How many names are you inputing?");
	int ammount = input.nextInt();
	//set the length of array names
		String[] names = new String[ammount];
	//loop for the names to be entered	
		for(int i = 0; i<ammount; i++ )
		{//prompt the user for the name and take input into the array
			System.out.println("Enter a Name");
			String enterednames = input.next();
			names[i] =enterednames;
		
		}//output the original array and and lable
		System.out.println("Original array");
	System.out.println(Arrays.toString(names));
	//output the sortedarray and the lable
	System.out.println("Sorted array");
	System.out.println(Arrays.toString(selectionSort(names)));
	
		// prompt the users if they would like to re run the program
		System.out.println("Would you Like to Run the Program Again? (yes/no)");
		// take user input

		String rerun = input.next();
		// if they would like to re run the program changes cont to true
		if (rerun.equalsIgnoreCase("yes"))
			cont = true;

		// terminates program if no loop is needed
		else {
			cont = false;
			System.out.println(" Thank You For your time");
		}


				}while (cont);// resets do wile



			}
	//to sort the array
	 public static String[] selectionSort(String[] list) {
			 //loop for the spot in the array
			 for (int i = 0; i < list.length; i++) {

		            
//set number to i
		            int number = i;
//loop to compair the  strings
		            for (int x = i; x < list.length; x++) {

		                if (list[x].compareTo(list[i]) < 0) {

		                    number = x;

		                }
		            }
		            // changes the value
		            String sort = list[i];

		            list[i] = list[number];

		            list[number] = sort;
		            
		            
		        }
			 //returns list
				return list;
//willy helped me figure it out
		 }
	 }

		        

		    