package faculdaddeLOuca;
import javax.swing.*;
public class ex3 {

	public static void main(String[] args) {
		double a, b, c, x1, x2;
		a=Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de a"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de b"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de c"));
		
		x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

		JOptionPane.showMessageDialog(null, "X1 é igual a: " + x1 + " e x2 é igual a: " + x2);
	}

}
