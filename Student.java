
public class Student {
	private String name;
	private int registrationNumber;
	private int credits;
	private String levelOfStudies;
	
	public Student(String name, int registrationNumber) {
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.credits = 0;
		this.levelOfStudies = "First Year";
	}
	
	public Student() {
		this.name = "null";
		this.registrationNumber = 0;
		this.credits = 0;
		this.levelOfStudies = "null";
	}
	
	
	
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setLevelOfStudies(String levelOfStudies) {
		this.levelOfStudies = levelOfStudies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getregistrationNumber() {
		return registrationNumber;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public String getlevelOfStudies() {
		return levelOfStudies;
	}
	
	public void passesUnit() {
		credits += 10;
		
	}
	public void nextLevel() {
		if(credits == 100) {
			if(levelOfStudies.equals("First Year")) {
				levelOfStudies = "Second Year";
			}
			else if (levelOfStudies.equals("Second Year")) {
				levelOfStudies = "Third Year";
			}
			else {
				levelOfStudies = "Graduated";
			}
			
		}
		else {
			levelOfStudies = levelOfStudies + "Not enough credits";
		}
	}
	
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", registrationNumber=" + registrationNumber + ", credits=" + credits
				+ ", levelOfStudies=" + levelOfStudies + "]";
	}
	
	
	

}
