import java.util.ArrayList;

public class AllPayments {
	
	private ArrayList<Payment> payments;
	
	public AllPayments() {
		this.payments = new ArrayList<Payment>();
	}
	
	public void addPayment(Payment p) {
		payments.add(p);
	}
	
	public void printAllPayment() {
		System.out.println("\nLIST OF ALL PAYMENT");
		for(Payment p : this.payments) {
			System.out.println(p);
		}
	}
	
	public double getTotalPaymentsAmount() {
		double total = 0;
		for(Payment p: this.payments) {
			total += p.getPaymentAmount();
		}
		
		return total;
	}
	
	
}
