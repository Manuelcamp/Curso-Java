package applications;

import java.util.Scanner;

public class PostoCombustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		while (x != 4) {
			if (x == 1) {
				alcool += 1;
				x = sc.nextInt();
			} else {
				if (x == 2) {
					gasolina += 1;
					x = sc.nextInt();
				} else {
					if (x == 3) {
						diesel += 1;
						x = sc.nextInt();
					}
					else { if(x<1 || x>4) {
						x = sc.nextInt();
					}
				}
			}
		}
		}
		System.out.printf("MUITO OBRIGADO!\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
		sc.close();
	}
}