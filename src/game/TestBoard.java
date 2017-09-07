package game;

public class TestBoard {

	public static void main(String[] args) {
		Board board = new Board(5);
		Elf legolas = new Elf();
		System.out.println("avant deploiement"+board.getBoard());
		board.initBoard();
		System.out.println("après deploiement"+board.getBoard());
		
		for(int x=0;x<board.getBoard().size();x++) {
			System.out.println("Turn "+x);
			if(x>=1) {
				board.getBoard().get(x-1).goOut(legolas);
				System.out.println("caseprécédente->"+(x-1)+board.getBoard().get(x).getSquare());
			}
			board.getBoard().get(x).goIn(legolas);
			System.out.println("casedujour->"+x+board.getBoard().get(x).getSquare());
		}
	}

}
