package app;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		double maior = 0;
		int posicao = 0;
		for(int i =0; i<n; i++) {
			if(vect[i]> maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		System.out.println("\nMAIOR VALOR = " + maior);
		System.out.println("\nPOSICAO DO MAIOR VALOR = " + posicao);

		
		sc.close();
	}

}
