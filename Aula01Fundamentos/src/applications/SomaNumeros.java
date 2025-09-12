package applications;
import java.util.Scanner;
public class SomaNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int somador = a + b;
		System.out.println("SOMA = " + somador);
		
		sc.close();
	}
}
