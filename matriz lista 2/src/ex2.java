import java.util.Random;

public class ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] matriz = new int[7][4];
		int menor = 26, linhaMenor = 0, colunaMenor = 0;

		for (int linha = 0; linha < 7; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = random.nextInt(10) + 15;
				System.out.print(matriz[linha][coluna] + " ");

				if (matriz[linha][coluna] < menor) {
					menor = matriz[linha][coluna];
					linhaMenor = linha;
					colunaMenor = coluna;
				}
			}
			System.out.print("\n");
		}

		System.out.println("Menor valor: " + menor + "\nlinha: " + linhaMenor + " - coluna: " + colunaMenor);

	}

}
