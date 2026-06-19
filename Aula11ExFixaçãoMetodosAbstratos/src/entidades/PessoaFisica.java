package entidades;

public class PessoaFisica extends Contribuinte {
	
	private Double healthCare;	
	public PessoaFisica() {		
	}
	
	public PessoaFisica(String name, Double annualIncome, Double healthCare) {
		super(name, annualIncome);
		this.healthCare = healthCare;
	}
	
	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}	

	@Override
	public double tax(){
	return (annualIncome * 0.25) - (healthCare * 0.5);
	}
}
