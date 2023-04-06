import java.util.Random;

public class ex5 {

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
		System.out.println("\nDiagonal principal:\n");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}
		
	}

}
