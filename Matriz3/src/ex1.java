import java.util.Random;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[6][6];
		Random random = new Random();
		int achado = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(15);
			}
		}
		System.out.println("Digite um valor para x:");
		int x = sc.nextInt();

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (x == matriz[linha][coluna]) {
					System.out.println("Valor encontrado!\nlinha: " + linha + " - Coluna: " + coluna);
					achado++;
				}
			}
			
		}
		if (achado == 0) {
			System.out.println("Valor não encontrado!");
		}

	}

}
