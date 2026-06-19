package app;

import java.util.Scanner;
import entidade.quartos;

public class programFX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rentend?");

		int n = sc.nextInt();

		quartos[] vect = new quartos[10];

		for (int i = 1; i < n; i++) {
			System.out.printf("\nRent #%d", i + 1);
			System.out.print("\nName: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quartoAlugado = sc.nextInt();
			vect[quartoAlugado] = new quartos(nome, email);
		}
		System.out.print("\nBusy rooms:");
		for (int i = 0; i < 10; i++)
			if (vect[i] != null) {
				System.out.print("\n" + i + ": " + vect[i]);
			}

		sc.close();
	}

}
