package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> conta = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Tax prayer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			char resposta = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();

			if (resposta == 'i') {
				System.out.print("Health expenditures: ");
				double healtCare = sc.nextDouble();
				conta.add(new PessoaFisica(name, anualIncome, healtCare));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				conta.add(new PessoaJuridica(name, anualIncome, numberEmployee));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double soma = 0;
		for (Contribuinte contas : conta) {
			System.out.printf(contas.getName() + ": $ " + "%.2f\n", contas.tax());
			soma += contas.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", soma);
		sc.close();
	}

}
