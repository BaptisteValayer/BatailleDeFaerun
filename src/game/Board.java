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
	
	public void rightToLeft(Square goOut) {
		int index = board.indexOf(goOut);
		board.set(index--, goOut);
		System.out.println("win");
	}
	
	public void leftToRight(Square goOut) {
		int index = board.indexOf(goOut);
		board.set(index++, goOut);
		System.out.println("win");
	}
}
