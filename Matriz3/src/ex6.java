import java.util.Random;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite um valor:");
				matriz[linha][coluna] = sc.nextInt(15);
				
				if(linha == 0 && coluna == 0) {
					System.out.println(matriz[linha][coluna]);
				}
				
				else if(linha == 0 && coluna == matriz.length-1) {
					System.out.println(matriz[linha][coluna]);
				}
				else if(linha == 2 && coluna == 2) {
					System.out.println(matriz[linha][coluna]);
				}
				else if(linha == matriz.length-1 && coluna == 0) {
					System.out.println(matriz[linha][coluna]);
				}
				else if(linha == matriz.length-1 && coluna == matriz.length-1) {
					System.out.println(matriz[linha][coluna]);
				}
			}
		}
	}

}
