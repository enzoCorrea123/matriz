import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de n: ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		System.out.print("*");
		for (int contador = 0; contador < matriz.length * 2 + 1; contador++) {
			System.out.print("=");
		}
		System.out.println("*");

		int contador = n;

		for (int linha = 0; linha < matriz.length + 1; linha++) {

			if (contador == matriz.length) {
				System.out.print("*");
				
				for (int coluna = 0; coluna < matriz.length; coluna++) {
					matriz[linha][coluna] = matriz.length;
					System.out.print(matriz[linha][coluna]);
				}
				
				System.out.print("*");

				for (int coluna = 0; coluna < matriz.length; coluna++) {
					matriz[linha][coluna] = matriz.length;
					System.out.print(matriz[linha][coluna]);
				}
				System.out.print("*");

			}

			else if (contador == 0) {
				System.out.print("*");
				for (int coluna = 0; coluna < matriz.length - contador; coluna++) {
					System.out.print(" ");
				}
				System.out.print("*");

				for (int coluna = 0; coluna < matriz.length - contador; coluna++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			else {
				System.out.print("*");
				for (int coluna = 0; coluna < matriz.length - contador; coluna++) {
					System.out.print(" ");
				}
				for (int coluna = 0; coluna < contador; coluna++) {
					matriz[linha][coluna] = contador;
					System.out.print(matriz[linha][coluna]);
				}

				System.out.print("*");
				for (int coluna = 0; coluna < contador; coluna++) {
					matriz[linha][coluna] = contador;
					System.out.print(matriz[linha][coluna]);
				}
				for (int coluna = 0; coluna < matriz.length - contador; coluna++) {
					System.out.print(" ");
				}
				System.out.print("*");

			}

			System.out.println(" ");
			contador--;
		}

		System.out.print("*");
		for (int contador2 = 0; contador2 < matriz.length * 2 + 1; contador2++) {
			System.out.print("-");
		}
		System.out.print("*");

	}

}
