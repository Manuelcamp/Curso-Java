package app;

import java.util.Locale;
import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int verificador = 0;
		double soma = 0;
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				verificador += 1;
			}
		}
		if (verificador > 0) {
			System.out.print("MEDIA DOS PARES = " + soma/verificador);

		}
		else {
			System.out.print("NENHUM NUMERO PAR");
		}
		sc.close();

	}

}
