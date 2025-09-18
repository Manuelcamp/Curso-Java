package applications;

import java.util.Scanner;

public class ExibirQuadradoCubo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int II = (int) Math.pow(i, 2);
			int III = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d\n", i, II, III);
		}
		sc.close();
	}
}