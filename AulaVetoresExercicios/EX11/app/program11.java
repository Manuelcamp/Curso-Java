package app;

import java.util.Locale;
import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		double somador = 0;
		int homens = 0;
		double mulheres = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			sc.nextLine();
			genero[i] = sc.next().charAt(0);
			if (genero[i] == 'F') {
				somador += altura[i];
				mulheres ++;
			}
			else {
				homens ++;
			}
		}
		double maiorAlt = 0;
		double menorAlt = 100;
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAlt) {
				maiorAlt = altura[i];
			}
			else if(altura[i]< menorAlt) {
				menorAlt = altura[i];
			}

		}
		System.out.printf("\nMenor Altura = %.2f\n", menorAlt);
		System.out.printf("Maior Altura = %.2f\n", maiorAlt);
		System.out.printf("Media das alturas das mulheres = %.2f\n", somador/mulheres);
		System.out.printf("Número de homens = %d", homens);

		sc.close();
	}
}