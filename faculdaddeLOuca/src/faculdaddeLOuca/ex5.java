package faculdaddeLOuca;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		int inicio, fim, soma;
		char continua;
		
		do {
			inicio = Integer.parseInt(JOptionPane.showInputDialog("Inicio do intervalo"));
			fim = Integer.parseInt(JOptionPane.showInputDialog("Fim do Intervalo"));
			soma = 0;
			for(int i=inicio; i<=fim; i++) {
				soma+=i;
			}
			JOptionPane.showMessageDialog(null, "A soma deu " + soma);
			continua = JOptionPane.showInputDialog("Quer continuar? (S/N)").charAt(0);
		}while(continua == 's' || continua =='S');
		
	}

}

