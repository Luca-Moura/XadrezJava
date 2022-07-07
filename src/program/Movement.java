package program;

public class Movement {

	/**
	 * @param startRow
	 * @param startCol
	 * @param endRow
	 * @param endCol
	 * @param mat
	 * @param colour
	 * @return
	 */
	public int Mov(int startRow, int startCol, int endRow, int endCol, String[][] mat, int colour) {
		Piece p = new Piece();

		String piece = mat[startRow][startCol]; // A peca movimentada
		char color = piece.charAt(0); // Pega a cor dela
		char type = piece.charAt(1); // Pega o tipo da peca
		int colorNum = 404; // Cor dela em numero: 0-White , 1-Black e 404-Erro
		int difRow =Math.abs(endRow - startRow); // Quantos quadrados andados na linha
		int difCol =Math.abs(endCol - startCol); // Quantos quadrados andados na coluna

		int answer = 1; //Jogador ainda tem turno, 1 é sim , 2 é não

		// Impede jogador de pegar peca do adversario
		if (color == 'W') {
			colorNum = 0;
			answer =1;
		} else if (color == 'B') {
			colorNum = 1;
			answer =1;
		}
		boolean notPiece = false;
		if (colorNum != colour) {
			System.out.println("Selecionando peca do adversario.");
			notPiece = true;
		}

		// Impede movimento de peca impossivel
		String endSpot = mat[startRow][startCol];
		int pieceMovLegal = p.movPiece(startRow, startCol, endRow, endCol, colorNum, type, endSpot);
		if (pieceMovLegal == 1) {
			System.out.println("Movimento de pe�a incorreto.");
		}

		// Impede Torre, Bispo e Rainha de pular outras pecas
		if (pieceMovLegal == 2) { // Impede passar por cima -horizontal ou vertical Torre/Rainha
			if (difRow > 0) { // Movimento em linhas
				if (endRow > startRow) { // Se peca indo do topo para baixo
					int sum = 0;
					for (int i = 0; i < difRow; i++) {
						startRow += 1;
						String frontSpot = mat[startRow][startCol];
						if (frontSpot != null) {
							if (frontSpot == " - "){
							}else{
							sum += 1;
							}
						}
					}
					if (sum == 0) {
						pieceMovLegal = 0;
					} else {
						pieceMovLegal = 1;
					}
				} else if (startRow > endRow) { // Se peca indo de baixo para cima
					int sum = 0;
					for (int i = 0; i < startRow; i++) {
						String frontSpot = mat[startRow][startCol];
						if (frontSpot != null) {
							sum += 1;
						}
						endRow += 1;
					}
					if (sum == 0) {
						pieceMovLegal = 0;
					} else {
						pieceMovLegal = 1;
					}
				}

			} else if (difCol > 0) { // Movimento em colunas

			}
		}
		if (pieceMovLegal == 3) { // Impede passar por cima -diagonal Bispo/Rainha
			// to do
		}

		// Impede fogo amigo
		String ff = mat[endRow][endCol]; // Posicao final do movimento
		if (ff != null) {
			char ffColor = 'A'; // Cor da peca no movimento final.
			// Impede de frienly fire
			ffColor = ff.charAt(0); // Cor da peca no final em numero: 0-White , 1-Black e 404-Erro
			int ffColorNum = 404; //
			if (ffColor == 'W') {
				ffColorNum = 0;
			} else if (ffColor == 'B') {
				ffColorNum = 1;
			}

			if (ffColorNum == colorNum) { // Se tem fogo-amigo mandar mensagem
				System.out.println("Atacando peca aliada.");
				pieceMovLegal = 1;
			}

			// Erro de nao ter lido cores
			if ((ffColorNum == 404) || (colorNum == 404)) {
				System.out.println("Erro Movement.");
			}
		}

		// Movimento em si
		System.out.println(colorNum +"/cNum/ "+  pieceMovLegal +"/pMovLeg/ "+ notPiece +"/notP");
		if ((colorNum == colour) && (pieceMovLegal == 0) && (notPiece == false)) {
			// Peca movimentada
			mat[endRow][endCol] = mat[startRow][startCol];
			mat[startRow][startCol] = " - ";

			// Envia que o movimento foi feito
			if (colour == 0) {
				answer = 0;
			} else if (colour == 1) {
				answer = 0;
			}
		}

		return answer;
	}
	
	// Linha ficticia(1~8) para resposta em linha da matriz(0~7)
	public int FixMovRow(int row) {
		if (row == 8) {
			return 0;
		} else if (row == 7) {
			return 1;
		} else if (row == 6) {
			return 2;
		} else if (row == 5) {
			return 3;
		} else if (row == 4) {
			return 4;
		} else if (row == 3) {
			return 5;
		} else if (row == 2) {
			return 6;
		} else if (row == 1) {
			return 7;
		} else {
			return 404;
		}
	}

	// Coluna ficticia(a~h) para resposta em Coluna da matriz(1~8)
	public int FixMovCol(String col) {
		if (col.equalsIgnoreCase("a")) {
			return 1;
		} else if (col.equalsIgnoreCase("b")) {
			return 2;
		} else if (col.equalsIgnoreCase("c")) {
			return 3;
		} else if (col.equalsIgnoreCase("d")) {
			return 4;
		} else if (col.equalsIgnoreCase("e")) {
			return 5;
		} else if (col.equalsIgnoreCase("f")) {
			return 6;
		} else if (col.equalsIgnoreCase("g")) {
			return 7;
		} else if (col.equalsIgnoreCase("h")) {
			return 8;
		} else {
			return 404;
		}
	}

}