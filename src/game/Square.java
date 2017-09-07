package game;

import java.util.ArrayList;

public class Square {
	
	private ArrayList<Warrior> square = new ArrayList<Warrior>();
	
	
	public ArrayList<Warrior> getSquare() {
		return square;
	}

	public void setSquare(ArrayList<Warrior> square) {
		this.square = square;
	}
	
	public void goIn(Warrior warriorMoved) {
		square.add(warriorMoved);
	}
	
	public void goOut(Warrior warriorMoved) {
		square.remove(warriorMoved);
	}
}
