package app;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		int numero;
		numero=Integer.parseInt(JOptionPane.showInputDialog("Entre com o número"));
		for(int i = 0; i<=10; i++) {
			System.out.println(numero*i);
		}
	}

}
