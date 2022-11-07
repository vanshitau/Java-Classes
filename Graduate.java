
public class Graduate extends Student {
	private double researchFunding;
	private Program studentType;
	
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
	 * @param researchFunding A double, the amount of research funding the student is receiving 
	 * @param studentType A Program, the type of student in the graduate program 
	 * @throws HRException When there are illegal values 
	 */
	public Graduate(String firstName, String lastName, int age, int studentIDnum, int yearStudy, 
			int numCourses, double scholarship, boolean domestic, double researchFunding, Program studentType)
					throws HRException{
		super(firstName, lastName, age, studentIDnum, yearStudy, numCourses, scholarship, domestic);
		setResearchFunding(researchFunding);
		setStudentType(studentType);
	}
	/**
	 * This methods sets research funding
	 * @param researchFunding A double, the amount of research funding the student receives 
	 * @return none
	 * @throws HRException When the research funding is less than 100
	 */
	public void setResearchFunding(double researchFunding) throws HRException {
		if(researchFunding > 1000) {
			this.researchFunding = researchFunding;
		}
		else {
			throw new HRException("Invalid research funding");
		}
	}
	/**
	 * This method sets studentType
	 * @param studentType
	 * @return none
	 */
	public void setStudentType(Program studentType) {
		this.studentType = studentType;
	}
	/**
	 * This method calculates the tuition of the student 
	 * @param none
	 * @return tuitionFee A double, the tuition fee of the student
	 */
	public double calculateTuition() {
		double tuitionFee = 0;
		double grant = getScholarship() + researchFunding;
		if(getDomestic() == true) {
			tuitionFee = 5603.65 - grant;
		}
		else {
			tuitionFee = 8426.27 - grant;
		}
		return tuitionFee;
			
	}
	/**
	 * This method returns the amount of research funding
	 * @param none
	 * @return researchFunding A double, the amount of research funding that the student receives 
	 */
	public double getResearchFunding() {
		return researchFunding;
	}
	/**
	 * This method returns the type of graduate student
	 * @param none
	 * @return studentType A Program, the type of graduate program the student is in
	 */
	public Program gets() {
		return studentType;
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
							super.getScholarship() + "\nDomestic: " + super.getDomestic() +"\nResearch Funding: " + 
							researchFunding + "\nStudent Type: " + studentType + "\nTuition Fee: " + calculateTuition());
		return statement;
	}

}
