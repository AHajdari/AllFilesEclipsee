import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String name;
	public static final int MAX_ON_LOAN = 6;
	private List<Borrowable> onLoan;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		onLoan = new ArrayList <Borrowable>();
		
		}
	
	public void borrows(Borrowable b) throws AvailabilityException, LoanLimitException{
		//if member already has max on Loan, throw an exception
		//if b not available, throw an exception
		
		if(onLoan.size() == MAX_ON_LOAN)
			throw new LoanLimitException("Member " + name + "with id: " + id + "cannot borrow more items at this time");
		
		onLoan.add(b);
		b.borrowitem();
	}
	
	public void returns(Borrowable b) throws AvailabilityException, CannotBeReturnedByMemberException{
		//if b is not actually borrowed by the member, throw an exception
		
		if(!onLoan.contains(b))
			throw new CannotBeReturnedByMemberException("Borrowable with id: " + b.getid() + "cannot be returned by member:" + name + "with id :" + id);
		
		onLoan.remove(b);
		b.returnitem();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
