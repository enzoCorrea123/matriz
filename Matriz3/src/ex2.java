import java.util.Random;

public class ex2 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		Random random = new Random();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		System.out.println("Diagonal principal:");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}
		System.out.println("\nTodos os valores que n�o est�o na diagonal principal:");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha != coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}
		System.out.println("\nDiagonal Secund�ria:");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha + coluna == matriz.length - 1) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}
		
		System.out.println("\nTodos os valores exceto a Diagonal Secund�ria:");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha + coluna != matriz.length - 1) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}
		System.out.println("\nDiagonal Prim�ria e Secund�ria:");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha + coluna == matriz.length - 1 || linha == coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}
		System.out.println("\nTodos os valores exceto da Diagonal Prim�ria e Secund�ria:");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha + coluna != matriz.length - 1 || linha != coluna) {
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}

	}

}
