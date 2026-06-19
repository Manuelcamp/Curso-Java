package faculdaddeLOuca;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		int num, soma=0;
		
		do {
			num =Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			if(num%2 != 0) {
				soma+=num;
			}
		}
		while(num!=0);
		JOptionPane.showMessageDialog(null, "A soma dos números impares é: " + soma);
		
	

}
}