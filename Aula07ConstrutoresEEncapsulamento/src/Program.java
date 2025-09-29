import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		System.out.print("Enter account number: ");
		int numberid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.nextLine().charAt(0);
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double Initialbalance = sc.nextDouble();
			cliente = new Cliente(numberid, name, Initialbalance);
		} else {
			cliente = new Cliente(numberid, name);
		}
		System.out.print("\nAccount data:\n" + cliente + "\n");
		System.out.print("\nEnter a deposit value: ");
		double valorD = sc.nextDouble();
		cliente.Deposito(valorD);
		System.out.print("Updated account data:\n" + cliente + "\n");

		System.out.print("\nEnter a withdraw value: ");
		double valorS = sc.nextDouble();
		cliente.Saque(valorS);
		System.out.print("Updated account data:\n" + cliente + "\n");

		sc.close();
	}
}