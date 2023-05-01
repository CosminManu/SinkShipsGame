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
	int[] shipCoordinates = new int[shipSize];			//current candidate coords
	int attempts = 0;
	boolean success = false;

	shipCount++;
	int increment = getIncrement();					//alternate vertical&horizontal align

	while(!success & attempts++ < MAX_ATTEMPTS) {			// MAIN SEARCH LOOP
		int location = random.nextInt(GRID_SIZE);			//get random start point

		for(int i = 0; i < shipCoordinates.length; i++) {	//create arr of proposed coords
			shipCoordinates[i] = location;			//put current loc in array
			location += increment;					//calc next location
		}
		System.out.println("Trying: " + Arrays.toString(shipCoordinates));
		
		if( ) {

		}

	}
}

private int getIncrement() {
	if(shipCount % 2 == 0) {			// if an even ship
		return HORIZONTAL_INCREMENT;		//place horizontally
	} else {						//else odd ship
		return VERTICAL_INCREMENT;		//place vertically
	}
}

private boolean startupShip(int[] shipCoords, int increment) {
	int finalLocation = shipCoords[shipCoords.length - 1];
	if(increment == HORIZONTAL_INCREMENT) {
		//check end is on same row as start
		
				
	}

}

}