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

}