import java.util.Random;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[6][6];
		
		

		System.out.println("Digite um valor para x:");
		int x = sc.nextInt();

		int encontrado = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				if (x == matriz[linha][coluna]) {
					System.out.println("x encontrado!\nlinha: " + linha + "\ncoluna: " + coluna);
					encontrado++;
				}
			}
			System.out.print("\n");
		}
		if (encontrado == 0) {
			System.out.println("Valor de x não encontrado");
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");

			}
			System.out.print("\n");
		}
	}

}
