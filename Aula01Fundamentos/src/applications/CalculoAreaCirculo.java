package applications;

import java.util.Scanner;
import java.util.Locale;

public class CalculoAreaCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double PI = 3.14159;
		double Calculador = PI * Math.pow(raio, 2.0);
		System.out.println("A=" + Calculador);

		sc.close();
	}
}
