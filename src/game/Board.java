package game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *	          __________        ______
 * 			  |  |  |  |        |  |  |
 * BlueCastle |  |  |  | (...)  |  |  | RedCastle
 * 			  |__|__|__|        |__|__|
 * 
 * @author bapti
 *
 */
public class Board {
	
	/**
	 * Size of board
	 */
	private int boardSize;
	
	/**
	 * The board it's a List of square
	 */
	private ArrayList<Square> board = new ArrayList<Square>();
	
	/**
	 * First castle
	 */
	private Castle blueCastle;
	
	/**
	 * Second Castle
	 */
	private Castle redCastle;
	

	/**
	 * Board class constructor
	 * @param boardSize (number of square)
	 */
	public Board(int boardSize,Castle red,Castle blue) {
		setBoardSize(boardSize);
		this.blueCastle=blue;
		this.redCastle=red;
	}

	/**
	 * Getter of Square' list
	 * @return ArrayList<Square>
	 */
	public ArrayList<Square> getBoard() {
		return board;
	}

	/**
	 * Create the board
	 */
	public void initEmptyBoard() {
		for(int i=0;i<this.boardSize;i++) {
			board.add(new Square());
		}
	}

	/**
	 * Getter of board size
	 * @return Board size
	 */
	public int getBoardSize() {
		return boardSize;
	}

	/**
	 * Setter of board size
	 * @param boardSize
	 */
	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}
	
	/**
	 * browse all Warrior contents in blueCastle->List<Warrior> warriorToDeploy and deploy it
	 */
	public void deployBlueUnit() {
		//board.get(0).deployBlueUnits(warriors);
		board.get(0).goInBlue(blueCastle.getWarriorToDeploy());
	}
	
	/**
	 * browse all Warrior contents in blueCastle->List<Warrior> warriorToDeploy and deploy it
	 */
	public void deployRedUnit() {
		board.get(board.size()-1).goInRed(redCastle.getWarriorToDeploy());
	}
	
//	public void moveToRedCastle() {
//		for(int index=(this.boardSize-2);index>=0;index--) {
//			board.get(index+1).goInBlue(board.get(index).getBlueArmy());
//		}
//	}
//	
//	public void moveToBlueCastle() {
//		for(int index=1;index<board.size();index++) {
//			board.get(index-1).goInRed(board.get(index).getRedArmy());
//		}
//	}
	
	public boolean twoArmyInThisSquare(int index) {
		if(!board.get(index).getBlueArmy().isEmpty() && !board.get(index).getRedArmy().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean redArmyInThisSquare(int index) {
		if(board.get(index).getRedArmy().isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean blueArmyInThisSquare(int index) {
		if(board.get(index).getBlueArmy().isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	public void move() {
		ArrayList<Warrior> tempor = new ArrayList<>();
		for(int x=0;x<board.size();x++) {
			if(twoArmyInThisSquare(x)) {
				if(!tempor.isEmpty()) {
					board.get(x).boostBArmy(tempor);
					tempor.clear();
				}
				continue;
			}
			else if(blueArmyInThisSquare(x) && x!=(board.size()-1)) {
				if(tempor.isEmpty()) {
					tempor.addAll(board.get(x).getBlueArmy());
					board.get(x).goOutBlue();
				}
				else {
					tempor.addAll(board.get(x+1).goInBlue(tempor));
				}
			}
			else if(redArmyInThisSquare(x) && x!=0 ) {
//				//if(tempor.isEmpty()) {
//					//tempor.addAll(board.get(x).getRedArmy());
//					//board.get(x).goOutRed();
//					if(redArmyInThisSquare(x-1)) {
//						if(twoArmyInThisSquare(x-1)/* && !tempor.isEmpty()*/) {
				
							board.get(x-1).boostRArmy(board.get(x).getRedArmy());
							board.get(x).goOutRed();
							
//						}
//						else {
//							board.get(x).boostArmy(board.get(x-1).getRedArmy(),board.get(x).getRedArmy());
//						}
//					}
				//}
				/*else {
					if(twoArmyInThisSquare(x-1) && !tempor.isEmpty()) {
						board.get(x).boostArmy(board.get(x-1).getRedArmy(), tempor);
					}
					else {
						tempor.addAll(board.get(x-1).goInRed(tempor));
					}
				}*/
			}
		}
	}
}
