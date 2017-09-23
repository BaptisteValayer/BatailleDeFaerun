package game;

import java.util.ArrayList;
import java.util.List;

public class Square {
	
	/**
	 * Army of red castle
	 */
	private ArrayList<Warrior> redArmy = new ArrayList<Warrior>();
	
	/**
	 * Army of blue castle
	 */
	private ArrayList<Warrior> blueArmy = new ArrayList<Warrior>();
	
	
	
	public ArrayList<Warrior> goInBlue(List<Warrior> warriorsMoved) {
		if(blueArmy.isEmpty()) {
			blueArmy.addAll(warriorsMoved);
		}
		else {
			ArrayList<Warrior> tempo = new ArrayList<>();
			tempo.addAll(blueArmy);
			blueArmy.clear();
			blueArmy.addAll(warriorsMoved);
			return tempo;
		}
		return null;
	}
	
	public void goOutBlue() {
		blueArmy.clear();
	}
	
	public ArrayList<Warrior> goInRed(List<Warrior> warriorsMoved) {
		if(redArmy.isEmpty()) {
			redArmy.addAll(warriorsMoved);
		}
		else {
			ArrayList<Warrior> tempo = new ArrayList<>();
			tempo.addAll(redArmy);
			redArmy.clear();
			redArmy.addAll(warriorsMoved);
			return tempo;
		}
		return null;
	}
	
	public void goOutRed() {
		redArmy.clear();
	}
	
	public void boostBArmy(List<Warrior> reinforcement) {
		blueArmy.addAll(reinforcement);
	}
	
	public void boostRArmy(List<Warrior> reinforcement) {
		redArmy.addAll(reinforcement);
	}

	public void deployBlueUnits(List<Warrior> warriors) {
		blueArmy.addAll(warriors);
	}
	/**
	 * Getter of List<Warrior> redArmy
	 * @return redArmy
	 */
	public ArrayList<Warrior> getRedArmy() {
		return redArmy;
	}

	/**
	 * Setter of List<Warrior> redArmy
	 * @param redArmy
	 */
	public void setRedArmy(ArrayList<Warrior> redArmy) {
		this.redArmy = redArmy;
	}

	/**
	 * Getter of List<Warrior> blueArmy
	 * @return blueArmy
	 */
	public ArrayList<Warrior> getBlueArmy() {
		return blueArmy;
	}

	/**
	 * Setter of List<Warrior> blueArmy
	 * @param blueArmy
	 */
	public void setBlueArmy(ArrayList<Warrior> blueArmy) {
		this.blueArmy = blueArmy;
	}
}
