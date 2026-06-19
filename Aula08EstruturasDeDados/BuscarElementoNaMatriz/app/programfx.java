package app;

import java.util.Scanner;

public class programfx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int j = sc.nextInt();
		int[][] mat = new int[n][j];
		for(int i=0; i<n; i++) {
			for(int m = 0; m<j; m++) {
				mat[i][m] = sc.nextInt();
			}
		}
	int u = sc.nextInt();
	for(int i=0; i<n; i++) {
		for(int m = 0; m<j; m++) {
			if(mat[i][m] == u) {
				System.out.println("Position: " + i + "," + m);
			if(i>0) {
				System.out.println("Up: " + mat[i-1][m]);
			}
			if(m>0) {
				System.out.println("Left: " + mat[i][m-1]);
			}
			if(m < mat[i].length - 1) {
				System.out.println("Right " + mat[i][m+1]);
			}
			if(i < mat.length - 1)
				System.out.println("Down: " + mat[i+1][m]);
			}

			}
		}
	
	sc.close();
	}

}
