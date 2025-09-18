package applications;

import java.util.Scanner;

public class ValidacaoSenha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		int senhaUsuario = sc.nextInt();
		while(senha != senhaUsuario) {
			System.out.println("Senha Invalida!");
			senhaUsuario = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
}