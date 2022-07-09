package game;

import java.util.InputMismatchException;
import java.util.Scanner;

import program.Board;
import program.Movement;

public class Game {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Bem Vindo ao Xadrez-TecBotafogo");
		System.out.println();
		int turnB = 0; // variavel do loop while, para nao haver quebra do turno em certos casos.
		int turnW = 0; // variavel do loop while, para nao haver quebra do turno em certos casos.
		Board board = new Board();
		Movement mov = new Movement();
		String[][] mat = board.resetBoard(); // Matriz Tabuleiro
		Scanner sc = new Scanner(System.in);

		int whiteMov;
		int blackMov;

		// Variaveis de posicao inicial e final

		int endGame = 1; // Fim do jogo, 1: nao e final do jogo, 0: e final do jogo

		// Nomes dos jogadores para mensagem de vitoria
		System.out.println("Jogador da parte Branca: ");
		String playerWhite = sc.next();
		System.out.println("Jogador da parte Preta: ");
		String playerBlack = sc.next();

		// Informa��es do jogo
		System.out.println("Coluna sao as letras, numero sao as linhas.");

		while (endGame == 1) {
			whiteMov = 1;
			blackMov = 1;
			// Vez do Jogador Branco
			do { // loop de jogo do Jogador Branco
				while (turnW == 0) {
					try {
						// Bloco de jogada do Jogador Branco
						System.out.println("Jogador BRANCO joga, escolha uma peca: ");

						System.out.println("Qual a linha que ela esta: ");
						int sR = sc.nextInt();
						sR = mov.FixMovRow(sR); // Linha ficticia(1~8) para resposta em linha da matriz(0~7)

						System.out.println("Qual a coluna que ela esta: ");
						String sC = sc.next();
						int sCNum = mov.FixMovCol(sC); // Coluna ficticia(a~h) para resposta em Coluna da
														// matriz(1~8)

						System.out.println("Qual a linha que ela anda: ");
						int eR = sc.nextInt();
						eR = mov.FixMovRow(eR); // Linha ficticia(1~8) para resposta em linha da matriz(0~7)

						System.out.println("Qual a coluna que ela anda: ");
						String eC = sc.next();
						int eCNum = mov.FixMovCol(eC);// Coluna ficticia(a~h) para resposta em Coluna da matriz(1~8)

						int colour = 0; // colour - numero da cor branca/white

						// Confere que o movimento esta dentro da matriz
						if (eCNum >= 1 && eCNum <= 8 && eR >= 0 && eR <= 7 && sCNum >= 1 && sCNum <= 8 && sR >= 0
								&& sR <= 7) {
							whiteMov = mov.Mov(sR, sCNum, eR, eCNum, mat, colour); // Envia para validar e
																					// movimentar a
																					// peca
							if (whiteMov == 0) {
								turnW = 1;
								board.showBoard(); // Mostra o tabuleiro
							}
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Posicao Branca Invalida: Tente de novo.");
					} catch (InputMismatchException e) {
						System.out.println("Algo foi digitado errado.");
					}
				}
			} while (whiteMov == 1);

			// Vez do Jogador Preto
			do { // loop de jogo do Jogador Preto

				while (turnB == 0) {
					try {
						// Bloco de jogada do Jogador Preto
						System.out.println("Jogador PRETO joga, escolha uma peca: ");

						System.out.println("Qual a linha que ela esta: ");
						int sR = sc.nextInt();
						sR = mov.FixMovRow(sR); // Linha ficticia(1~8) para resposta em linha da matriz(0~7)

						System.out.println("Qual a coluna que ela esta: ");
						String sC = sc.next();
						int sCNum = mov.FixMovCol(sC); // Coluna ficticia(a~h) para resposta em Coluna da
														// matriz(1~8)

						System.out.println("Qual a linha que ela anda: ");
						int eR = sc.nextInt();
						eR = mov.FixMovRow(eR); // Linha ficticia(1~8) para resposta em linha da matriz(0~7)

						System.out.println("Qual a coluna que ela anda: ");
						String eC = sc.next();
						int eCNum = mov.FixMovCol(eC);// Coluna ficticia(a~h) para resposta em Coluna da matriz(1~8)

						int colour = 1; // colour - numero da cor preto/black

						// Confere que o movimento esta dentro da matriz
						if (eCNum >= 1 && eCNum <= 8 && eR >= 0 && eR <= 7 && sCNum >= 1 && sCNum <= 8 && sR >= 0
								&& sR <= 7) {
							blackMov = mov.Mov(sR, sCNum, eR, eCNum, mat, colour); // Envia para validar e
																					// movimentar a
																					// peca
							if (blackMov == 0) {
								turnB = 1; // Acaba o turno do jogador
								board.showBoard(); // Mostra o tabuleiro
							}
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Posicao Preta Invalida: Tente de novo.");
					} catch (InputMismatchException e) {
						System.out.println("Algo foi digitado errado.");
					}
				}
			} while (blackMov == 1);

			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("Proximo Turno");
			System.out.println("-----------------------------------------");
			System.out.println();
			Thread.sleep(200);
			turnW = 0;
			turnB = 0;

			int res = board.showKing();
			if (res < 3) {
				endGame = 0;
			}
		}

		int playerWon = board.showKing(); // Define ganhador, 0 - Erro, 1 Jogador Branco, 2 Jogador Preto

		// Mensagem do vencedor do jogo
		if (playerWon == 1) {
			System.out.println("Jogador Branco" + playerWhite + " Ganhou!!!");
		} else if (playerWon == 2) {
			System.out.println("Jogador Preto" + playerBlack + " Ganhou!!!");
		} else {
			System.out.println("Fim de jogo.");
		}

		sc.close();

	}
}
