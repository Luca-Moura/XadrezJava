package program;

public class Piece {
	
		//variaveis
		private boolean color; //true White, false Black
		private char type;      //type of piece
		private int row, col; //position on the board
		
		
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
	
}