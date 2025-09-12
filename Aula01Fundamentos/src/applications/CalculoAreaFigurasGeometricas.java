package applications;

import java.util.Locale;
import java.util.Scanner;

public class CalculoAreaFigurasGeometricas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A;
		double B;
		double C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double triangulo =(double) A * C / 2;
		double circulo =(double) 3.14159 * Math.pow(C, 2.00);
		double trapezio =(double) (A + B) * C / 2;
		double quadrado =(double) Math.pow(B, 2);
		double retangulo =(double) A * B;

		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);

		sc.close();
	}
}
