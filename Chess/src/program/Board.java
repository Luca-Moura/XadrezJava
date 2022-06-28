package program;

public class Board {

	private int x = 9;
	private int y = 9;
	private String[][] mat = new String[x][y];

	private int startRow = 0;
	private int startCol = 0;
	private int endRow = 0;
	private int endCol = 0;


	public String[][] getMat() {
		return mat;
	}

	public void setMat(String[][] mat) {
		this.mat = mat;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getStartCol() {
		return startCol;
	}

	public void setStartCol(int startCol) {
		this.startCol = startCol;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getEndCol() {
		return endCol;
	}

	public void setEndCol(int endCol) {
		this.endCol = endCol;
	}

	public String[][] resetBoard() {
		// valores da linha
		mat[0][0] = "8";
		mat[1][0] = "7";
		mat[2][0] = "6";
		mat[3][0] = "5";
		mat[4][0] = "4";
		mat[5][0] = "3";
		mat[6][0] = "2";
		mat[7][0] = "1";
		mat[8][0] = "@";
		// valores da coluna
		mat[8][1] = "a";
		mat[8][2] = "b";
		mat[8][3] = "c";
		mat[8][4] = "d";
		mat[8][5] = "e";
		mat[8][6] = "f";
		mat[8][7] = "g";
		mat[8][8] = "h";
		mat[2][5] = "WP";

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
		return mat;

	}
}