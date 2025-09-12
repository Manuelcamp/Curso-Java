package applications;

import java.util.Locale;
import java.util.Scanner;

public class CalculoPrecoLanche {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int Cod = sc.nextInt();
		double Qnt = sc.nextInt();
		if (Cod == 1) {
			double Valor = Qnt * 4;
			System.out.printf("Total: R$ %.2f", Valor);
		} else {
			if (Cod == 2) {
				double Valor = Qnt * 4.50;
				System.out.printf("Total: R$ %.2f", Valor);
			} else {
				if (Cod == 3) {
					double Valor = Qnt * 5;
					System.out.printf("Total: R$ %.2f", Valor);
				} else {
					if (Cod == 4) {
						double Valor = Qnt * 2;
						System.out.printf("Total: R$ %.2f", Valor);
					} else {
						if (Cod == 5) {
							double Valor = Qnt * 1.50;
							System.out.printf("Total: R$ %.2f", Valor);
							sc.close();

						}
					}
				}
			}
		}
	}
}
