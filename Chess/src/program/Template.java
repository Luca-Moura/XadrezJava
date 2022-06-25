package program;

import java.util.Scanner;

public class Template {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
		int i = 0;
		int j = 0;
		
		boolean endGame = false;
		int playerWon = 0;

		System.out.println("Jogador da parte Branca: ");
		String playerWhite = sc.next();

		System.out.println("Jogador da parte Preta: ");
		String playerBlack = sc.next();

		System.out.println("Saia do jogo digitando: 000");
		
		while (i != 000 || j != 000 || endGame != true) {
			boolean whiteMov = true;
			

			do {
			System.out.println("Jogador Branco joga, escolha uma peca e diga: ");

			System.out.println("Qual a linha que ela anda: ");
			i = sc.nextInt();
			System.out.println("Qual a coluna que ela anda: ");
			j = sc.nextInt();
			} while (whiteMov != false);
			
			boolean blackMov = true;
			
			do {
			System.out.println("Jogador Preto joga, escolha uma peca e diga: ");

			System.out.println("Qual a linha que ela anda: ");
			i = sc.nextInt();
			System.out.println("Qual a coluna que ela anda: ");
			j = sc.nextInt();
			} while (blackMov != false);
			
		}
		
		if (playerWon == 1) {
			System.out.println("Jogador Branco" + playerWhite + " Ganhou!!!");
		}
		else if (playerWon == 2) {
			System.out.println("Jogador Preto" + playerBlack + " Ganhou!!!");
		}
		else {
			System.out.println("Fim de jogo.");
		}
		System.out.println("Quer recomeçar? (y/n)");
		String restart = sc.next();
		
		} while (restart != n)

		sc.close();

	}
}
