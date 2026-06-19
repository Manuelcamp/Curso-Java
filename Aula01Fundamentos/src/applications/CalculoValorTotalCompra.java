package applications;
import java.util.Locale;
import java.util.Scanner;

public class CalculoValorTotalCompra {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1;
		int cod2;
		int quantidade;
		double preco;
		cod1 = sc.nextInt();
		quantidade = sc.nextInt();
		preco = sc.nextDouble();
		double calculador1 = (double)quantidade * preco;
		cod2 = sc.nextInt();
		quantidade = sc.nextInt();
		preco = sc.nextDouble();
		double calculador2 = (double)quantidade * preco;
		double total = calculador1 + calculador2;
		System.out.printf("VALOR A PAGAR: R$%.2f", total);
		
		sc.close();
	}
}
