package app;
import Entidades3.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		for(int i = 0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:",i+1);
			System.out.print("\nNome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect [i] = new Pessoa(nome, idade, altura);
		}
		double soma1=0;
		for(int i = 0; i<n; i++) {
			soma1+= vect[i].getHeight();
		}
		double logica2=0;
		String nomes="";
		for(int i = 0; i<n; i++) {
			if(vect[i].getAge() < 16) {
				logica2+= 1;
				nomes += vect[i].getName();
				nomes += "\n";
			}
		}
		System.out.printf("\nAltura média: %.2f", soma1/n);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", logica2*100/n);
		System.out.printf("\n%s", nomes);
		sc.close();
	}

}