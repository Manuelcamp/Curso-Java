package applications;

import java.util.Scanner;

public class VerificacaoCoordenadasQuadrante {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (y != 0 && x != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante!");
				x = sc.nextInt();
				y = sc.nextInt();
			} else {
				if (x < 0 && y < 0) {
					System.out.println("Terceiro Quadrante!");
					x = sc.nextInt();
					y = sc.nextInt();
				} else {
					if (x < 0 && y > 0) {
						System.out.println("Segundo Quadrante!");
						x = sc.nextInt();
						y = sc.nextInt();
					} else {
						if (x > 0 && y < 0) {
							System.out.println("Quarto Quadrante!");
							x = sc.nextInt();
							y = sc.nextInt();
						}
					}
				}

			}
		}
		sc.close();
	}
}