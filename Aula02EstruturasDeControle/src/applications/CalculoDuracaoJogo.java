package applications;

import java.util.Scanner;

public class CalculoDuracaoJogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int somador;
		if (x > y) {
			somador = 24 - x + y;
			System.out.printf("O JOGO DUROU %d HORA(S)", somador);
		} else {
			if ((x & y) == 0)
				System.out.println("O JOGO DUROU 24 HORAS(S)");
			else {
				somador = y - x;
				System.out.printf("O JOGO DUROU %d HORAS(S)", somador);
				sc.close();

			}
		}
	}
}