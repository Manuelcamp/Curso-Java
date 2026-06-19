package app;

import javax.swing.JOptionPane;

public class programMedia {

	public static void main(String[] args) {
		double media, soma=0;
		int num, qtde=0;
		char resp='s';
		while(resp =='s'||resp == 'S') {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			soma+=num;
			qtde++;
			resp = JOptionPane.showInputDialog("Deseja continuar?").charAt(0);
		}
		media = soma/qtde;
		JOptionPane.showMessageDialog(null, "A média dos números digitados é: " + media);
	}

}
