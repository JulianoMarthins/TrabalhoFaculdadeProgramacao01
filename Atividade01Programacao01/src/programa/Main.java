package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de rotas: ");
		int quantidadeRotas = sc.nextInt();
		double kmTotal = 0.0;
		double litroTotal = 0;
		double valorTotal = 0;

		for (int i = 0; i < quantidadeRotas; i++) {
			System.out.println("Km de rota " + (i + 1));
			double kmRota = sc.nextDouble();
			kmTotal += kmRota;

			double litros = kmRota / 2.5;
			litroTotal += litros;
		}

		System.out.println("Valor por litro de oleo: ");
		double valorLitro = sc.nextDouble();

		valorTotal = litroTotal * valorLitro;

		System.out.printf("Total de quilometros: %.2f%nTotal litros: %.2f%nValor Total: %.2f", kmTotal, litroTotal,
				valorTotal);

		sc.close();
	}

}
