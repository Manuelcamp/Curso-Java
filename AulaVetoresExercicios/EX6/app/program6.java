package app;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();
		int[] vect1 = new int[n];
		System.out.print("Digite os valores de A:\n");
		for (int i = 0; i < n; i++) {
			vect1[i] = sc.nextInt();
		}
		int[] vect2 = new int[n];
		System.out.println("Digite os valores de B:");
		for (int i = 0; i < n; i++) {
			vect2[i] = sc.nextInt();
		}
		int[] vect3 = new int[n];
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {
			vect3[i] = vect1[i] + vect2[i];
			System.out.println(vect3[i]);
		}
		sc.close();
	}

}
