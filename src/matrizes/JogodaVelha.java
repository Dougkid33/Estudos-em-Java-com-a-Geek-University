package matrizes;
import java.util.*;
import java.io.IOException;

public class JogodaVelha {
	
	public static void main(String[] args) throws IOException {
		char jogada[][] = new char [3][3];
		int jogador = 1;
		boolean winner = false;
		int coluna = 0;
		int linha = 0;
		Scanner ler = new Scanner(System.in);
		// verify the player
		
		do {
			
			System.out.println("Jogo da velha\n");
			
			
			for (int i = 0; i < jogada.length; i++) {
				System.out.println("\n");
				for(int j = 0; j< jogada[i].length; j++) {
					//System.out.println("\n");
					System.out.println(jogada[i][j]);

				}
			}
			
			if(jogador == 1) {
				System.out.println("Jogada do Jogador 1 \n");
				System.out.println("Informa uma posicao Linha: \n");
				linha =  ler.nextInt();
				System.out.println("Informa uma posicao Coluna: \n");
				coluna =  ler.nextInt();
				
				
				System.out.printf("Informe uma letra:\n");
				for (int i = 0; i != linha; i++) {
					System.out.println("\n");
					for(int j = 0; j!= coluna; j++) {
						System.out.printf("Informe uma letra Jogador 1:\n");
						jogada[i][j] = (char)System.in.read();
					}
					jogador = 2;
					
				}
			}
			else if(jogador == 2) {
				System.out.println("Jogada do Jogador 2 \n");
				System.out.println("Informa uma posicao Linha: \n");
				linha =  ler.nextInt();
				System.out.println("Informa uma posicao Coluna: \n");
				coluna =  ler.nextInt();
				
				
				System.out.printf("Informe uma letra:\n");
				for (int i = 0; i != linha; i++) {
					System.out.println("\n");
					for(int j = 0; j!= coluna; j++) {
						System.out.printf("Informe uma letra Jogador 2:\n");
						jogada[i][j] = (char)System.in.read();
					}
					jogador = 1;
				}
			}
			
		}while(winner != true);

		
		
	}

}
