import java.util.Random;

public class ex3 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] matriz = new int[4][4];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10) - 5;
				
				if (matriz[linha][coluna] < 0) {
					matriz[linha][coluna] = 0;
				}
				
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
	}

}
