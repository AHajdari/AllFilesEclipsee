
public class BookCopy implements Borrowable{
	private int id;
	private boolean avaliable;
	private Book book;
	
	public BookCopy(int id, Book book) {
		this.id = id;
		this.avaliable = true;
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	public int getId() {
		return id;
	}
	

	
	
	@Override
	public String toString() {
		return "BookCopy [id=" + id + ", avaliable=" + avaliable + ", book=" + book + "]";
	}
	public void bowrrowitem() throws AvailabilityException {
		//if book copy is not available then throw exception
		if(!avaliable)//same as available == false
			throw new AvailabilityException("This book copy " + id + ", which is a copy of " +book.getTitle() + "is not avaliable to borrow");
		
		this.avaliable = false;
	}
	
	public void returnitem() throws AvailabilityException {
		//if book copy is already available then throw exception
		if(avaliable = true)
			throw new AvailabilityException("This book copy " + id + ", which is a copy of " +book.getTitle() + "is already returned");
	}
	
	public boolean isAvaliable() {
		return true;
	}
	
	public int getid() {
		return id;
	}
	@Override
	public void borrowitem() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

}
