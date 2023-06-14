
public interface Borrowable {
	
	public void borrowitem() throws AvailabilityException;

	public void returnitem() throws AvailabilityException;
	
	public boolean isAvaliable();

	public int getid();
}

