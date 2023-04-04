import java.util.Random;

public class ex3 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] matriz = new int[5][5];
		int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0, somaMatriz = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				System.out.print(matriz[linha][coluna] + " ");

				somaMatriz += matriz[linha][coluna];

				if (linha == 4) {
					somaLinha4 += matriz[linha][coluna];

				} 
				if (coluna == 2) {
					somaColuna2 += matriz[linha][coluna];

				} 
				if (linha == coluna) {
					somaDiagonalPrincipal += matriz[linha][coluna];

				} 
				if (linha + coluna == matriz.length - 1) {
					somaDiagonalSecundaria += matriz[linha][coluna];

				}

			}
			System.out.print("\n");
		}
		System.out.println("Soma dos valores na linha 4: " + somaLinha4 + "\nSoma dos valores da coluna 2: "
				+ somaColuna2 + "\nSoma dos valores da diagonal principal: " + somaDiagonalPrincipal
				+ "\nSoma dos valores na diagonal secundária " + somaDiagonalSecundaria
				+ "\nSoma de todos os valores na matriz: " + somaMatriz);
	}

}
