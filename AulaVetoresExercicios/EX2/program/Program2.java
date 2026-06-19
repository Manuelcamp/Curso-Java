package program;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		double soma = 0;
		int n = sc.nextInt();
		double[] vect = new double[n];
		for(int i = 0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.print("VALORES =");
		for(int i = 0; i<vect.length; i++) {
			System.out.print("  " + vect[i]);
		}
		for(int i = 0; i<vect.length; i++) {
			soma += vect[i];
		}
		double media = soma/n;
		System.out.printf("\nSOMA = %.2f\nMEDIA = %.2f", soma, media);
		
		
		sc.close();
	}

}
