import java.util.*;

public class SinkShipGame {
	private GameHelper helper = new GameHelper();
	private ArrayList<Ship> ships = new ArrayList<Ship>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		//first make some Ships and give them locations
		Ship s1 = new Ship();
		s1.setName("Bricul Mircea");
		Ship s2 = new Ship();
		s2.setName("Bismarck");
		Ship s3 = new Ship();
		s3.setName("Kutuzov");

		ships.add(s1);
		ships.add(s2);
		ships.add(s3);

		System.out.println("Your goal is to sink three Ships");
		System.out.println("");
		System.out.println("");
	}


}