
public class FacultyMember extends Staff{
	private DegreeType degree;
	/**
	 * This method calls all the set methods
	 * @param firstName A string, the first name of the staff
	 * @param lastName A string, the last name of the staff
	 * @param age An integer, the age of the staff
	 * @param staffIDNum An integer, the staff identification number
	 * @param department A DepartmentType, the department the staff is part of 
	 * @param numYears An integer, the number of years the staff has been in the institute
	 * @param degree A DegreeType, the level of training of the staff
	 * @return none
	 * @throws HRException When the values are illegal
	 */
	public FacultyMember(String firstName, String lastName, int age, int staffIDNum, DepartmentType department,
			int numYears, DegreeType degree) throws HRException {
		super(firstName, lastName, age, staffIDNum, department, numYears);
		setDegree(degree);
	}
	/**
	 * This method sets degree
	 * @param degree A DegreeType, the level of training of the staff
	 * @return none 
	 */
	public void setDegree(DegreeType degree) {
		this.degree = degree;
	}
	/**
	 * This method calculates the salary of the faculty member based on their degree
	 * @param none
	 * @return salary A double, the salary the staff receives
	 */
	public double calculatePay() {
		double salary = 0;
		if(degree.equals(DegreeType.BACHELOR)) {
			if(getNumYears() == 0) {
				salary = 53345;
			}
			else if(getNumYears() == 1) {
				salary = 56345;
			}
			else if(getNumYears() == 2) {
				salary = 59345;
			}
			else if(getNumYears() == 3) {
				salary = 63345;
			}
			else if(getNumYears() == 4) {
				salary = 66345;
			}
			else if(getNumYears() == 5) {
				salary = 69345;
			}
			else if(getNumYears() == 6) {
				salary = 73345;
			}
			else if(getNumYears() == 7) {
				salary = 76345;
			}
			else {
				salary = 79345;
			}
			
		}
		else {
			if(getNumYears() == 0) {
				salary = 58567;
			}
			else if(getNumYears() == 1) {
				salary = 62567;
			}
			else if(getNumYears() == 2) {
				salary = 66567;
			}
			else if(getNumYears() == 3) {
				salary = 70567;
			}
			else if(getNumYears() == 4) {
				salary = 74567;
			}
			else if(getNumYears() == 5) {
				salary = 78567;
			}
			else if(getNumYears() == 6) {
				salary = 82567;
			}
			else if(getNumYears() == 7) {
				salary = 87567;
			}
			else {
				salary = 91567;
			}
		}
		return salary;
	}
	/**
	 * This method returns the degree of the staff
	 * @param none
	 * @return degree A DegreeType, the level of training of the staff
	 */
	public DegreeType getDegree() {
		return degree;
	}
	
	@Override
	/**
	 * This method changes all the attributes to a string
	 * @param none
	 * @return statement A string with all the attributes of the Person class
	 */
	public String toString() {
		String statement = ("First Name: " + super.getFirstName() + "\nLast Name: " + super.getLastName() + "\nAge: " + 
							super.getAge() + "\nStaff ID Number: " + super.getStaffIDNum() + "\nDepartment: " + 
							super.getDepartment() + "\nNumber of years: " + super.getNumYears() +"\nDegree Type: " + 
							degree + "\nSalary: " + calculatePay());
		return statement;
	}
	
	
}
