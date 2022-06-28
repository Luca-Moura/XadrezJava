package game;

import java.util.Scanner;

import program.Board;
import program.Movement;

public class Game {

	public static void main(String[] args) {
		System.out.println("bem vindos ao jogo de xadrez do curso tecnico de botafogo");
		Board board = new Board();
		String[][] mat = board.resetBoard();

		Scanner sc = new Scanner(System.in);
		String restart;
		{

			do {

				// Variaveis de posicao inicial e final

				boolean endGame = false; // Fim do jogo, false: nao e final do jogo, true: e final do jogo
				int playerWon = 0; // Define ganhador, 0 - ninguem, 1 Jogador Branco, 2 Jogador Preto

				// Nomes dos jogadores para mensagem de vitoria
				System.out.println("Jogador da parte Branca: ");
				String playerWhite = sc.next();
				System.out.println("Jogador da parte Preta: ");
				String playerBlack = sc.next();

				// Forcar fim do jogo
				System.out.println("Saia do jogo digitando: 000");

				while (endGame != true) {
					boolean whiteMov = true; // Jogador Branco possui vez

					do {
						// Bloco de jogada do Jogador Branco
						System.out.println("Jogador Branco joga, escolha uma peca: ");

						System.out.println("Qual a linha que ela esta: ");
						int sR = sc.nextInt();
						board.setStartRow(sR);

						System.out.println("Qual a coluna que ela esta: ");
						int sC = sc.nextInt();
						board.setStartCol(sC);

						System.out.println("Qual a linha que ela anda: ");
						int eR = sc.nextInt();
						board.setEndRow(eR);
						System.out.println("Qual a coluna que ela anda: ");
						int eC = sc.nextInt();
						board.setEndCol(eC);
						Movement move = new Movement();
					} while (whiteMov != false);

					boolean blackMov = true; // Jogador Preto possui vez

					do {

						// Bloco de jogada do Jogador Preto
						System.out.println("Jogador Preto joga, escolha uma peca: ");

						System.out.println("Qual a linha que ela esta: ");
						int sR = sc.nextInt();
						board.setStartRow(sR);

						System.out.println("Qual a coluna que ela esta: ");
						int sC = sc.nextInt();
						board.setStartCol(sC);

						System.out.println("Qual a linha que ela anda: ");
						int eR = sc.nextInt();
						board.setEndRow(eR);
						System.out.println("Qual a coluna que ela anda: ");
						int eC = sc.nextInt();
						board.setEndCol(eC);
						
					} while (blackMov != false);

				}

				// Mensagem do vencedor
				if (playerWon == 1) {
					System.out.println("Jogador Branco" + playerWhite + " Ganhou!!!");
				} else if (playerWon == 2) {
					System.out.println("Jogador Preto" + playerBlack + " Ganhou!!!");
				} else {
					System.out.println("Fim de jogo.");
				}

				// Restart do jogo
				System.out.println("Quer recomecar? (y/n)");
				restart = sc.next();

			} while (restart != "n");

			sc.close();

		}
	}
}
