
public class StudentProgram {
	public static void main(String [] args) {
		Student s1 = new Student();
		Student s2 = new Student("Arb", 175);
		
		System.out.println(s2.getlevelOfStudies());
		System.out.println(s2.getCredits());
		System.out.println(s2.getName());
		
	}

}
