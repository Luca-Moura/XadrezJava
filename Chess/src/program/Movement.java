package program;

public class Movement {

	public Movement(String[][] args) {

		Board board = new Board();
		int startRow = board.getStartRow();
		int startCol = board.getStartCol();
		int endRow = board.getEndRow();
		int endCol = board.getEndCol();

		String[][] mat = board.getMat();

		int peca = 0;
		String posStart = mat[startRow][startCol];
		String posEnd = mat[endRow][endCol];

		for (int row = 0; row <= 8; row++) {
			for (int col = 0; col <= 8; col++) {
				if (mat[row][col] == posStart) { // printa quadrados vazios
					System.out.printf("%2s", "-");
					System.out.printf("%1s", " ");
					System.out.print("|");
				} else if (mat[row][col] == posEnd) {
					System.out.printf("%2s", peca);
					System.out.printf("%1s", " ");
					System.out.print("|");

				}
			}

		}
		for (int row = 0; row <= 8; row++) {
			// printa matriz
			for (int col = 0; col <= 8; col++) {
				if (mat[row][col] == null) { // printa quadrados vazios
					System.out.printf("%2s", "-"); //
					System.out.printf("%1s", " ");
					System.out.print("|");
				} else {
					System.out.printf("%2s", mat[row][col]); // printa quadrados ocupados
					System.out.printf("%1s", " ");
					System.out.print("|");
				}
			}
			System.out.println();

		}

	}
}