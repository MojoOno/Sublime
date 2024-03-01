import java.util.Random;

public class Die{			//This is our Die-class

	int sides;

	Die(int sides){	//This is our Die-Constructor
		this.sides = sides;


	}

	int throwDie(){		//This method is how we throw the die and must return an int

		Random dieThrow = new Random();
			return dieThrow.nextInt(sides)+1;
		}
	
	
}