import java.util.Scanner;
import java.util.ArrayList;

public class DrinksMenu{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Hvor gammel er du?");
		String input = scan.nextLine();
		int age = Integer.parseInt(input);

		ArrayList<String> drinksMenuList = new ArrayList<>();
			if(age >= 18){
				drinksMenuList.add("Gin&Tonic");
				drinksMenuList.add("Whiskey Sour");
			} else {
				drinksMenuList.add("Saftevand");
				drinksMenuList.add("Coca Cola");
				drinksMenuList.add("Lemonade");
			}

		for(String option : drinksMenuList){
			System.out.println(option);
		}

		System.out.println("Hvor mange drinks vil du bestille?");
		int numberOfDrinks = Integer.parseInt(scan.nextLine());

		ArrayList<String> choicesList = new ArrayList<>();

		while(choicesList.size() < numberOfDrinks){
			System.out.println("Vælg en drink fra listen");
			String choice = scan.nextLine();
			if(drinksMenuList.contains(choice)){
				choicesList.add(choice);
			} else {
				System.out.println("Dette er ikke en del af vores sortiment, beklager.");
			}
		}
		System.out.println("Du har valgt: " + choicesList);
	}
}