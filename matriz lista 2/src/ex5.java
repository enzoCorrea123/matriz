import java.util.Random;

public class ex5 {

	public static void main(String[] args) {
		Random random = new Random();
		Double[][] matriz = new Double[3][4];
		double primeiroValor = 0, ultimoValor = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = random.nextDouble() * 5;
				System.out.print(matriz[linha][coluna] + " ");
				
				if(linha == 0 && coluna == 0) {
					primeiroValor = matriz[linha][coluna];
				}
				if(linha == 2 && coluna == 0) {
					ultimoValor = matriz[linha][coluna];
				}

			}
			System.out.print("\n");
		}
		System.out.println("Primeiro valor: "+primeiroValor+"\nÚltimo valor: "+ultimoValor);
	}

}
