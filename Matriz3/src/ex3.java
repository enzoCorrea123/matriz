import java.util.Random;

public class ex3 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		Random random = new Random();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.print("\n");
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (matriz[linha][coluna] == coluna) {
					System.out.print("Valor igual a coluna! - " + matriz[linha][coluna] + " ");
				}
			}

		}

	}

}
