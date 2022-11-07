
public class Undergraduate extends Student {
	private boolean residence;
	private MajorType major;
	/**
	 * This method calls all the set methods
	 * @param firstName A string, the first name of the student
	 * @param lastName A string, the last name of the student
	 * @param age An integer, the age of the student
	 * @param studentIDnum An integer, the student identification number of the student
	 * @param yearStudy An integer, the year of study of the student
	 * @param numCourses An integer, the number of courses the student is taking
	 * @param scholarship A double, the amount of scholarship the students receives
	 * @param domestic A boolean, if the student is domestic or not domestic
	 * @param residence A boolean, if the student is staying in residence
	 * @param major A MajorType, the major of the student
	 * @throws HRException When the values are illegal
	 */
	public Undergraduate(String firstName, String lastName, int age, int studentIDnum, int yearStudy, 
			int numCourses, double scholarship, boolean domestic, boolean residence, 
			MajorType major) throws HRException{
		
		super(firstName, lastName, age, studentIDnum, yearStudy, numCourses, scholarship, domestic);
		
		setResidence(residence);
		setMajor(major);
	}
	/**
	 * This method sets the residence
	 * @param residence A boolean, true if the student is staying in residence, false otherwise
	 * @return none
	 */
	public void setResidence(boolean residence) {
		this.residence = residence;
	}
	/**
	 * This method returns the major of the student
	 * @param major A MajorType, the major of the student 
	 * @return none
	 */
	public void setMajor(MajorType major) {
		this.major = major;
	}
	
	/**
	 * This method calculates the tuition of the student
	 * @param none
	 * @return tuitionFee A double, the tuition fee of the student
	 */
	public double calculateTuition() {
		double tuitionFee = 0;
		//boolean typeStudent = student.getDomestic();
		if(getDomestic() == true) {
			if(major.equals(MajorType.ENGLISH)) {
				tuitionFee = 9934;
			}
			else if(major.equals(MajorType.COMPUTER_SCIENCE)) {
				tuitionFee = 9619;
			}
			else if(major.equals(MajorType.MATHEMATICS)) {
				tuitionFee = 9567;
			}
			else if(major.equals(MajorType.ENGINEERING)) {
				tuitionFee = 12626;
			}
			else if(major.equals(MajorType.EDUCATION)) {
				tuitionFee = 7037;
			} 
			else if(major.equals(MajorType.MEDICINE)) {
				tuitionFee = 7037;
			}
		}
		else {
			if(major.equals(MajorType.ENGLISH)) {
				tuitionFee = 30263;
			}
			else if(major.equals(MajorType.COMPUTER_SCIENCE)) {
				tuitionFee = 33875;
			}
			else if(major.equals(MajorType.MATHEMATICS)) {
				tuitionFee = 34537;
			}
			else if(major.equals(MajorType.ENGINEERING)) {
				tuitionFee = 29873;
			}
			else if(major.equals(MajorType.EDUCATION)) {
				tuitionFee = 32416;
			} 
			else if(major.equals(MajorType.MEDICINE)) {
				tuitionFee = 32416;
			}
		}
		return tuitionFee;	
	}
	
	/**
	 * This method returns if the student is living in residence 
	 * @param none
	 * @return residence A boolean, true if the student is living on residence, false otherwise
	 */
	public boolean getResidence() {
		return residence;
	}
	/**
	 * This method returns then major of the student
	 * @param none
	 * @return major A MajorType, the major of the student 
	 */
	public MajorType getMajor() {
		return major;
	}
	
	@Override
	/**
	 * This method changes all the attributes to a string
	 * @param none
	 * @return statement A string with all the attributes of the Person class
	 */
	public String toString() {
		String statement = ("First Name: " + super.getFirstName() + "\nLast Name: " + super.getLastName() + "\nAge: " + 
							super.getAge() + "\nStudent ID Number: " + super.getStudentIDnum() + "\nYear of Study: " + 
							super.getYearStudy() + "\nNumber of Courses: " + super.getNumCourses() + "\nScholarship: " + 
							super.getScholarship() + "\nDomestic: " + super.getDomestic() + "\nResidence: " + residence + 
							"\nMajor: " + major + "\nTuition Fee: " + calculateTuition());
		return statement;
	}
		

}
