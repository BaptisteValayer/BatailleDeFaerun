package game;

import java.util.ArrayList;

public class Board {
	
	private int boardSize;
	
	private ArrayList<Square> board = new ArrayList<Square>();

	public Board(int boardSize) {
		setBoardSize(boardSize);
	}

	public ArrayList<Square> getBoard() {
		return board;
	}

	public void initBoard() {
		for(int i=0;i<this.boardSize;i++) {
			board.add(new Square());
		}
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}
	
	public void rightToLeft(int squareIndex) {
		System.out.println("here"+squareIndex);
		board.set(squareIndex-1, board.get(squareIndex));
		board.remove(squareIndex);
	}
	
	public void leftToRight(int squareIndex) {
		System.out.println("here"+squareIndex);
		board.set(squareIndex+1, board.get(squareIndex));
		board.get(squareIndex).getSquare().clear();
	}
	
	public void deployBlueUnit(Warrior warriorBlue) {
		board.get(0).getSquare().add(warriorBlue);
	}
	
	public void deployRedUnit(Warrior warriorRed) {
		board.get(board.size()-1).getSquare().add(warriorRed);
	}
}
