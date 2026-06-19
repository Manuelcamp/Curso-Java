package applications;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			 double A = sc.nextDouble();
			 double B = sc.nextDouble();
			 double C = sc.nextDouble();
			 double somador = (A * 2 + B * 3 + C*5)/10;
			System.out.printf("%.1f\n", somador);
			}
		sc.close();
	}
	}
