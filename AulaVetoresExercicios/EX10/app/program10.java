package app;

import java.util.Locale;
import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];
		for(int i = 0; i<n; i++) {
			System.out.printf("Digite nome, primeira, e a segunda nota do %do aluno\n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		System.out.print("Alunos aprovados:\n");
		for(int i = 0; i<n; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
