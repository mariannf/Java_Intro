import java.util.Scanner;


public class Tournament {

	public static void main(String[] args) {
	
		//The main class ask for the user inputs and 
		//passes the input to the helper that will do the pairing and logic
		
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("How many teams played: ");
		int size = keyboard.nextInt();
		
		//Create the Pairing object where the Pairing is done
		
		Pairing newPairing = new Pairing(size);
		
		newPairing.getPairing();

	}

}