//abstract class
public abstract class Student extends Person {
	private int studentIDnum;
	private int yearStudy;
	private int numCourses;
	private double scholarship;
	private boolean domestic;
	/**
	 * This method calls all the set methods
	 * @param firstName A string, the first name of the person
	 * @param lastName A string, the last name of the person
	 * @param age An integer, the age of the person
	 * @param studentIDnum An integer, the student identification number of the student
	 * @param yearStudy An integer, the year of study of the student
	 * @param numCourses An integer, the number of courses the student is taking
	 * @param scholarship A double, the amount of scholarship the students receives
	 * @param domestic A boolean, if the student is domestic or not domestic
	 * @return none
	 * @throws HRException When there are illegal values
	 */
	public Student(String firstName, String lastName, int age, int studentIDnum, int yearStudy, 
			int numCourses, double scholarship, boolean domestic) throws HRException{
		super(firstName, lastName, age);
		setStudentIDnum(studentIDnum);
		setYearStudy(yearStudy);
		setNumCourses(numCourses);
		setScholarship(scholarship);
		setDomestic(domestic);
		
	}
	/**
	 * This method sets the student identification number
	 * @param studentIDnum An integer, the student identification number of the student
	 * @return none
	 */
	public void setStudentIDnum(int studentIDnum) {
		this.studentIDnum = studentIDnum;
	}
	/**
	 * This method sets the year of study
	 * @param yearStudy An integer, the year of study of the student
	 * @return none
	 * @throws HRException When the year of study is less than 0 and grater than 10
	 */
	public void setYearStudy(int yearStudy) throws HRException {
		if(yearStudy >= 0 && yearStudy < 10) {
			this.yearStudy = yearStudy;
		}
		else {
			throw new HRException("Invalid year");
		}
	}
	/**
	 * This method sets the number of courses
	 * @param numCourses An integer, the number of courses the student is taking
	 * @return none
	 * @throws HRException When the number of courses is less than 0 and greater than 6
	 */
	public void setNumCourses(int numCourses) throws HRException {
		if(numCourses > 0 && numCourses < 6) {
			this.numCourses = numCourses;
		}
		else {
			throw new HRException("Invalid number of courses");
		}
		
	}
	/**
	 * This method sets the scholarship
	 * @param scholarship A double, the amount of scholarship the student receives
	 * @return none
	 * @throws HRException When the scholarship is less than 60000 and greater than 120000
	 */
	public void setScholarship(double scholarship) throws HRException {
		if(scholarship > 60000 && scholarship < 120000) {
			this.scholarship = scholarship;
		}
		else {
			throw new HRException("Invalid scholarship");
		}
	}
	/**
	 * This method sets domestic to true or false
	 * @param domestic A boolean, true if the student is domestic, false if the student is international
	 * @return none
	 */
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
		
	}
	// This is an abstract method to calculate the tuition 
	public abstract double calculateTuition();
	
	/**
	 * This method returns the student identification number of the student
	 * @param none
	 * @return studentIDnum An integer, the student identification number of the student
	 */
	public int getStudentIDnum() {
		return studentIDnum;
	}
	/**
	 * This method returns the year of study of the student
	 * @param none
	 * @return yearStudy An integer, the year of study of the student
	 */
	public int getYearStudy() {
		return yearStudy;
	}
	/**
	 * This method returns the number of courses the student is taking
	 * @param none
	 * @return numCourses An integer, the number of courses the student is taking
	 */
	public int getNumCourses() {
		return numCourses;
	}
	/**
	 * This method returns the scholarship that the student receives 
	 * @param none
	 * @return scholarship A double, the amount of scholarship the student receives
	 */
	public double getScholarship() {
		return scholarship;
	}
	/**
	 * This method returns true if the student is domestic, false otherwise
	 * @param none
	 * @return domestic A boolean, true if the student is domestic, false if the student is international
	 */
	public boolean getDomestic() {
		return domestic;
	}

	@Override
	/**
	 * This method changes all the attributes to a string
	 * @param none
	 * @return statement A string with all the attributes of the Person class
	 */
	public String toString() {
		String statement = ("Student ID Number: " + studentIDnum + "\nYear of Study: " + yearStudy + 
				"\nNumber of Courses: " + numCourses + "\nScholarship: " + scholarship + "\nDomestic: " +
				domestic);
		return statement;
	}
}


