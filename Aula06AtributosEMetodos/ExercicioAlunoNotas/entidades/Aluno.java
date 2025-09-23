package entidades;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	public double pontos;
	public String toString() {
		media = (nota1 + nota2 + nota3);
		if(media >= 60) {
			return "FINAL GRADE = " + media + "\nPASS";
			}
		else {
			return "FINAL GRADE = " + media + "\nFAILED\nMISSING " + (60 - media) + " POINTS";
		}
	}
}