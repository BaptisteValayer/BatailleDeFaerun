package game;

import java.util.ArrayList;
import java.util.List;

public class Castle {
	
	/**
	 * castle name
	 */
	private String name;
	
	/**
	 * castle resource available start with 3
	 */
	private int availableResource = 3;
	
	private List<Warrior> warriorOnStandby = new ArrayList<>();

	/**
	 * Castle class constructor
	 * @param name
	 * @param warriorLearning
	 */
	public Castle(String name) {
		this.setName(name);
	}
	
	/**
	 * recursive method which create warrior while it's possible
	 * @param warriorCreate
	 */
	public void trainWarrior() {
		if(!warriorOnStandby.isEmpty()) {
			Warrior firstWarrior = warriorOnStandby.get(0);
			if(canCreate(firstWarrior)) {
				Create(firstWarrior);
				trainWarrior();
			}
		}
	}

	/**
	 * remove warrior to list warriorOnStandby and decrease ressource'qantity
	 * @param firstWarrior
	 */
	public void Create(Warrior firstWarrior) {
		warriorOnStandby.remove(0);
		decreaseRessource(firstWarrior.getCost());
	}

	/**
	 * test if have enough resource to create asked warrior
	 * @param warriorCreate
	 * @return true if can create warrior asked
	 */
	public boolean canCreate(Warrior warriorCreate) {	
		return !(this.availableResource-warriorCreate.getCost()<0);
	}

	/**
	 * commmand warrior
	 * @param warriorOrdered
	 */
	public void warriorOrder(Warrior warriorOrdered) {
		warriorOnStandby.add(warriorOrdered);
	}
	/**
	 * increase castle available resource by 'resourceWin'
	 * @param resourceWin
	 */
	public void increaseRessource(int resourceWin) {
		this.setAvailableResource(this.getAvailableResource()+resourceWin);
	}
	
	/**
	 * decrease castle available resource by 'unitCost'
	 * @param unitCost
	 */
	public void decreaseRessource(int unitCost) {
		this.setAvailableResource(this.getAvailableResource()-unitCost);
	}
	
	//----------------------------getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvailableResource() {
		return this.availableResource;
	}

	public void setAvailableResource(int availableResource) {
		this.availableResource = availableResource;
	}

	public List<Warrior> getWarriorOnStandby() {
		return warriorOnStandby;
	}
}
