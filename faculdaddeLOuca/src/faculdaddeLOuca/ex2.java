package faculdaddeLOuca;
import javax.swing.*;
public class ex2 {

	public static void main(String[] args) {
		int q25, q10, q5;
		double total;
		q25=Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de moedas de R$0,25"));
		q10=Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de moedas de R$0,10"));
		q5=Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de moedas de R$0,05"));
		
		total = q25*0.25 + q10*0.10 + q5 * 0.05;
		JOptionPane.showMessageDialog(null, "O valor total em reais é: R$" + total);
	}

}
