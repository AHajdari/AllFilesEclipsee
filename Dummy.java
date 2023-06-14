
public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book(100, "1984", "George Orwell");
		Journal j = new Journal(101, "Artificial Intelligence", "Arb");
		Member m = new Member(200, "Ioanna");
		
		BookCopy bc1 = new BookCopy(1001, b);
		BookCopy bc2 = new BookCopy(1002, b);
		System.out.println("Book copies info:");
		System.out.println(bc1);
		System.out.println(bc2);
		
		System.out.println("\n\nBook info:");
		System.out.println(b);
		
		System.out.println(j);
		System.out.println(m);
		
		
		
		

	}

}
