import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de funcionários:");
		int quantidadeDeFuncionarios = sc.nextInt();

		String[] funcionarios = new String[quantidadeDeFuncionarios];
		double[][] salario = new double[quantidadeDeFuncionarios][4];
		double somaSalarioBruto = 0, somaInss = 0, somaImposto = 0, somaSalarioLiquido = 0;

		if (quantidadeDeFuncionarios == 0) {
			System.exit(0);
		}

		for (int linha = 0; linha < quantidadeDeFuncionarios; linha++) {
			System.out.println("Digite o nome do funcionário:");
			funcionarios[linha] = sc.next();

			if (funcionarios[linha].length() < 2) {
				System.out.println("Nome inválido");

			} else {
				System.out.println("Digite o salário bruto do funcionário:");
				salario[linha][0] = sc.nextDouble();

				if (salario[linha][0] < 465) {
					System.out.println("Salário inválido");

				} else {
					somaSalarioBruto += salario[linha][0];
					// inss
					if (salario[linha][0] < 965.67) {
						salario[linha][1] = salario[linha][0] * 0.08;

						if (salario[linha][1] > 354.07) {
							salario[linha][1] = 354.07;
						}

					} else if (salario[linha][0] < 1609.45) {
						salario[linha][1] = salario[linha][0] * 0.09;

						if (salario[linha][1] > 354.07) {
							salario[linha][1] = 354.07;
						}

					} else if (salario[linha][0] < 3218.90) {
						salario[linha][1] = salario[linha][0] * 0.11;

						if (salario[linha][1] > 354.07) {
							salario[linha][1] = 354.07;
						}

					} else {
						salario[linha][1] = 354.07;
					}
					somaInss += salario[linha][1];
					// imposto de renda
					if (salario[linha][0] < 1434) {
						salario[linha][2] = salario[linha][0] * 1;

					} else if (salario[linha][0] < 2150) {
						salario[linha][2] = salario[linha][0] * 0.075;

					} else if (salario[linha][0] < 2886) {
						salario[linha][2] = salario[linha][0] * 0.15;

					} else if (salario[linha][0] < 3582) {
						salario[linha][2] = salario[linha][0] * 0.225;

					} else {
						salario[linha][2] = salario[linha][0] * 0.275;
					}
					somaImposto += salario[linha][2];
					// salario líquido
					salario[linha][3] = salario[linha][0] - salario[linha][1] - salario[linha][2];

					somaSalarioLiquido += salario[linha][3];
				}

			}

		}
		for (int linha = 0; linha < quantidadeDeFuncionarios; linha++) {
			System.out.print("Nome: " + funcionarios[linha] + " Salário Bruto: " + salario[linha][0] + " INSS: "
					+ salario[linha][1] + " Imposto de renda: " + salario[linha][2] + " Salário líquido: "
					+ salario[linha][3] + "\n");
		}
		System.out.println("Total salário bruto: " + somaSalarioBruto + "\nSoma INSS: " + somaInss
				+ "\nSoma imposto de renda: " + somaImposto + "\nSoma salário líquido: " + somaSalarioLiquido);
	}

}
