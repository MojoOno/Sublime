import java.util.Scanner;		//En import som gør vi kan interacte i terminal
import java.time.LocalDate;

public class Dialog{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LocalDate currentDate = LocalDate.now();

		System.out.println("Hvor gammel er du, blud?");

		//Hvis det der kommer er tekst
		//String userInput = scan.nextLine();

		//Hvis det der kommer er et helt tal
		int userInput = scan.nextInt();				//Gør sådan vi kan lave vores eget input fra terminalen
		int thisYear = currentDate.getYear();		//Et import som giver is året vi er i.
		int birthYear = thisYear-userInput;			//Nuværende år - vores user input.

		System.out.println("Du er født i år " + birthYear);

	}
	


}