import java.util.*;

public class GameHelper {
private static final String ALPHABET = "abcdefg";	// constants
private static final int GRID_LENGTH = 7;
private static final int GRID_SIZE = 49;
private static final int MAX_ATTEMPTS = 200;
static final int HORIZONTAL_INCREMENT = 1;
static final int VERTICAL_INCREMENT = GRID_LENGTH;

private final int[] grid = new int[GRID_SIZE];
private final Random random = new Random();
private int shipCount = 0;

public int getUserInput(String text){
	System.out.print(text + ": ");
	Scanner sc = new Scanner(System.in);
	return sc.nextLine().toLowerCase();
}

public ArrayList<String> placeShip(int shipSize) {
	//holds index to grid (0 - 48)
	int[] shipCoordinates = new int[shipSize];
	int attempts = 0;
	boolean success = false;

	shipCount++;
	int increment = getIncrement();

	while(!success & attempts++ < MAX_ATTEMPTS) {
		int location = random.nextInt(GRID_SIZE);

		for(int i = 0; i < shipCoordinates.length; i++) {
			shipCoordinates[i] = location;
			location += increment;
		}
	}
}


}