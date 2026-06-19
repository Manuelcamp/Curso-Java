package entidades;

public class PessoaJuridica extends Contribuinte{
	private Integer numberEmployees;

	public PessoaJuridica(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax(){
		if(numberEmployees > 10) {
			return annualIncome * 0.14;
		}
		else {
			return annualIncome * 0.16;
			
		}
	}
}
