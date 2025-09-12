package applications;
import java.util.Locale;
public abstract class PrimeiroContatoComJava {

	public static void main(String[] args) {
		int y = 32;
		double o = 32.6349;
		System.out.print("Bom Dia ");
		System.out.println(y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", o);
	}

}
