
public class EmployeeSalary implements Payment {
	
	private int hourlyPayment;
	private int numberOfHours;	
	
	public EmployeeSalary(int hourlyPayment, int numberOfHours) {
		super();
		this.hourlyPayment = hourlyPayment;
		this.numberOfHours = numberOfHours;
	}


	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return this.hourlyPayment * this.numberOfHours;
	}


	@Override
	public String toString() {
		return "EmployeeSalary [hourlyPayment=" + hourlyPayment + ", numberOfHours=" + numberOfHours
				+ ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}
	
	

}
