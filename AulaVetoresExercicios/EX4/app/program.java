package app;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		int par=0;
		System.out.println("\nNUMEROS PARES:");
		for(int i =0; i<n; i++) {
			if(vect[i]%2 == 0) {
			System.out.print(vect[i] + " ");
			par += 1;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + par);
		
		
		sc.close();
	}

}
