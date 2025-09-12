package applications;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioFuncionario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int ID;
		int HORAS;
		double valorHora;
		ID = sc.nextInt();
		HORAS = sc.nextInt();
		valorHora = sc.nextDouble();
		double calculador =(double) (HORAS * valorHora);
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f",ID, calculador);
		
		sc.close();
	}
}
