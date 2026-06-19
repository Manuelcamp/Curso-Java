package faculdaddeLOuca;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {
		double altura, maior;
		maior = 0;
		for(int i=1; i<=10;i++) {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Qual altura do aluno " + i));
			if(altura > maior)
				maior = altura;
		}
		JOptionPane.showMessageDialog(null, "A maior altura digitada foi " + maior);
		
		
		
		
		
		
	}

}
