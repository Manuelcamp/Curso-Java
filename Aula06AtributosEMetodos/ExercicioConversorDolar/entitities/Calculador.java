package entitities;

public class Calculador {
	public static double IOF = 0.06;
	public static double Converter(double quantidade, double dollar) {
		return quantidade * dollar * (1.0 + IOF);
	}
}
