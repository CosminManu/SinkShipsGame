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
		
		if(shipFits(shipCoordinates, increment)) {		//if ship fits on the grid
			success = coordsAvailable(shipCoordinates);
		}

	}
	savePositionToGrid(shpiCoordinates);	// coordinates passed checks, save
	ArrayList<String> alphaCells = convertCoordsToAlphaFormat(shipCoordinates);

	System.out.println("Placed at: " + alphaCells);
	return alphaCells;

}

private int getIncrement() {
	if(shipCount % 2 == 0) {			// if an even ship
		return HORIZONTAL_INCREMENT;		//place horizontally
	} else {						//else odd ship
		return VERTICAL_INCREMENT;		//place vertically
	}
}

private boolean shipFits(int[] shipCoords, int increment) {
	int finalLocation = shipCoords[shipCoords.length - 1];
	if(increment == HORIZONTAL_INCREMENT) {
		//check end is on same row as start
		return calcRowFromIndex(startupCoords[0] == calcRowFromIndex(finalLocation);
	} else {
		return finalLocation < GRID_SIZE;		//check end isn't off the bottom
	}
}

private boolean coordsAvailable(int[] shipCoords) {
	for(int coord : shipCoords){			// check all potential positions
		if(grid[coord] != 0){			//this position already taken
			System.out.println("position: " + coord + " already taken.");
			return false;
		}
	}
	return true;		// no clashes
}

private void savePositionToGrid(int[] shipCoords) {
	for(int index : shipCoords) {
		grid[index] = 1;				//mark grid position as used'' 
	}

}

}