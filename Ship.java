import java.util.*;

public class Ship {
	private ArrayList<String> locationCells;
	private String name;

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return this.name;
	}

	void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}

	public String checkYourself(String userInput) {	//accept user input (eg A3, B5 etc)
		String result = "miss";

		int index = locationCells.indexOf(userInput);
		if(index >= 0){	
			locationCells.remove(index);		//if user input is guessed then first remove it from the list
			if(locationCells.isEmpty()){		//if list empty this was killing blow!
				result = "kill";
			} else {
				result = "hit";
			}
		}

		return result;

	}
	
}