package program;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.Exceptions;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		System.out.println();
		
		Account account =  new Account(number, holder, initialBalance, withdrawLimit);
	
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
	try {
		account.withdraw(amount);	
		System.out.printf("New balance: %.2f%n", account.getBalance());
	}
	catch(Exceptions e){	
		System.out.println("Withdraw error: " + e.getMessage());
	}
		
		sc.close();
		}
}
