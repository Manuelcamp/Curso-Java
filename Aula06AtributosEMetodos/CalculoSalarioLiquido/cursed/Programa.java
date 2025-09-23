package cursed;

import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee Funcionario = new Employee();
		System.out.print("Name: ");
		Funcionario.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		Funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		Funcionario.tax = sc.nextDouble();
		System.out.println("\nEmployee: " + Funcionario);
		System.out.print("\nWich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		Funcionario.increaseSalary(percentage);
		System.out.println("\nUpdated data: " + Funcionario);
		sc.close();

	}

}
