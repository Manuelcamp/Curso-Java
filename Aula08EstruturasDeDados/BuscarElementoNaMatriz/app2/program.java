package app2;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Main diagonal:\n");
		for(int i = 0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j]<0) {
					count++;
				}
			}
		}
		System.out.println("\nNegative numbers: "+ count);
		sc.close();
	}

}
