import java.util.Random;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Digite o tamanho da matriz vertical:");
		int linha = sc.nextInt();
		System.out.println("Digite o tamanho da matriz horizontal:");
		int coluna = sc.nextInt();
		int[][] matriz = new int[linha][coluna];
		// matriz.length = linha
		// matriz[0].length = coluna
		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = 0;
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.print("\n");
		}

		System.out.println("Digite um valor para x:");
		int x = sc.nextInt();

		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[0][0] = x;
				matriz[0][matriz[0].length - 1] = x;
				matriz[matriz.length - 1][0] = x;
				matriz[matriz.length - 1][matriz[0].length - 1] = x;
				
				if (matriz.length%2 == 1 &&  matriz[0].length%2 ==0) {
					matriz[(matriz.length-1) / 2][matriz[0].length / 2] = x;
					matriz[(matriz.length-1) / 2][(matriz[0].length / 2) - 1] = x;
					
					System.out.print(matriz[linha][coluna] + " ");

				} else if (matriz.length%2 == 0 && matriz[0].length%2 == 1) {
					matriz[matriz.length / 2][matriz[0].length / 2] = x;
					matriz[(matriz.length / 2) - 1][matriz[0].length / 2] = x;
					
					System.out.print(matriz[linha][coluna] + " ");

				} else if (matriz.length%2 == 1 && matriz[0].length % 2 == 1) {
					matriz[(matriz.length-1) / 2][(matriz[0].length-1) / 2] = x;
					System.out.print(matriz[linha][coluna] + " ");

				} else if (matriz.length %2 == 0 && matriz[0].length % 2 == 0) {
					matriz[matriz.length / 2][matriz[0].length / 2] = x;
					matriz[matriz.length / 2 - 1][matriz[0].length / 2] = x;
					matriz[matriz.length / 2][matriz[0].length / 2 - 1] = x;
					matriz[matriz.length / 2 - 1][matriz[0].length / 2 - 1] = x;
					System.out.print(matriz[linha][coluna] + " ");
				}

			}
			System.out.print("\n");
		}

	}

}
