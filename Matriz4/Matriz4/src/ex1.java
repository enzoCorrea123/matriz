import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de n:");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];

		for (int linha = 0; linha < matriz.length; linha++) {
			if (linha == 0) {
				System.out.print("*");
				for (int iguais = 0; iguais < matriz.length; iguais++) {
					System.out.print("=");
				}
				System.out.println("*");
			}

			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (coluna == 0) {
					System.out.print("*");
				}

				if (linha + coluna != matriz.length - 1) {
					System.out.print(" ");
				} else {
					for (int contador = 0; contador < linha + 1; contador++) {
						System.out.print(linha + 1);
					}

				}
				if (coluna == n - 1) {
					System.out.print("*");
					n = n - 1;
				}
			}
			System.out.print("\n");
		}
		for (int iguais = 0; iguais < matriz.length; iguais++) {
			System.out.print("*");
		}
		n = matriz.length;
		int contador2 = n;
		System.out.println(" ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna == 0) {
					System.out.print("*");
				}
				if (linha == coluna) {
					for (int contador = n; contador > 0; contador--) {
						System.out.print(n);
					}
					n = n - 1;

				}
			}

			System.out.print("\n");
			if (linha == matriz.length - 1) {
				System.out.print("*");
				for (int contador = 0; contador < matriz.length; contador++) {
					System.out.print("=");
				}
				System.out.print("*");
			}
		}
	}
}
