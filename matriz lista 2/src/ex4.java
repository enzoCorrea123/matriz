import java.util.Random;

public class ex4 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] matriz = new int[5][5];
		int[][] matrizCubo = new int[5][5];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				System.out.print(matriz[linha][coluna] + " ");
				
				matrizCubo[linha][coluna] = (int) matriz[linha][coluna] * matriz[linha][coluna] * matriz[linha][coluna];

				
			}
			System.out.print("\n");
		}
		System.out.println("Segunda matriz:");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print(matrizCubo[linha][coluna] + " ");

			}
			System.out.print("\n");
		}
	}

}
