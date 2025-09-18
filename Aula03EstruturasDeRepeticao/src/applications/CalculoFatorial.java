package applications;

import java.util.Scanner;

public class CalculoFatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fator = 1;
		for (int i = 0; i < n; i++) {
			fator *= (n - i);
		}
		System.out.print(fator);
		sc.close();
	}
}