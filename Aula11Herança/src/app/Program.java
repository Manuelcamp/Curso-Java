package app;

import entidades.Account;
import entidades.BusinesAccount;
import entidades.SavingsAccounts;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinesAccount bacc = new BusinesAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		//Casting da subclasse para superclasse;
		//Subclasse é atribuido para uma superclasse;
		
		Account acc1 = bacc;
		Account acc2 = new BusinesAccount(1003, "Borges", 0.0, 300.0);
		Account acc3 = new SavingsAccounts(1004, "Ana", 0.0, 0.01);
		
		//DOWCASTING
		BusinesAccount acc4 = (BusinesAccount)acc2;
		acc4.loan(100);
		
		// BusinesAccount acc5 = (BusinesAccount)acc3;
		
		if(acc3 instanceof BusinesAccount) {
			BusinesAccount acc5 = (BusinesAccount)acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccounts) {
			SavingsAccounts acc5 = (SavingsAccounts)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		
		//Exemplo de métodos sobrescrito com "Override"
		
		Account acc9 = new Account(1001,"Alex", 1000.0);
		acc9.withdraw(200);
		System.out.println(acc9.getBalance());
		
		Account acc10 = new SavingsAccounts(1002, "Maria", 1000.0, 0.01);
		acc10.withdraw(200);
		System.out.println(acc10.getBalance());
		
		Account acc11 = new BusinesAccount(1049, "Mario Cortela", 1000.0, 500.0);
		acc11.withdraw(200);
		System.out.println(acc11.getBalance());
		
		//POLIMORFISMO TESTE DE MEMORIA E OBJETO INSTANCIADO!
		Account conta1 = new Account(10, "Jose", 100.0);
		Account conta2 = new SavingsAccounts(20, "Maria", 100.0, 0.01);
		
		conta1.withdraw(10);
		conta2.withdraw(10);
		
		System.out.println("Dinheiro Jose: $" + conta1.getBalance() + 
		"\nDinheiro Maria: $" + conta2.getBalance());
	}

}
