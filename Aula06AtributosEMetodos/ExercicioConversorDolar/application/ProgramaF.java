package application;

import java.util.Locale;
import java.util.Scanner;

import entitities.Calculador;

public class ProgramaF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantidade = sc.nextDouble();

		double resultado = Calculador.Converter(quantidade, dollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", resultado);
		sc.close();
	}

}
