package applications;

import java.util.Scanner;

public class ContarNumerosIntervalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int out = 0;
		int in = 0;
		
		for(int i=0; i < N; i++) {
			int valor = sc.nextInt();
			if(valor >= 10 && valor <=20) {
				in += 1;
			}
			else {
				out +=1;
			}
		}
		System.out.printf("%d in\n%d out", in, out);
		sc.close();
	}
}