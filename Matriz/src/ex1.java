import java.util.Random;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		System.out.println("Digite o tamanho das matrizes A e B:\nLinha:");
		int linha = sc.nextInt();
		System.out.println("Coluna:");
		int coluna = sc.nextInt();

		int[][] matrizA = new int[linha][coluna];
		int[][] matrizB = new int[linha][coluna];
		int[][] matrizSom = new int[linha][coluna];
		int[][] matrizSub = new int[linha][coluna];
		int[][] matrizMul = new int[linha][coluna];

		for (linha = 0; linha < matrizA.length; linha++) {
			for (coluna = 0; coluna < matrizA.length; coluna++) {
				matrizB[linha][coluna] = random.nextInt(20);
				matrizA[linha][coluna] = random.nextInt(20);
			}
		}
		
		while (true) {
			System.out.println("Menu:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n0 - Sair\n");
			escolha = sc.nextInt();
			
			if (escolha == 0) {
				break;
			}
			
			switch (escolha) {
			case 1:
				for (linha = 0; linha < matrizA.length; linha++) {
					for (coluna = 0; coluna < matrizA.length; coluna++) {
						matrizSom[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
					}
				}
				break;
				
			case 2:
				for (linha = 0; linha < matrizA.length; linha++) {
					for (coluna = 0; coluna < matrizA.length; coluna++) {
						matrizSub[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
					}
				}
				break;
				
			case 3:
				for (linha = 0; linha < matrizA.length; linha++) {
					for (coluna = 0; coluna < matrizA.length; coluna++) {
						matrizMul[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna];
					}
				}
				break;
				
			default:
				System.out.println("Número inválido");
			}

		}
		System.out.println("Matriz A:");
		for (linha = 0; linha < matrizA.length; linha++) {
			for (coluna = 0; coluna < matrizA.length; coluna++) {
				System.out.print(matrizA[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Matriz B:");
		for (linha = 0; linha < matrizA.length; linha++) {
			for (coluna = 0; coluna < matrizA.length; coluna++) {
				System.out.print(matrizB[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Matriz soma:");
		for (linha = 0; linha < matrizA.length; linha++) {
			for (coluna = 0; coluna < matrizA.length; coluna++) {
				System.out.print(matrizSom[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Matriz subtração:");
		for (linha = 0; linha < matrizA.length; linha++) {
			for (coluna = 0; coluna < matrizA.length; coluna++) {
				System.out.print(matrizSub[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Matriz multiplicação:");
		for (linha = 0; linha < matrizA.length; linha++) {
			for (coluna = 0; coluna < matrizA.length; coluna++) {
				System.out.print(matrizMul[linha][coluna] + " ");
			}
			System.out.print("\n");
		}

	}
}
