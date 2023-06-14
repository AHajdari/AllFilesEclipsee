
public class PaymentsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllPayments allPayments = new AllPayments();
		try {
			InvoicePayment invPay = new InvoicePayment(123, -4, 16.7);
		} catch (NegativeQuantityExceptioin e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		EmployeeSalary empSal1 = new EmployeeSalary(30, 8);
		EmployeeSalary empSal2 = new EmployeeSalary(25, 5);
		
		allPayments.addPayment(empSal1);
		allPayments.addPayment(empSal2);
		
		allPayments.printAllPayment();
		System.out.println("\nThe TOTAL AMOUNT to be paid to empleyees and for invoices is:");
		System.out.println(allPayments.getTotalPaymentsAmount());
		
		
	}

}
