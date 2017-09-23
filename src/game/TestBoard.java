package game;

import java.util.ArrayList;

public class TestBoard {

	public static void main(String[] args) {
		Castle b = new Castle("salut");
		Castle r = new Castle("pasSalut");
		Board board = new Board(5,r,b);
		
		Elf legolas = new Elf();
		//Elf legolas2 = new Elf();
		Dwarf Gimli	= new Dwarf();
		//Dwarf Gimli2 = new Dwarf();
		board.initEmptyBoard();
		//System.out.println(board.getBoard());
		ArrayList<Warrior> t = new ArrayList<>();
		t.add(Gimli);
//		afficheBoard(board.getBoardSize(),board);
//		b.warriorOrder(legolas);
//		b.warriorOrder(legolas);
//		b.warriorOrder(legolas);
//		System.out.println(b.getWarriorOnStandby());
//		b.trainWarrior();
//		System.out.println(b.getWarriorToDeploy());
//		board.deployBlueUnit();
//		//System.out.println(b.getWarriorToDeploy());
//		afficheBoard(board.getBoardSize(),board);
//		board.move();
//		afficheBoard(board.getBoardSize(),board);
		
//		afficheBoard(board.getBoardSize(),board);
//		r.warriorOrder(legolas);
//		r.warriorOrder(legolas);
//		r.warriorOrder(legolas);
//		System.out.println(r.getWarriorOnStandby());
//		r.trainWarrior();
//		System.out.println(r.getWarriorToDeploy());
//		board.deployRedUnit();
//		//System.out.println(b.getWarriorToDeploy());
//		afficheBoard(board.getBoardSize(),board);
//		board.move();
//		afficheBoard(board.getBoardSize(),board);
		
		b.warriorOrder(legolas);
		b.warriorOrder(legolas);
		b.warriorOrder(legolas);
		r.warriorOrder(legolas);
		r.warriorOrder(legolas);
		r.warriorOrder(legolas);
		board.getBoard().get(1).setBlueArmy(t);
		b.trainWarrior();
		r.trainWarrior();
		board.deployBlueUnit();
		board.deployRedUnit();
		afficheBoard(board.getBoardSize(),board);
		board.move();
		afficheBoard(board.getBoardSize(),board);
		board.move();
		afficheBoard(board.getBoardSize(),board);
		board.move();
		afficheBoard(board.getBoardSize(),board);
		board.move();
		afficheBoard(board.getBoardSize(),board);
	}

	public static void afficheBoard(int size, Board board) {
		for(int s=0;s<size;s++) {
			System.out.println("Case -> "+s);
			System.out.println("B -> "+board.getBoard().get(s).getBlueArmy());
			System.out.println("R -> "+board.getBoard().get(s).getRedArmy());
		}
	}
}
