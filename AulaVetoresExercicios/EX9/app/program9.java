package app;

import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", +i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		int maiorIdade = 0;
		String nomeIdade = "";
		for (int i = 0; i < n; i++) {

			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				nomeIdade = nome[i];
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + nomeIdade);
		sc.close();
	}

}
