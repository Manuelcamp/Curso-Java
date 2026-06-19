package app;

import javax.swing.JOptionPane;

public class programsoma {

	public static void main(String[] args) {
		double n1;
		double soma=0;
		for(int i =1; i<=10;i++) {
			n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
			soma += n1;
		}
		JOptionPane.showMessageDialog(null,"A somatoria é " + soma);
	}

}
