
public class Title {

	private int id;
	private String title;
	public Title(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public Title() {
		this.id = 0;
		this.title= null;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Title [id=" + id + ", title=" + title + "]";
	}
	
	

}
