package program;

public class Board {

	public static void main(String[] args) {
		
		//matriz de 9x9
		int x = 9;
		int y = 9;
		String[][] mat = new String[x][y];
		
		//valores da linha
		mat[0][0] = "8";
		mat[1][0] = "7";
		mat[2][0] = "6";
		mat[3][0] = "5";
		mat[4][0] = "4";
		mat[5][0] = "3";
		mat[6][0] = "2";
		mat[7][0] = "1";
		mat[8][0] = "@";
		//valores da coluna
		mat[8][1] = "a";
		mat[8][2] = "b";
		mat[8][3] = "c";
		mat[8][4] = "d";
		mat[8][5] = "e";
		mat[8][6] = "f";
		mat[8][7] = "g";
		mat[8][8] = "h";
		

		for (int row = 0; row <= 8; row++) {  //printa matriz
			for (int col = 0; col <= 8; col++) {
				if (mat[row][col] == null) { // printa quadrados vazios
					System.out.printf("%2s","-"); // 
					System.out.printf("%1s", " ");
					System.out.print("|");
				} else {
					System.out.printf("%2s", mat[row][col]);  //printa quadrados ocupados
					System.out.printf("%1s", " ");
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}

}