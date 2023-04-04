import java.util.Random;

public class ex1 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] matriz = new int[5][5];
		double media = 0;
		double contPar = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = random.nextInt(10);
				System.out.print(matriz[linha][coluna] + " ");

				if (matriz[linha][coluna] % 2 == 0) {
					media += matriz[linha][coluna];
					contPar++;
				}
			}
			System.out.print("\n");
		}
		System.out.println("Média dos pares: "+media/contPar);
		

	}

}
