package app;

import java.util.Locale;
import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double soma = 0;
		double[] vect = new double[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		System.out.print("\nMEDIA DO VETOR = " + soma/n);
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i<n; i++) {
			if(soma/n > vect[i]) {
				System.out.print(vect[i] + "\n");
			}
		}
		sc.close();
	}

}
