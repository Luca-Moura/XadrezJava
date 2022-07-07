package program;

public class Piece {

	// variaveis
	private boolean color; // true White, false Black
	private char type; // type of piece
	private int row, col; // position on the board

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int movPiece(int startRow, int startCol, int endRow, int endCol, int color, char type, String endSpot) {

		int difRow = endRow - startRow; // Quantos quadrados andados na linha
		int difCol = endCol - startCol; // Quantos quadrados andados na coluna
		int movLegal = 404; // movimento � legal? 0-Sim 1-Nao

		if (type == 'R') { // Movimento da Torre
			if ((difRow == 0 && difCol != 0) || (difRow != 0 && difCol == 0)) {
				return 2;
			} else {
				return 1;
			}
		} else if (type == 'N') { // Movimento do Cavaleiro
			if ((Math.abs(difRow) == 2) && (Math.abs(difCol) == 1)) {
				return 0;
			} else if ((Math.abs(difRow) == 1) && (Math.abs(difCol) == 2)) {
				return 0;
			} else {
				return 1;
			}

		} else if (type == 'B') { // Movimento do Bispo
			if (Math.abs(difRow) == Math.abs(difCol)) {
				return 3;
			} else {
				return 1;
			}
		} else if (type == 'Q') { // Movimento da Rainha
			if (Math.abs(difRow) == Math.abs(difCol)) {
				return 3;
			} else if ((difRow == 0 && difCol != 0) || (difRow != 0 && difCol == 0)) {
				return 2;
			} else {
				return 1;
			}

		} else if (type == 'K') { // Movimento do Rei
			if ((Math.abs(difRow) <= 1) && (Math.abs(difCol) <= 1)) {
				return 0;
			} else {
				return 1;
			}
		} else if (type == 'P' && color == 0) { // Movimento do Peao Branco
			if ((difRow == 1) && (difCol == 0)) {
				return 0;
			} else if ((difRow == 1) && (Math.abs(difCol) == 1) && (endSpot != null)) {
				return 0;
			} else if ((difRow == 2) && (difCol == 0) && (startRow == 1)) {
				return 0;
			} else {
				return 1;
			}

		} else if (type == 'P' && color == 1) { // Movimento do Peao Preto
			if ((difRow == -1) && (difCol == 0)) {
				return 0;
			} else if ((difRow == -1) && (Math.abs(difCol) == 1) && (endSpot != null)) {
				return 0;
			} else if ((difRow == -2) && (difCol == 0) && (startRow == 6)) {
				return 0;
			} else {
				return 1;
			}

		} else {
			System.out.println("Erro - Type");
		}
		return movLegal;
	}

}