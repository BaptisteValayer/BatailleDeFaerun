package game;

public class TestBoard {

	public static void main(String[] args) {
		Board board = new Board(5);
		Elf legolas = new Elf();
		Elf legolas2 = new Elf();
		//Dwarf Gimli	= new Dwarf();
		//Dwarf Gimli2 = new Dwarf();
		board.initEmptyBoard();
		System.out.println(board.getBoard());
		//board.deployBlueUnit(Gimli);
		//board.deployBlueUnit(Gimli2);
		board.deployRedUnit(legolas);
		board.getBoard().get(3).getSquare().add(legolas2);
		for(int x=0;x<board.getBoard().size();x++) {
			System.out.println("Turn "+x);
			afficheBoard(board.getBoard().size(),board);
			//board.leftToRight();
			//board.rightToLeft(board.getBoard().get(x));
//			if(x>=1) {
//				board.getBoard().get(x-1).goOut(legolas);
//				System.out.println("caseprécédente->"+(x-1)+board.getBoard().get(x).getSquare());
//			}
//			board.getBoard().get(x).goIn(legolas);
//			System.out.println("casedujour->"+x+board.getBoard().get(x).getSquare());
		}
	}

	public static void afficheBoard(int size, Board board) {
		for(int s=0;s<size;s++) {
			System.out.println("Case -> "+s);
			System.out.println(board.getBoard().get(s).getSquare());
		}
	}
}
