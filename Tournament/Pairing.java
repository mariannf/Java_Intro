import java.util.Scanner;

public class Pairing {

	private int size;

	public Pairing(int size) {
		this.size = size;
	}

	public void getPairing() {

		Scanner keyboard= new Scanner(System.in);
		
		String[] team = new String[size];
		int[] win = new int[size];


		// Filling up the arrays with user inputs using for loops
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the name of the team");

			String teamUser = keyboard.nextLine();
			team[i] = teamUser;
			
			System.out.println("Enter the number of wins");
			int winsUser = keyboard.nextInt();
			win[i] = winsUser;
			
			//Consumes the remaining line 
			keyboard.nextLine();

		}
		// Displays the arrays
		for (int i = 0; i < size; i++)
			System.out.println("team " + team[i] + " won " + win[i]);

		// declaring variables needed for reversing the array
		int top, bottom, loops;
		String temp;

		bottom = team.length - 1;
		loops = team.length / 2;

		// creating a new Array
		String[] upsideTeam = new String[size];

		// saving the array in the new array
		for (int i = 0; i < size; i++) {
			upsideTeam[i] = team[i];

		}

		// reversing the new array list
		for (top = 0; top < loops; top++) {

			temp = upsideTeam[top];
			upsideTeam[top] = upsideTeam[bottom];
			upsideTeam[bottom] = temp;
			bottom--;

		}

		int fSize = size / 2;
		// Displaying both of the String array's top half
		for (int i = 0; i < fSize; i++) {

			System.out.println("\nGame " + (i + 1) + ": " + team[i] + " vs. "
					+ upsideTeam[i]);
		}

	}// End of getPairing method

}// End of class
