package applications;

import java.util.Scanner;

public class SomaNumerosAteZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = 0; 
		int x = sc.nextInt();
		while(x!= 0) {
			y += x;
			x = sc.nextInt();
		}
		System.out.println(y);
		sc.close();
	}
}