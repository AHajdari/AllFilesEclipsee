import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Title> titles;
	private List <Member> members;
	private List <Borrowable> borrowables;
	
	public Library() {
		titles = new ArrayList<Title>();
		members = new ArrayList<Member>();
		borrowables = new ArrayList<Borrowable>();
	}
	
	public void addTitle(Title title) {
		//if title already exists in the list, throw exception
		titles.add(title);
	}

	public void addBorrowable(Borrowable bor) {
		//if bor already exists in the list, throw an exception
		borrowables.add(bor);
	}
	
	public void addMember(Member member) {
		//if member already exists in the list, throw an exception
		members.add(member);
	}
	
	public void addMember(int id, String name) {
		members.add(new Member(id, name));
	}
	
	
	
	

}