
public class InvoicePayment implements Payment{
	
	private int id;
	private int quantity;
	private double pricePerItem;
	
	public InvoicePayment(int id, int quantity, double pricePerItem) throws NegativeQuantityExceptioin {
		super();
		this.id = id;
		
		if(quantity <= 0) {
			throw new NegativeQuantityExceptioin("Item with id " + id + " cannot have a negative quantity");
		}else {
			this.quantity = quantity;
		}
		
		
		this.pricePerItem = pricePerItem;
	}
	
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return this.pricePerItem * this.quantity;
	}

}
