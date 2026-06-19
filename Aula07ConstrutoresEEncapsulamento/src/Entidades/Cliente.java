
package Entidades;

public class Cliente {
	private int accountNumber;
	private String name;
	private double balance;

	public Cliente(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public Cliente(int accountNumber, String name, double Initialbalance) {
		this.accountNumber = accountNumber;
		this.name = name;
		Deposito(Initialbalance);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void Deposito(double valorD) {
		this.balance += valorD;
	}

	public void Saque(double valorS) {
		this.balance -= valorS - 5;
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}

}