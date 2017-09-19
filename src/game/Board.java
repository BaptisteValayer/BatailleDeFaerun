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

	public void initEmptyBoard() {
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
	
//	public void rightToLeft() {
//		ArrayList<Warrior> temporaire = new ArrayList<>(); 
//		for(int index=(this.boardSize-2);index>=0;index--) {
//			temporaire=this.board.get(index).getSquare();
//			this.board.get(index).getSquare().clear();
//			this.board.get(index+1).getSquare().addAll(temporaire);
//		}
//	}
//	
//	public void leftToRight() {
//		ArrayList<Warrior> temporaire = new ArrayList<>(); 
//		for(int index=1;index<this.boardSize;index++) {
//			temporaire=this.board.get(index).getSquare();
//			this.board.get(index).getSquare().clear();
//			this.board.get(index-1).getSquare().addAll(temporaire);
//		}
//	}
	
	public void deployBlueUnit(Warrior warriorBlue) {
		board.get(0).getSquare().add(warriorBlue);
	}
	
	public void deployRedUnit(Warrior warriorRed) {
		board.get(board.size()-1).getSquare().add(warriorRed);
	}
	
}
