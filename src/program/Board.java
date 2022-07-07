package program;

public class Board {

	public int x = 9; // numero de linhas da matriz
	public int y = 9; // numero de colunas da matriz
	public String[][] mat = new String[x][y]; // Matriz do jogo

	public int startRow = 0; // Linha inicial da peca
	public int startCol = 0; // Coluna inicial da peca
	public int endRow = 0; // Linha final da peca
	public int endCol = 0; // Coluna final da peca

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
		mat[8][1] = " a ";
		mat[8][2] = " b ";
		mat[8][3] = " c ";
		mat[8][4] = " d ";
		mat[8][5] = " e ";
		mat[8][6] = " f ";
		mat[8][7] = " g ";
		mat[8][8] = " h ";
		// Posi��o inicial das pe�as
		mat[1][1] = "WP ";
		mat[1][2] = "WP ";
		mat[1][3] = "WP ";
		mat[1][4] = "WP ";
		mat[1][5] = "WP ";
		mat[1][6] = "WP ";
		mat[1][7] = "WP ";
		mat[1][8] = "WP ";
		mat[6][1] = "BP ";
		mat[6][2] = "BP ";
		mat[6][3] = "BP ";
		mat[6][4] = "BP ";
		mat[6][5] = "BP ";
		mat[6][6] = "BP ";
		mat[6][7] = "BP ";
		mat[6][8] = "BP ";
		mat[0][1] = "WR ";
		mat[0][2] = "WN ";
		mat[0][3] = "WB ";
		mat[0][4] = "WK ";
		mat[0][5] = "WQ ";
		mat[0][6] = "WB ";
		mat[0][7] = "WN ";
		mat[0][8] = "WR ";
		mat[7][1] = "BR ";
		mat[7][2] = "BN ";
		mat[7][3] = "BB ";
		mat[7][4] = "BQ ";
		mat[7][5] = "BK ";
		mat[7][6] = "BB ";
		mat[7][7] = "BN ";
		mat[7][8] = "BR ";

		for (int row = 0; row <= 8; row++) {
			// printa matriz
			for (int col = 0; col <= 8; col++) {
				if (mat[row][col] == null) { // printa quadrados vazios
					System.out.printf("%1s", " - ");
					System.out.print("|");
				} else {
					System.out.printf("%2s", mat[row][col]); // printa quadrados ocupados
					System.out.print("|");
				}
			}
			System.out.println();

		}
		return mat;

	}

	public String[][] showBoard() {
		for (int row = 0; row <= 8; row++) {
			// printa matriz
			for (int col = 0; col <= 8; col++) {
				if (mat[row][col] == null) { // printa quadrados vazios
					System.out.printf("%1s", " - ");
					System.out.print("|");
				} else {
					System.out.printf("%2s", mat[row][col]); // printa quadrados ocupados
					System.out.print("|");
				}
			}
			System.out.println();

		}

		return mat;
	}

	public int showKing() { //Verifica se o Rei esta vivo. 0 Ambos Vivos, 1 White vivo, 2 Black vivo
		int count = 0; //Contagem - 0 Erro, 1 Rei Branco Vivo, 2 Rei Preto Vivo, 3 Ambos Vivos
		for (int row = 0; row <= 8; row++) {
			// printa matriz
			for (int col = 0; col <= 8; col++) {
				if (mat[row][col] == "BK ") { // printa quadrados vazios
					count += 2;
				} else if (mat[row][col] == "WK "){
					count += 1;
				}
			}
		}

		return count;
	}
	
	

}
