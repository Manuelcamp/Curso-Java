package applications;

import java.util.Locale;
import java.util.Scanner;

public class CalculoImpostoRenda {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double calculador = 0;
		double imposto;
		double Salario = sc.nextDouble();
		if (Salario <= 2000.00)
			System.out.println("Isento!");
		else {
			if (Salario > 2000.00 && Salario <= 3000.00) {
				calculador = Salario - 2000.00;
				imposto = calculador * 0.08;
				System.out.printf("R$ %.2f", imposto);
			} else {
				if (Salario > 3000.00 && Salario <= 4500.00) {
					calculador = Salario - 3000;
					imposto = calculador * 0.18 + 80;
					System.out.printf("R$ %.2f", imposto);
				} else {
					if (Salario > 4500.00) {
						calculador = Salario - 4500;
						imposto = calculador * 0.28 + 350;
						System.out.printf("R$ %.2f", imposto);
						sc.close();

					}
				}
			}
		}
	}
}
