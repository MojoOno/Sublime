public class TerningeSpil{

public static void main(String[] args){

	Die d4 = new Die(4);
	Die d6 = new Die(6);
	Die d8 = new Die(8);
	Die d10 = new Die(10);
	Die d12 = new Die(12);
	Die d20 = new Die(20);
	Die d100 = new Die(100);



	int etD4 = d4.throwDie();
	int etD6 = d6.throwDie();
	int etD8 = d8.throwDie();
	int etD10 = d10.throwDie();
	int etD12 = d12.throwDie();
	int etD20 = d20.throwDie();
	int etD100 = d100.throwDie();

	System.out.println("Du har slået en " + etD6 + "'er");
	System.out.println("Du har slået en " + etD10 + "'er");
}

}